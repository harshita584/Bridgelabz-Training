package runTimeAnalysis;

public class StringConcatenationPerformance {

    public static void main(String[] args) {

        int N = 100000;   
        String sample = "xyz";

        // String
        long startString = System.nanoTime();
        String str = "";
        for (int i = 0; i < N; i++) {
            str = str + sample;   
        }
        long endString = System.nanoTime();

        // StringBuilder 
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(sample);   
        }
        long endBuilder = System.nanoTime();

        // StringBuffer 
        long startBuffer = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sf.append(sample); 
        }
        long endBuffer = System.nanoTime();

        System.out.println("Operations Count: " + N);
        System.out.println("String Time: " + (endString - startString) / 1000000.0 + " ms");
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) / 1000000.0 + " ms");
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) / 1000000.0 + " ms");
    }
}