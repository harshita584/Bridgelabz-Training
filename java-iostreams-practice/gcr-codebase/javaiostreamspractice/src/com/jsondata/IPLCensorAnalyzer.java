package com.jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.JSONArray;
import org.json.JSONObject;

public class IPLCensorAnalyzer {
	private static void censorJson() {
        try (BufferedReader br = new BufferedReader(new FileReader("ipldata.json"))) {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            JSONArray input = new JSONArray(sb.toString());
            JSONArray output = new JSONArray();

            for (int i = 0; i < input.length(); i++) {
                JSONObject obj = input.getJSONObject(i);
                
                String team1 = obj.getString("team1");
                String team2 = obj.getString("team2");
                
                String t1 = maskTeam(team1);
                String t2 = maskTeam(team2);

                obj.put("team1", t1);
                obj.put("team2", t2);
                
                obj.put("winner", maskTeam(obj.getString("winner")));
                obj.put("player_of_match", "REDACTED");

                JSONObject score = obj.getJSONObject("score");
                JSONObject newScore = new JSONObject();

                newScore.put(t1, score.getInt(team1));
                newScore.put(t2, score.getInt(team2));

                obj.put("score", newScore);

                output.put(obj);
            }

            FileWriter fw = new FileWriter("censoreddata.json");
            fw.write(output.toString(2));
            fw.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void censorCsv() {
        try (BufferedReader br = new BufferedReader(new FileReader("ipldata.csv"));
            FileWriter fw = new FileWriter("censoreddata.csv")
        ) {

            String line = br.readLine();
            fw.write(line);
            fw.write("\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                data[1] = maskTeam(data[1]);
                data[2] = maskTeam(data[2]);
                data[5] = maskTeam(data[5]);
                data[6] = "REDACTED";

                fw.write(String.join(",", data));
                fw.write("\n");
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static String maskTeam(String team) {
        String[] p = team.split(" ");
        return p[0] + " ***";
    }
    
    public static void main(String[] args) {
        censorJson();
        censorCsv();
    }
}
