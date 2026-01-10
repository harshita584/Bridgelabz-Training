package medistore;

import java.io.DataOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class MediStore {
  public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Tablet t1=new Tablet("Peracetamol", 32, "2026-7-16", 20, "Preserved");
	Syrup s1=new Syrup("Aspira", 90, "2027-05-12", 100, "Liqui");
	LocalDate openingDate =LocalDate.parse("2026-09-11");
	Injection i1=new Injection("Anesthesia", 4500, "2026-09-13",openingDate, 10, "liquid");
	System.out.println(t1);
	System.out.println(s1);
	System.out.println(i1);
}
}
