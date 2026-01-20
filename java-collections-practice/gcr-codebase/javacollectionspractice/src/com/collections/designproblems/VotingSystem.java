package com.collections.designproblems;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteCount = new HashMap<>();
    private Map<Integer, String> voteOrder = new LinkedHashMap<>();
    private int vote = 1;

    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(vote++, candidate);
    }

    public void displayVoteOrder() {
        System.out.println("Vote Order : ");
        for (int key : voteOrder.keySet()) {
            System.out.println(key + " " + voteOrder.get(key));
        }
    }

    public void displaySortedResults() {
        System.out.println("Results :");

        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);
        
        for (String key : sortedResults.keySet()) {
            System.out.println(key + " " + sortedResults.get(key) + " votes");
        }
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");

        system.displayVoteOrder();
        system.displaySortedResults();
    }
}
