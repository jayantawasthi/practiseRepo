package file_handling;

import java.io.*;

public class PdfCopy {
    public static void main(String[] args) throws IOException {

        String filePath="F:\\test\\OOAD-notes.pdf";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(new File("F:\\mycollection\\fileData1.pdf"));


            int i=0;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           fileInputStream.close();
           fileOutputStream.close();
        }


    }
}
