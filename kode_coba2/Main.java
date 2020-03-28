import java.util.*;

public class Main {
    // public static void clearScreen() {  
    //     System.out.print("\033[H\033[2J");  
    //     System.out.flush();  
    // }  // method untuk clear screen
    public static int getRandom(int min, int max) {
		Random r1 = new Random();
		return r1.nextInt((max - min) + 1) + min;
	} // method untuk mendapatkan random number dari min sampai max

	public static void main(String[] args) {
        boolean gameend = false;
        int sunflower = 500;
        int min = 1;
        int max = 5;
        int random;
        Scanner s = new Scanner(System.in);
        LinkedList<Bullet> bulletlist = new LinkedList<Bullet>();
        List<Zombie> zombielist = new ArrayList<Zombie>();
        List<Plant> plantlist = new ArrayList<Plant>();
        String cmd = "";
        Lawn lawn1 = new Lawn();
        System.out.println("posisi zombie saat ini:");
        for (int i=1; i<=2;i++){ // pilih 2 zombie ditempatkan random
            random = getRandom(min,max);
            //System.out.println(random);
            Zombie z = new RegularZombie(random,12);
            zombielist.add(z);
        }
        random = getRandom(min,max);
        //System.out.println(random);
        Zombie z = new Ghoul(random,12); // pilih 1 ghoul ditempatkan random
        zombielist.add(z);
        lawn1.set(zombielist);
        lawn1.cetak();
        System.out.println("Pilih plant:");
        System.out.println("1. peashooter (100)");
        System.out.println("2. repeater (300)");
        int x;
        int y;
         do {
             System.out.println("sunflower saat ini : " + sunflower);
             System.out.println("Pilihan Command: 1 / 2 / START");
             System.out.print("Command: ");
             cmd = s.next();
             if (cmd.equals("1")){
                 do {
                 System.out.print("posisi x: ");
                 x = s.nextInt();
                 } while ((x<1)&&(x>5));
                 do {
                 System.out.print("posisi y: ");
                 y = s.nextInt();
                 } while ((x<1)&&(x>12));
                 Plant p = new Peashooter(x,y);
                 plantlist.add(p);
                 sunflower -= 100;
             } else if (cmd.equals("2")){
                 do {
                 System.out.print("posisi x: ");
                 x = s.nextInt();
                 } while ((x<1)&&(x>5));
                 do {
                 System.out.print("posisi y: ");
                 y = s.nextInt();
                 } while ((x<1)&&(x>12));
                 Plant p = new Repeater(x,y);
                 plantlist.add(p);
                 sunflower -= 300;
             } else if (cmd.equals("START")) {
                 System.out.println("Mulai!");
             } else {
                 System.out.println("kode salah!");
             }
             lawn1.set(plantlist);
             lawn1.cetak();
         } while ((sunflower>0) && (!cmd.equals("START")));
        //List<String> bulletlist = new ArrayList<String>();

        // Bullet[] bulletlist = new Bullet[10];
        //bulletlist[0] = new Bullet(1,0);

        // Bullet b1 = new Bullet(1,0);
        // Bullet b2 = new Bullet(1,1);
        // Bullet b3 = new Bullet(1,3);
        //Zombie z1 = new RegularZombie(1,4);
        //Zombie z2 = new Ghoul(0,4);
        //Plant p1 = new Repeater(1,1);
        //Plant p2 = new Repeater(2,0);
        //String b1 = "abc";

        // bulletlist.add(b1);
        // bulletlist.add(b2);
        // bulletlist.add(b3);
        //zombielist.add(z1);
        //zombielist.add(z2);
        //plantlist.add(p1);
        //plantlist.add(p2);
        //     charlist.add("a");
        //     charlist.add("b");
        //lawn1.set(bulletlist);
        
        System.out.println("selamat bermain");
        
        //tes static int
        //System.out.println(bulletlist.get(1).getJml());
        do {
            System.out.print("Command: ");
            cmd = s.next();
            // bulletlist[0].move();
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
            // for (Zombie z: zombielist){
            //     z.move();
            // }
            lawn1.cekTingkahZombie(plantlist,zombielist);
            lawn1.cekKena(bulletlist,zombielist);
            lawn1.reset();
            lawn1.set(bulletlist);
            lawn1.set(zombielist);
            lawn1.set(plantlist);
            lawn1.cetak();
            gameend = lawn1.cekMenang(zombielist);
            //System.out.println(bulletlist);
            // System.out.println(zombielist.get(0).getHealth());
            // System.out.println(plantlist.get(0).getHealth());
        } while ((cmd.equals("SKIP")) && !gameend);
        System.out.println("game over");
    }
        
}