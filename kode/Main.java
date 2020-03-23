import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Bullet> bulletlist = new ArrayList<Bullet>();
        //List<String> bulletlist = new ArrayList<String>();

        // Bullet[] bulletlist = new Bullet[10];
        //bulletlist[0] = new Bullet(1,0);

        Bullet b1 = new Bullet(1,0);
        //String b1 = "abc";

        bulletlist.add(b1);
        //     charlist.add("a");
        //     charlist.add("b");
        Lawn lawn1 = new Lawn();
        lawn1.set(bulletlist);
        lawn1.cetak();
        System.out.print("Command: ");
        String cmd = s.next();
        while (cmd.equals("SKIP")){
            // bulletlist[0].move();
            for (Bullet b: bulletlist){
                b.move();
            }
            lawn1.reset();
            lawn1.set(bulletlist);
            lawn1.cetak();
            System.out.print("Command: ");
            cmd = s.next();
        }
    }
        
}