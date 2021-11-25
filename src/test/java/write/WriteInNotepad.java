package write;
import Background.LoadDriver;
import java.io.FileWriter;
public class WriteInNotepad extends LoadDriver {
        public static void write_in_notepad(String value){
            try{
                FileWriter fw=new FileWriter("C:\\Users\\mma2928\\IdeaProjects\\Final\\Write file\\output.txt");

                fw.write(value);
                fw.close();
            }catch(Exception e){System.out.println(e);}
            System.out.println("Success...");
        }
}
