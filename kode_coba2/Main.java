// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Bullet> bulletlist = new LinkedList<Bullet>();
        List<Zombie> zombielist = new ArrayList<Zombie>();
        List<Plant> plantlist = new ArrayList<Plant>();
        //List<String> bulletlist = new ArrayList<String>();

        // Bullet[] bulletlist = new Bullet[10];
        //bulletlist[0] = new Bullet(1,0);

        // Bullet b1 = new Bullet(1,0);
        // Bullet b2 = new Bullet(1,1);
        // Bullet b3 = new Bullet(1,3);
        Zombie z1 = new RegularZombie(1,4);
        Zombie z2 = new Ghoul(0,4);
        Plant p1 = new Plant(1,2,2,1);
        //String b1 = "abc";

        // bulletlist.add(b1);
        // bulletlist.add(b2);
        // bulletlist.add(b3);
        zombielist.add(z1);
        zombielist.add(z2);
        plantlist.add(p1);
        //     charlist.add("a");
        //     charlist.add("b");
        Lawn lawn1 = new Lawn();
        lawn1.set(bulletlist);
        lawn1.set(zombielist);
        lawn1.set(plantlist);
        lawn1.cetak();
        //tes static int
        //System.out.println(bulletlist.get(1).getJml());
        System.out.print("Command: ");
        String cmd = s.next();
        while (cmd.equals("SKIP")){
            // bulletlist[0].move();
            for (Bullet b: bulletlist){
                b.move();
            }
            for (Plant p: plantlist){
                if (!p.isDead()){
                    bulletlist.add(p.shoot());
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
            System.out.println(bulletlist);
            System.out.println(zombielist.get(0).getHealth());
            System.out.println(plantlist.get(0).getHealth());
            System.out.print("Command: ");
            cmd = s.next();
        }
    }
        
}