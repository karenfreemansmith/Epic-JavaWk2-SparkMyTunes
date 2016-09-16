import java.io.*;

public class Tunes {
  public static void save(Tune[] tunes) {
    try (
      FileOutputStream fos = new FileOutputStream("tunes.lst");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
    ) {
        oos.writeOjbect(tunes);
      } catch(IOException ioe) {
        System.out.println("Problem saving Tunes");
        ioe.printStackTrace();
      } 
    }
  }
}
