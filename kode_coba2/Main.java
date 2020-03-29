import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void clearScreen() {  
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        } catch(Exception E){
            System.out.println(E);
        }
    }  // method untuk clear screen

    public static int getRandom(int min, int max) {
		Random r1 = new Random();
		return r1.nextInt((max - min) + 1) + min;
	} // method untuk mendapatkan random number dari min sampai max

    public static void tunggu(){
        try{
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    } // method untuk delay

	public static void main(String[] args) {
        Main m = new Main();
        boolean gameend = false;
        int sunflower = 500;
        int min = 1;
        int max = 5;
        int jmlzombie = 0;
        int jmlghoul = 0;
        int random;
        Scanner s = new Scanner(System.in);
        LinkedList<Bullet> bulletlist = new LinkedList<Bullet>();
        List<Zombie> zombielist = new ArrayList<Zombie>();
        List<Plant> plantlist = new ArrayList<Plant>();
        String cmd = "";
        Lawn lawn1 = new Lawn();
        clearScreen();
        System.out.println("kondisi lawn saat ini:");
        while (jmlzombie!=2){ // pilih 2 zombie ditempatkan random
            random = getRandom(min,max);
            Zombie z = new RegularZombie(random,12);
            if(!lawn1.cekAda(zombielist,z)){ // untuk memastikan tidak ada zombie di row sama
                zombielist.add(z);
                jmlzombie++;
            }
        }
        while (jmlghoul!=1){ // pilih 1 ghoul ditempatkan random
            random = getRandom(min,max);
            Zombie z = new Ghoul(random,12);
            if(!lawn1.cekAda(zombielist,z)){
                zombielist.add(z);
                jmlghoul++;
            }
        }
        lawn1.set(zombielist);
        lawn1.cetak();
        int x;
        int y;
         do {
             System.out.println("Pilih plant:");
            System.out.println("1. peashooter (100)");
            System.out.println("2. repeater (300)");
             System.out.println("sunflower saat ini : " + sunflower);
             System.out.println("Pilihan Command: 1 / 2 / START");
             System.out.print("Command: ");
             cmd = s.next();
             if (cmd.equals("1")){
                 if(sunflower>=100){
                    do {
                    System.out.print("posisi x: ");
                    x = s.nextInt();
                    } while ((x<1)&&(x>5));
                    do {
                    System.out.print("posisi y: ");
                    y = s.nextInt();
                    } while ((x<1)&&(x>12));
                    Plant p = new Peashooter(x,y);
                    if(lawn1.cekAda(plantlist,p)){
                        System.out.println("sudah ada plant di situ");
                        tunggu();
                    } else {
                        plantlist.add(p);
                        sunflower -= 100;
                    }
                 } else {
                     System.out.println("sunflower tidak cukup!");
                     tunggu();
                 }
             } else if (cmd.equals("2")){
                 if(sunflower>=300){
                    do {
                    System.out.print("posisi x: ");
                    x = s.nextInt();
                    } while ((x<1)&&(x>5));
                    do {
                    System.out.print("posisi y: ");
                    y = s.nextInt();
                    } while ((x<1)&&(x>12));
                    Plant p = new Repeater(x,y);
                    if(lawn1.cekAda(plantlist,p)){ // untuk memastikan tidak ada zombie di tempat sama
                        System.out.println("sudah ada plant di situ");
                        tunggu();
                    } else {
                        plantlist.add(p);
                        sunflower -= 300;
                    }
                 } else {
                     System.out.println("sunflower tidak cukup!");
                     tunggu();
                 }
             } else if (cmd.equals("START")) {
                 System.out.println("Mulai!");
                 tunggu();
             } else {
                 System.out.println("kode salah!");
                 tunggu();
             }
             clearScreen();
             System.out.println("kondisi lawn saat ini:");
             lawn1.set(plantlist);
             lawn1.cetak();
         } while (!cmd.equals("START"));  

        do {
            do {
                System.out.print("ketik SKIP untuk melanjutkan: ");
                cmd = s.next();
            }while(!cmd.equals("SKIP"));
            clearScreen();
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
            lawn1.cetak();
            gameend = lawn1.cekMenang(zombielist);
            //untuk menunjukkan nyawa zombie dan plant
            // System.out.println(zombielist.get(0).getHealth());
            // System.out.println(plantlist.get(0).getHealth());
            //tunggu();
        } while ((cmd.equals("SKIP")) && !gameend);
        // (cmd.equals("SKIP")) && 
        System.out.println("game over");
    }
        
}