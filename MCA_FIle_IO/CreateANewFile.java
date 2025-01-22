import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// jfsjffsjfkjsdhf
public class CreateANewFile {
    public static void main(String[] args) {
        // File f = new File("Jaf.mkdir();vaFolder/temp2.txt");
        try {
            FileWriter fw = new FileWriter("temp.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("My name is Satish");
            // fw.write("This is Java RDEC MCA Lab");
            // fw.close();
            bw.close();
            System.out.println("Data written succesfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // f.delete();
        // f.mkdir();

        // System.out.println("The folder is created");
        // System.out.println("The name of the folder is " + f.getName());

        // File[] files = f.listFiles();

        // System.out.println(files.length);
        // try {

        // boolean b = f.createNewFile();
        // if (b) {
        // System.out.println("File is created");
        // System.out.println("The name of the file is :" + f.getName());
        // System.out.println("The path of the file is :" + f.getPath());
        // System.out.println("The path of the file is :" + f.getAbsolutePath());

        // }
        // // f.createTempFile("MCA","JAVA");
        // } catch (IOException e) {

        // e.printStackTrace();
        // }
    }
}
