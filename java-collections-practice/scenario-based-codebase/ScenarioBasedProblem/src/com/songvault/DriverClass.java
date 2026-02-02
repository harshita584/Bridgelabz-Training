package com.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Stream;

public class DriverClass {
    public static void main(String[] args) {
        File folder = new File("songs");

        if(!folder.exists() || !folder.isDirectory()) {
            System.out.println("Song folder not found");
            return;
        }

        List<Song> songList = new ArrayList<>();
        Map<String, List<Song>> genreMap = new HashMap<>();
        Set<String> artists = new HashSet<>();

        Pattern titleP = Pattern.compile("Title:\\s*(.*)");
        Pattern artistP = Pattern.compile("Artist:\\s*(.*)");
        Pattern durationP = Pattern.compile("Duration:\\s*(.*)");
        Pattern genreP = Pattern.compile("Genre:\\s*(.*)");

        for(File file : folder.listFiles()) {
            if(!file.getName().endsWith(".txt")) continue;

            try(BufferedReader br = new BufferedReader(new FileReader(file))) {

                String title = null;
                String artist = null;
                String duration = null;
                String genre = null;
                String line;

                while((line = br.readLine()) != null) {

                    Matcher m;

                    m = titleP.matcher(line);
                    if(m.find()) title = m.group(1);

                    m = artistP.matcher(line);
                    if(m.find()) artist = m.group(1);

                    m = durationP.matcher(line);
                    if(m.find()) duration = m.group(1);

                    m = genreP.matcher(line);
                    if(m.find()) genre = m.group(1);
                }

                if(title != null && artist != null && genre != null) {

                    Song song = new Song(title, artist, duration, genre);
                    songList.add(song);
                    artists.add(artist);

                    if(!genreMap.containsKey(genre))  genreMap.put(genre, new ArrayList<>());
                    genreMap.get(genre).add(song);
                }

            }
            catch(IOException e) {
                System.out.println("Error reading: " + file.getName());
            }
        }

        System.out.println(songList);

        for(String g : genreMap.keySet()) {
            System.out.println(g + "  " + genreMap.get(g));
        }

        System.out.println(artists);

        System.out.println("Sorted Songs By Title:");
        Stream<Song> stream = songList.stream().sorted(Comparator.comparing(s -> s.toString()));
        stream.forEach((song) -> System.out.println(song));
    }
}
