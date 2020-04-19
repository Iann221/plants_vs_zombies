import java.io.*;
import javax.swing.*;

public class PosisiException extends Exception{
   
   public void pesan() {
      JOptionPane.showMessageDialog(null, "Tolong pilih posisi!");
   }
}