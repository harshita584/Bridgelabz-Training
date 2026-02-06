package com.streamapi.filtermembership;

import java.time.LocalDate;
import java.util.List;

public class FilterMemberships {
    public static void main(String[] args) {
        List<Member> members = List.of(
                new Member("A", LocalDate.now().plusDays(10)),
                new Member("B", LocalDate.now().plusDays(40)),
                new Member("C", LocalDate.now().plusDays(25)),
                new Member("D", LocalDate.now().plusDays(5))
        );

        members.stream()
                .filter(m -> m.expiryDate.isBefore(LocalDate.now().plusDays(30)))
                .forEach(m -> System.out.println(m.name));
    }
}

