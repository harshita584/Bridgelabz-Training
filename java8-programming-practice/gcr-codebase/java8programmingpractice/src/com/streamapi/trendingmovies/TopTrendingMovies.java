package com.streamapi.trendingmovies;

import java.util.List;

public class TopTrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("Movie1", 9, 2024),
                new Movie("Movie2", 8, 2023),
                new Movie("Movie3", 7, 2022),
                new Movie("Movie4", 9, 2023),
                new Movie("Movie5", 8, 2024),
                new Movie("Movie6", 6, 2024)
        );

        movies.stream()
                .filter(m -> m.year >= 2023)
                .sorted((a, b) -> b.rating - a.rating)
                .limit(5)
                .forEach(m -> System.out.println(m.name));
    }
}
