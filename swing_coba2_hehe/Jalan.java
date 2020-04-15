import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

class Jalan extends javax.swing.JFrame {

    private JLabel countLabel1 = new JLabel("0");

    private JButton startButton = new JButton("Start");
    startButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                start();

            }

    });


    private void start() {

            Thread worker = new Thread(){

                public void run(){

                    for(int i=0; i<=10; i++) {

                        countLabel1.setText(Integer.toString(i));

                        try {

                                Thread.sleep(1000);

                        } catch (InterruptedException e) {


                        }

                    }

                    statusLabel.setText("Completed.");

                    System.out.println("Invoke and Wait...");

                }

            };

        worker.start();

    } 
}