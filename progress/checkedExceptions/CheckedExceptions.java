package progress.checkedExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        System.out.println("We are attempting to read a text file.");

        System.out.println(readFileOne());
        try {
            System.out.println(readFileTwo());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finished reading file two!");
        }
        System.out.println("The file two was read!");
    }


    public static String readFileOne() {
        String fileText = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("C:/project-automation-testing/progress/checkedExceptions/dataFiles/fileOn"));
            while (fileInputStream.available() != 0) {
                fileText += (char) fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception!");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
        finally {
            System.out.println("Finished reading file one!");
        }
        return fileText;
    }

    public static String readFileTwo() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:/project-automation-testing/progress/checkedExceptions/dataFiles/fileTwo");
        String fileText = "";

        while (fileInputStream.available() != 0) {
            fileText += (char) fileInputStream.read();
        }
        return fileText;
    }

}