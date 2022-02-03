package file_handling;

import java.io.*;

public class MoveFile {
    public static void main(String[] args) {

        String sourceFile = "F:\\OOAD-notes.pdf";

        File file = new File(sourceFile);
        String destinationFile = "F:\\mycollection\\" + file.getName();

     if (file.exists()){

         try {

             FileReader fileReader =new FileReader(file);
             int read = fileReader.read();
             System.out.println(read);

             FileWriter fileWriter=new FileWriter(destinationFile);

             BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(sourceFile));

//             while ((read=fileWriter.write())!=-1){
//
//
//             }




         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }

     }
     else
         System.out.println("File not found");


    }

}
