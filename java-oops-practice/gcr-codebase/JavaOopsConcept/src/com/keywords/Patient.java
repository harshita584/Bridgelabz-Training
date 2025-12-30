package com.keywords;

public class Patient {

    // common hospital name for all patients
    static String hospitalName;
    static int totalPatients = 0;

    // instance variables
    final String patientID;   // unique id, cannot be changed
    String name;
    int age;
    String ailment;

    // constructor
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // set hospital name
    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    // get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // display patient details
    public void displayPatientDetails() {

        // checking object using instanceof
        if (this instanceof Patient) {
            System.out.println("Hospital Name : " + hospitalName);
            System.out.println("Patient ID : " + patientID);
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Ailment : " + ailment);
        }
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public String getPatientID() {
        return patientID;
    }

    public static void main(String[] args) {

        // set hospital name
        Patient.setHospitalName("City Hospital");

        // create patient objects
        Patient p1 = new Patient("Sonam", 30, "Flu", "P001");
        Patient p2 = new Patient("Naitik", 45, "Fracture", "P002");

        // display total patients
        System.out.println("Total Patients : " + Patient.getTotalPatients());
        System.out.println();

        // display details
        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
    }
}

