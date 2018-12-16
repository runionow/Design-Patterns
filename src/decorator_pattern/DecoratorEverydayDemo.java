package decorator_pattern;

import java.io.*;

public class DecoratorEverydayDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("output.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        OutputStream oStream = null;
        try {
            oStream = new FileOutputStream(file);
        } catch(Exception e) {
            System.out.println("Unable to generate file");
        }

        DataOutputStream doStream = new DataOutputStream(oStream);


        doStream.close();
        oStream.close();
    }
}
