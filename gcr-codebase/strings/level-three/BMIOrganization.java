import java.util.Scanner;

public class BMIOrganization {

    // method for calculating BMI
    public static String [][] calculateBMI(double weight,double height){
        String [][]bmiAndStatus=new String[1][2];
        for (int i = 0; i < bmiAndStatus.length; i++) {
            double bmi=weight/((height*height)/10000);
            bmiAndStatus[i][0]="BMI is "+bmi;
            if (bmi <= 18.5) bmiAndStatus[i][1] = "status is Underweight";
            else if (bmi <=24.9) bmiAndStatus[i][1] = "status is Normal";
            else if (bmi <= 39.9) bmiAndStatus[i][1] = "status is Overweight";
            else bmiAndStatus[i][1] = "status is Obese";
        }
        return bmiAndStatus;
    }

    // method for calling the calculate BMI method 
    public static String[][] callCalculateBMI(double [][]weightHeight){
        String [][]weightHeightBMIStatus=new String[10][4];
        String [][]bmiStatus=new String[1][2];
        for (int i = 0; i < weightHeight.length; i++) {
            weightHeightBMIStatus[i][0]="weight is "+weightHeight[i][0];
            weightHeightBMIStatus[i][1]="height is "+weightHeight[i][1];
            bmiStatus=BMIOrganization.calculateBMI(weightHeight[i][0], weightHeight[i][1]);
            weightHeightBMIStatus[i][2]=bmiStatus[0][0];
            weightHeightBMIStatus[i][3]=bmiStatus[0][1];
            
        }
        return weightHeightBMIStatus;
        
    }
    // method for display members Weight Height BMI and Status
    public static void display(String result[][]){
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n",
                              (i + 1),
                              result[i][0],
                              result[i][1],
                              result[i][2],
                              result[i][3]);
        }
    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double [][]weightHeight=new double[10][2];
        
        System.out.println("Enter Weight and Height for 10 Members of organization ");

        for (int i = 0; i < weightHeight.length; i++) {
            System.out.println("enter weight for member"+(i+1)+" : ");
            weightHeight[i][0]=scanner.nextDouble();
            System.out.println("Enter height for member"+(i+1)+" : ");
            weightHeight[i][1]=scanner.nextDouble();
        }
        String [][]result=new String[10][4];
        result=BMIOrganization.callCalculateBMI(weightHeight);
        BMIOrganization.display(result);

        scanner.close();
    }
}