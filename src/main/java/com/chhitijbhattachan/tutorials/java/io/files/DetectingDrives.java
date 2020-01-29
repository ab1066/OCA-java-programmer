import java.io.File;
import java.io.IOException;

public class DetectingDrives{
    public static void main(String args []){
        try{
            File newFile = new File("/Volumes");
            System.out.println(newFile.isDirectory());
            System.out.println(newFile.isFile());
            System.out.println(newFile.getName());
            System.out.println("listing the files and folders present in the folder");
            for(File file : newFile.listFiles()){
                System.out.printf("Name : %s; Absolute Path : %s; Canonical Path : %s; Path : %s%n",
                    file.getName(),
                    file.getAbsolutePath(),
                    file.getCanonicalPath(),
                    file.getPath()
                );
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}