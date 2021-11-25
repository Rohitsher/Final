package write;
import UpcomingBike.Store;

import java.io.FileWriter;
public class WriteInNotepad {

    public static class FileWriterExample {
        public static void write_in_notepad(){
            try{
                FileWriter fw=new FileWriter("C:\\Users\\mma2928\\IdeaProjects\\Final\\Write file\\output.txt");

                fw.write(Store.disp());
                fw.close();
            }catch(Exception e){System.out.println(e);}
            System.out.println("Success...");
        }
    }
}
