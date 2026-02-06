package com.collectors.studentresultgrouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStudent {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("A", "Grade1"),
                new Student("B", "Grade2"),
                new Student("C", "Grade1"),
                new Student("D", "Grade2"),
                new Student("E", "Grade3")
        );

        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                s -> s.grade,
                                Collectors.mapping(s -> s.name, Collectors.toList())
                        ));

        result.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
