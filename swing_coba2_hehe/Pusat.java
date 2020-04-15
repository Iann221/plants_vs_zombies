import java.util.*;
import javax.swing.*;


public class Pusat {



     public static void tunggu(){
        try{
            Thread.sleep(2000);
        } catch (Exception e) {

        }
    } 

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        */
        // int sunflower = 500;
        // javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        // List<JLabel> labellist = new ArrayList<JLabel>();
        // for (int i=0; i<60;i++){
        //     jLabel1 = new javax.swing.JLabel();
        //     labellist.add(jLabel1);
        // }


         Kondisi kon = new Kondisi();
         kon.setVisible(true);

        // Jalan j = new Jalan();
        // j.setVisible(true);


        //  PilihPea pc = new PilihPea();
        // pc.setVisible(true);

        //  while(kon.getend() ==-1 || kon.getend() ==0){
        //      if(kon.getend()==0){
        //          kon.change();
        //      }
        //  }

        //  try {
        //      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        //              javax.swing.UIManager.setLookAndFeel(info.getClassName());
        //          if ("Nimbus".equals(info.getName())) {
        //              break;
        //          }
        //      }
        //  } catch (ClassNotFoundException ex) {
        //      java.util.logging.Logger.getLogger(Kondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //  } catch (InstantiationException ex) {
        //      java.util.logging.Logger.getLogger(Kondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //  } catch (IllegalAccessException ex) {
        //      java.util.logging.Logger.getLogger(Kondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        //      java.util.logging.Logger.getLogger(Kondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //  }
        // //</editor-fold>

        // /* Create and display the form */
        //  java.awt.EventQueue.invokeLater(new Runnable() {
        //      public void run() {
        //          new Kondisi().setVisible(true);
        //      }
        //  });
    }
}