package com.collectors.bookstatistics;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryBookStatistics {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Genere1", 300),
                new Book("Genere1", 500),
                new Book("Genere2", 250),
                new Book("Genere2", 400),
                new Book("Genere3", 350)
        );

        Map<String, IntSummaryStatistics> stats = books.stream()
                        .collect(Collectors.groupingBy(
                                b -> b.genre,
                                Collectors.summarizingInt(b -> b.pages)
                        ));

        stats.forEach((k, v) ->
                System.out.println(k + " " + v.getSum() + " " + v.getAverage() + " " + v.getMax())
        );
    }
}
