package runTimeAnalysis;
import java.util.*;

public class DataStructureComparison {
    public static void main(String[] args) {

        int N = 1_000_000;   
        int target = N - 1;

        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array Search
        long startArray = System.nanoTime();
        boolean foundArray = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                foundArray = true;
                break;
            }
        }
        long endArray = System.nanoTime();

        // HashSet Search
        long startHashSet = System.nanoTime();
        boolean foundHashSet = hashSet.contains(target);
        long endHashSet = System.nanoTime();

        // TreeSet Search
        long startTreeSet = System.nanoTime();
        boolean foundTreeSet = treeSet.contains(target);
        long endTreeSet = System.nanoTime();

        System.out.println("Dataset Size: " + N);
        System.out.println("Array Search Found: " + foundArray + ", Time: " + (endArray - startArray) / 1000000.0 + " ms");
        System.out.println("HashSet Search Found: " + foundHashSet + ", Time: " + (endHashSet - startHashSet) / 1000000.0 + " ms");
        System.out.println("TreeSet Search Found: " + foundTreeSet + ", Time: " + (endTreeSet - startTreeSet) / 1000000.0 + " ms");
    }
}