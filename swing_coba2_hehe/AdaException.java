import java.io.*;
import javax.swing.*;

public class AdaException extends Exception{
   
   public void pesan() {
      JOptionPane.showMessageDialog(null, "sudah ada plant di situ!");
   }
}