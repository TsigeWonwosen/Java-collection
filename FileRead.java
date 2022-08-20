import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

    public static void getFile() throws IOException {
        //String fileName = "/home/wonde/Desktop/JavaProject/hello world/src/File/wonde.txt";
        String fileName = "./File/wonde.txt";
        
        File textFile = new File(fileName);
        
if (textFile.exists()) {
      System.out.println("File name: " + textFile.getName());
      System.out.println("Absolute path: " + textFile.getAbsolutePath());
      System.out.println("Writeable: " + textFile.canWrite());
      System.out.println("Readable " + textFile.canRead());
      System.out.println("File size in bytes " + textFile.length());
    } else {
      System.out.println("The file does not exist.");
    }
        System.out.println("**** ");
        // System.out.println("Read value: " + textFile);
        // System.out.println(textFile.getAbsolutePath());
     
        Scanner in = new Scanner(textFile);
        FileReader file = new FileReader(textFile);
        BufferedReader br = new BufferedReader(file);

        if(file.ready()){
          System.out.println("File Reader : \n  " + textFile.toString());

        }else{
        System.out.println("File Not Exit.");
        }
        int count = 1;

        int value = in.nextInt();
       System.out.println("Read value: " + value);
       
       in.nextLine();
              
        while (in.hasNextLine()) {
          String data = in.nextLine();
          String data2 = br.readLine();
        System.out.println(count + " : "+ data2 );
        count++;
      }
        
      in.close();
         file.close();
    
    }
    
}
