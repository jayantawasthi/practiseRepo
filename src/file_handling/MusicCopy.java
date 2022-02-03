package file_handling;

import java.io.*;

public class MusicCopy {
    public static void main(String[] args) throws IOException {

        File sourceFilePath = new File("F:\\music.mp3");

        String destintionFile = "F:\\mycollection\\junili.mp3";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(sourceFilePath);

            fileOutputStream = new FileOutputStream(destintionFile);

            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {

            if (sourceFilePath.delete()) {
                System.out.println("file deleted successfully");
            } else
                System.out.println("file not deleted ");

            fileInputStream.close();
            fileOutputStream.close();

        }
    }
}
