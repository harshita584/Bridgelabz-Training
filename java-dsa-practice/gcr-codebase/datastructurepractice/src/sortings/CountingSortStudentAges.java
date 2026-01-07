package sortings;

public class CountingSortStudentAges {

    public static void main(String[] args) {

        int[] ages = {12, 15, 10, 14, 18, 11, 13, 15, 10};

        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;

        int[] count = new int[range];

        // store frequency of each age
        for (int i = 0; i < ages.length; i++) {
            count[ages[i] - minAge]++;
        }

        // modify the original array
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                ages[index] = i + minAge;
                index++;
                count[i]--;
            }
        }

        // display sorted ages
        System.out.println("Student ages in ascending order:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
    }
}
