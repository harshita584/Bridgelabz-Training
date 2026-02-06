package com.streamapi;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionLogger {
    public static void main(String[] args) {
        List<String> transactionIds = List.of("Tran1", "Tran2", "Tran3");

        transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " Transaction id : " + id));
    }
}
