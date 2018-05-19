package Stroreware;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class CalculatorReader {
    private static BufferedReader fileInputStream;
    private static ArrayDeque arrayDeque = new ArrayDeque();

    public static ArrayDeque getArrayDeque(String targetFile) {
        boolean noMoreTokens = false;
        StringTokenizer stringTokenizer;

        try {
            String current = new java.io.File(".").getCanonicalPath();
            System.out.println("Current dir:" + current);

            fileInputStream = new BufferedReader(new FileReader(targetFile));

            while (!noMoreTokens) {
                try {
                    String line = fileInputStream.readLine();
                    stringTokenizer = new StringTokenizer(line);
                    if (!stringTokenizer.hasMoreTokens()) noMoreTokens = true;

                    while (stringTokenizer.hasMoreTokens()) {
                        arrayDeque.offerFirst(line);
                        line = fileInputStream.readLine();
                        stringTokenizer = new StringTokenizer(line);
                    }
                } catch (NullPointerException ex) {
                    noMoreTokens = true;
                }
            }

            fileInputStream.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }

        return arrayDeque;
    }
}
