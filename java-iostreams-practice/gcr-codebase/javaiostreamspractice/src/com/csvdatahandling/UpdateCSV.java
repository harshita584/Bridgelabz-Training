package com.csvdatahandling;

import java.io.*;

public class UpdateCSV {
    public static void main(String[] args) {

        try (
            BufferedReader reader = new BufferedReader(new FileReader("employees.csv"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("updatedemployees.csv"))
        ) {
            String line;

            writer.write(reader.readLine());
            writer.newLine();

            while ((line = reader.readLine()) != null) {
                String[] employee = line.split(",");
                
                String department = employee[2];
                int salary = Integer.parseInt(employee[3]);
                
                if(department.equals("IT")) employee[3] = "" + (salary + salary * 0.10);
                writer.write(employee[0] + "," + employee[1] + "," + employee[2] + "," + employee[3]);
                writer.newLine();
            }
        }
        catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}