package file_handling;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class VideosCopy {
    public static void main(String[] args) throws IOException {

        File file =new File("F:\\test\\video.mp4");

        ArrayList Arraylist = new ArrayList();

        String destintionFile = "F:\\mycollection\\"+ file.getName();

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
