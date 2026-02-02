package com.medwarehouse;

import java.time.LocalDate;
import java.util.*;

public class SortMedicine {
	public static List<Medicine> merge(List<Medicine> medicinesList1, List<Medicine> medicinesList2){
		List<Medicine> result = new ArrayList<Medicine>();
		
		int i = 0;
		int j = 0;
		int n = medicinesList1.size();
		int m = medicinesList2.size();
		
		while(i < n && j < m) {
			if(medicinesList1.get(i).expiryDate.isBefore(medicinesList2.get(j).expiryDate)) {
				result.add(medicinesList1.get(i++));
			}
			else result.add(medicinesList2.get(j++));
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Medicine> medicinesList1 = Arrays.asList(new Medicine("Medicine 1", LocalDate.of(2027, 1, 15)),
				new Medicine("Medicine 2", LocalDate.of(2027, 2, 15)),
				new Medicine("Medicine 3", LocalDate.of(2027, 3, 1))
			);
		
		List<Medicine> medicinesList2 = Arrays.asList(new Medicine("Medicine 4", LocalDate.of(2026, 7, 15)),
				new Medicine("Medicine 5", LocalDate.of(2026, 8, 1)),
				new Medicine("Medicine 6", LocalDate.of(2027, 3, 1))
			);
		
		List<Medicine> medicines = merge(medicinesList1, medicinesList2);
		System.out.println(medicines);
		
		List<Medicine> medicinesList3 = Arrays.asList(new Medicine("Medicine 7", LocalDate.of(2026, 6, 15)),
				new Medicine("Medicine 8", LocalDate.of(2026, 8, 20)),
				new Medicine("Medicine 9", LocalDate.of(2027, 3, 10))
			);
		
		medicines = merge(medicines, medicinesList3);
		System.out.println(medicines);
	}
}
