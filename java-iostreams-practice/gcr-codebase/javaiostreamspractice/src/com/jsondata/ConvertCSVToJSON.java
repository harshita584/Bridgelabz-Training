package com.jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONArray;
import org.json.JSONObject;

public class ConvertCSVToJSON {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("employees.csv"))){
			String line = reader.readLine();
			String[] headers = line.split(",");
			JSONArray result = new JSONArray();
			
			while((line = reader.readLine()) != null) {
				String[] values = line.split(",");
				JSONObject jsonObject = new JSONObject();
				int i = 0;
				
				for(String header : headers) {
					jsonObject.put(header, values[i]);
				}
				result.put(jsonObject);
			}
			System.out.println(result.toString());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
