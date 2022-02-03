package file_handling;

import java.io.*;

public class PhotoCopy {
    public static void main(String[] args) throws IOException {
//        String sourceFilePath = "F:\\hello.jpg";
        File file =new File("F:\\test\\hello.jpg");

        String destintionFile = "F:\\mycollection\\hello.jpg";

        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream=new FileInputStream(file);

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
            if (file.delete())
                System.out.println("file deleted");
            else
                System.out.println("file deleted");

            fileInputStream.close();
            fileOutputStream.close();

        }
    }
}
