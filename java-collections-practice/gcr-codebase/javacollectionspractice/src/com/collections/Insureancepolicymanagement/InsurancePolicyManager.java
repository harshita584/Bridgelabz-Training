package com.collections.Insureancepolicymanagement;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {
    Map<Integer, Policy> policyMap = new HashMap<>();
    Map<Integer, Policy> insertionOrderMap = new LinkedHashMap<>();
    TreeMap<LocalDate, List<Policy>> expiryMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        insertionOrderMap.put(policy.policyNumber, policy);

        if(!expiryMap.containsKey(policy.expiryDate)) expiryMap.put(policy.expiryDate, new ArrayList<>());
        expiryMap.get(policy.expiryDate).add(policy);
    }

    Policy getPolicy(int policyNumber) {
        return policyMap.get(policyNumber);
    }

    public void policiesExpiringSoon() {
        LocalDate next30 = LocalDate.now().plusDays(30);

        for(int key : policyMap.keySet()) {
        	Policy policy = policyMap.get(key);
        	if(policy.expiryDate.isBefore(next30)) System.out.println(policy);
        }
    }

    public void policiesByHolder(String name) {
        for (Policy p : policyMap.values()) {
            if (p.policyHolderName.equalsIgnoreCase(name)) System.out.println(p);
        }
    }

    public void removeExpiredPolicies() {
    	List<LocalDate> toRemoveDates = new ArrayList<>();
        for(LocalDate key : expiryMap.keySet()) {
        	if(LocalDate.now().isBefore(key)) break;
        	toRemoveDates.add(key);
        }
        
        for(LocalDate date : toRemoveDates) expiryMap.remove(date);
        
        List<Integer> toRemoveKeys = new ArrayList<>();
        for(int key : policyMap.keySet()) {
        	if(policyMap.get(key).expiryDate.isBefore(LocalDate.now())) {
        		toRemoveKeys.add(key);
        	}
        }
        
        for(int key : toRemoveKeys) {
        	policyMap.remove(key);
    		insertionOrderMap.remove(key);
        }
    }
    
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new Policy(101, "John", LocalDate.now().plusDays(10), "Health"));
        manager.addPolicy(new Policy(102, "Rick", LocalDate.now().plusDays(40), "Car"));
        manager.addPolicy(new Policy(103, "Harry", LocalDate.now().minusDays(2), "Life"));

        System.out.println("Get Policy 101:");
        System.out.println(manager.getPolicy(101));

        System.out.println("Policies expiring in 30 days:");
        manager.policiesExpiringSoon();

        System.out.println("Policies for Rahul:");
        manager.policiesByHolder("Rahul");

        System.out.println("Removing expired policies");
        manager.removeExpiredPolicies();

        System.out.println("Remaining Policies:");
        for (Policy p : manager.policyMap.values()) {
            System.out.println(p);
        }
    }
}
