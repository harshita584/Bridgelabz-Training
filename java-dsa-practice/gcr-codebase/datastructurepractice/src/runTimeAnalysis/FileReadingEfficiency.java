package runTimeAnalysis;

import java.io.*;

public class FileReadingEfficiency {

    private static final String FILE_PATH = "C:/Users/modis/Desktop/BridgeLabz-Training/java-dsa-practice/gcr-codebase/JavaDsaConcepts/src/runtimeanalysis/file.txt";
    private static final int BUFFER_SIZE = 8192;

    //  FileReader 
    public static void readUsingFileReader() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            char[] buffer = new char[BUFFER_SIZE];
            while (reader.read(buffer) != -1) {
                // reading characters in chunks
            }
        }
    }

    // InputStreamReader 
    public static void readUsingInputStreamReader() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH)))) {
            char[] buffer = new char[BUFFER_SIZE];
            while (reader.read(buffer) != -1) {
                // reading bytes and decoding to characters in chunks
            }
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Large File Reading Performance Comparison\n");

            long startFileReader = System.nanoTime();
            readUsingFileReader();
            long endFileReader = System.nanoTime();

            long startInputStreamReader = System.nanoTime();
            readUsingInputStreamReader();
            long endInputStreamReader = System.nanoTime();

            double fileReaderTime = (endFileReader - startFileReader) / 1_000_000.0;
            double inputStreamReaderTime = (endInputStreamReader - startInputStreamReader) / 1_000_000.0;

            System.out.println("FileReader Time: " + fileReaderTime + " ms");
            System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}