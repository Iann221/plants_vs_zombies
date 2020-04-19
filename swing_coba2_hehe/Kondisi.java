import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
/**
 *
 * @author Vincentius ian 18218034
 */
public class Kondisi extends javax.swing.JFrame {

     public static int getRandom(int min, int max) {
		Random r1 = new Random();
		return r1.nextInt((max - min) + 1) + min;
	} // method untuk mendapatkan random number dari min sampai max

    public static void tunggu(){
        try{
            Thread.sleep(50);
        } catch (Exception e) {

        }
    }

    public static void tunggugerak(){
        try{
            Thread.sleep(1500);
        } catch (Exception e) {

        }
    }

    public static void tunggumuncul(){
        try{
            Thread.sleep(4500);
        } catch (Exception e) {

        }
    }


    /**
     * Creates new form 
     */
    public Kondisi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        // untuk swing
        jPanel1 = new javax.swing.JPanel();
        jLabelrow = new javax.swing.JLabel();
        jLabelcol = new javax.swing.JLabel();
        jLabelp = new javax.swing.JLabel();
        jLabelsun = new javax.swing.JLabel();
        jLabelgbr = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labellist = new ArrayList<JLabel>();
        bulletlist = new LinkedList<Bullet>();
        zombielist = new ArrayList<Zombie>();
        plantlist = new ArrayList<Plant>();
        lawn1 = new Lawn();
        // untuk kode

        gameend = -1;
        min = 1;
        max = 5;
        jmlzombie = 0;
        jmlghoul = 0;        
        sunflower = 500;
        petak = lawn1.getPetak();

        for (int i=0; i<60;i++){
            jLabelgbr = new javax.swing.JLabel();
            labellist.add(jLabelgbr);
        }

        //kode main sebelumnya
        try{
        while (jmlzombie!=2){ // pilih 2 zombie ditempatkan random
            random = getRandom(min,max);
            z = new RegularZombie(random,12);
            if(!lawn1.cekAda(zombielist,z)){ // untuk memastikan tidak ada zombie di row sama
                zombielist.add(z);
                jmlzombie++;
            }
        }
        while (jmlghoul!=1){ // pilih 1 ghoul ditempatkan random
            random = getRandom(min,max);
            z = new Ghoul(random,12);
            if(!lawn1.cekAda(zombielist,z)){
                zombielist.add(z);
                jmlghoul++;
            }
        }
        }catch (AdaException e){}
        lawn1.set(zombielist);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabelrow.setText("Rows: 1 - 5");

        jLabelcol.setText("Column: 1 - 12");

        jLabelp.setText("Pilihan Plant:");
        jLabelp.setToolTipText("");

        jLabelsun.setText("Sunflower sekarang: " + sunflower);

        jButton1.setIcon(new javax.swing.ImageIcon(cardpea)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt)  {
                jButton1ActionPerformed(evt) ;
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(cardrep)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Start");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelrow)
                            .addComponent(jLabelcol)
                            .addComponent(jLabelp)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(jButton2)))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelsun)
                                    .addComponent(jButton3))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelsun)
                        .addGap(19, 19, 19)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelrow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelcol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        // set label

        jLabelsun.setText("Sunflower sekarang: " + sunflower);
        gridBagConstraints = new java.awt.GridBagConstraints();
        int x = 1;
        int y = 1;
        char e;
        for (JLabel label : labellist){
            if (x==13){
                x = 1;
                y ++;
            }
            e = petak[y][x];
            switch(e){
                case 'P':
                    label.setIcon(new javax.swing.ImageIcon(gbrpeashooter));
                    break;
                case 'Z':
                    label.setIcon(new javax.swing.ImageIcon(gbrzombie));
                    break;
                case 'R':
                    label.setIcon(new javax.swing.ImageIcon(gbrrepeater));
                    break;
                case 'G':
                    label.setIcon(new javax.swing.ImageIcon(gbrghoul));
                    break;
                case '-':
                    label.setIcon(new javax.swing.ImageIcon(gbrpea));
                    break;
                default:
                    label.setIcon(new javax.swing.ImageIcon(gbrlawn));
                    break;
            }
             gridBagConstraints.gridx = x;
             gridBagConstraints.gridy = y;
             jPanel1.add(label, gridBagConstraints);
            x++;
        }

        pack();
    }     

    public void change(){
        java.awt.GridBagConstraints gridBagConstraints;
        jLabelsun.setText("Sunflower sekarang: " + sunflower);
        gridBagConstraints = new java.awt.GridBagConstraints();
        int x = 1;
        int y = 1;
        char e;
        for (JLabel label : labellist){
            if (x==13){
                x = 1;
                y ++;
            }
            e = petak[y][x];
            switch(e){
                case 'P':
                    label.setIcon(new javax.swing.ImageIcon(gbrpeashooter));
                    break;
                case 'Z':
                    label.setIcon(new javax.swing.ImageIcon(gbrzombie));
                    break;
                case 'R':
                    label.setIcon(new javax.swing.ImageIcon(gbrrepeater));
                    break;
                case 'G':
                    label.setIcon(new javax.swing.ImageIcon(gbrghoul));
                    break;
                case '-':
                    label.setIcon(new javax.swing.ImageIcon(gbrpea));
                    break;
                default:
                    label.setIcon(new javax.swing.ImageIcon(gbrlawn));
                    break;
            }
            x++;
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(sunflower>=100){
            Thread pilihpea = new Thread(){
                public void run(){
                    PilihPea p1 = new PilihPea();
                    p1.setVisible(true);
                    while(!p1.getchosen()){
                        tunggu();
                    }
                    p = p1.getplant();
                    try{
                        if(lawn1.cekAda(plantlist,p)){
                            tunggu();
                        } else {
                            plantlist.add(p);
                            sunflower -= 100;
                            lawn1.set(plantlist);
                            change();
                        }
                    }catch (AdaException e){
                        e.pesan();
                    }
                }
            };
            pilihpea.start();
        } else {
            JOptionPane.showMessageDialog(this, "sunflower tidak cukup!");
        }    
    }  

     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(sunflower>=300){
            Thread pilihrep = new Thread(){
                public void run(){
                    PilihRep r1 = new PilihRep();
                    r1.setVisible(true);
                    while(!r1.getchosen()){
                        tunggu();
                    }
                    p = r1.getplant();
                    try{
                        if(lawn1.cekAda(plantlist,p)){
                            tunggu();
                        } else {
                            plantlist.add(p);
                            sunflower -= 300;
                            lawn1.set(plantlist);
                            change();
                        }
                    }catch (AdaException e){
                        e.pesan();
                    }
                }
            };
            pilihrep.start();
        } else {
            JOptionPane.showMessageDialog(this, "sunflower tidak cukup!");
        }
    }                                     

    public void gerak(){
        Thread jalan = new Thread(){

            public void run(){
                do {
                    for (Bullet b: bulletlist){
                        b.move();
                    }
                    for (Plant p: plantlist){
                        if (!p.isDead()){
                            bulletlist.add(p.shoot());
                        }
                        if ((bulletlist.getLast().getX()==-1)&&(bulletlist.getLast().getX()==-1)){
                            bulletlist.removeLast();
                        }
                    }
                    lawn1.cekTingkahZombie(plantlist,zombielist);
                    lawn1.cekKena(bulletlist,zombielist);
                    lawn1.reset();
                    lawn1.set(bulletlist);
                    lawn1.set(zombielist);
                    lawn1.set(plantlist);
                    change();
                    gameend = lawn1.cekMenang(zombielist);
                    tunggugerak();
                } while (gameend==0);
                if(gameend==1){
                    System.out.println("Zombie yang mati:");
                    for (Zombie z : zombielist){
                        if(z.isDead()){
                            Box<Zombie> zombiebox = new Box<Zombie>();
                            zombiebox.add(z);
                            zombiebox.print(); 
                        }
                    }
                } else {
                    System.out.println("Plant yang mati");
                    for (Plant p : plantlist){
                        if(p.isDead()){
                            Box<Plant> plantbox = new Box<Plant>();
                            plantbox.add(p);
                            plantbox.print();
                        }
                    }
                }
            }
        };
        jalan.start();
    }

    public void tambahZombie(){
        int jml = 5;
        Thread tambah = new Thread(){

            public void run(){
                for (int i=0;i<jml;i++){
                    tunggumuncul();
                    random = getRandom(min,max);
                    if(i%2==0){
                        z = new RegularZombie(random,12);
                    } else {
                        z = new Ghoul(random,12);
                    }
                    zombielist.add(z);
                    jmlzombie++;   
                }
            }
        };
        tambah.start();
    }

    public void tambahsun(){
        Thread sun = new Thread(){
            public void run(){
                while (lawn1.cekMenang(zombielist)==0){
                    tunggumuncul();
                    sunflower += 100;
                }
            }
        };
        sun.start();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        gerak();
        tambahZombie();
        tambahsun();
    }                                             
   
                
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabelrow;
    private javax.swing.JLabel jLabelcol;
    private javax.swing.JLabel jLabelp;
    private javax.swing.JLabel jLabelgbr;
    private javax.swing.JLabel jLabelsun;
    private javax.swing.JPanel jPanel1;
    
    char[][] petak;
    Lawn lawn1;
    int sunflower;
    List<JLabel> labellist;
    int random;
    Scanner s;
    LinkedList<Bullet> bulletlist;
    List<Zombie> zombielist;
    List<Plant> plantlist;
    int gameend;
    int min;
    int max;
    int jmlzombie;
    int jmlghoul;
    Plant p;
    Zombie z;
    PilihPea pc;

    //gambar
    String cardpea = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\peashootercard.jpg";
    String cardrep = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\repeatercard.jpg";
    String gbrpeashooter = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\peashooter.jpg"; 
    String gbrrepeater = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\repeater.jpg";
    String gbrzombie = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\zombie.jpg";
    String gbrghoul = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\ghoul.jpg";
    String gbrpea = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\pea.jpg";
    String gbrlawn = "C:\\Users\\seana\\OneDrive\\Desktop\\codes\\plants_vs_zombies\\swing\\gambar\\lawn.jpg";       
}
