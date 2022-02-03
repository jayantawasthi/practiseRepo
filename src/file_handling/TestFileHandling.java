package file_handling;

import java.io.*;
import java.util.stream.Stream;

public class TestFileHandling {

    public static void main(String[] args) throws IOException {


        String sourceFilePath = "F:\\OOAD-notes.pdf";
        String destintionFile = "F:\\mycollection\\hi.pdf";

        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
           fileInputStream=new FileInputStream(sourceFilePath);

           fileOutputStream =new FileOutputStream(destintionFile);

           int i=0;
           while ((i=fileInputStream.read())!=-1){
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
