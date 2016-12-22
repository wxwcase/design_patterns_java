package com.wxwcase.decorator_pattern.io;

import java.io.*;

/**
 * Created by wwang on 12/22/2016.
 */
public class InputTest {

    public static void main(String[] args) throws IOException {

        int c;

        try {

            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")
                            )
                    );

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();

        } catch (IOException e) {
            System.out.println(new File(".").getAbsoluteFile());
            e.printStackTrace();
        }
    }
}
