import java.util.*;

public class TesCode {
	// public static void main(String[] args) {
    //     int a = 5;
    //     int b = 5;
    //     System.out.println(a%b);
    //     if (a%b==0){
    //         System.out.println("ha");
    //     }
    // }
     public static void main(String[] args) { 
       List<Bullet> listOfBullets = new LinkedList<Bullet>();
       for (int i=1;i<5;i++){
           if ((i==2)||(i==4)){
               listOfBullets.add(null);
           } else {
         Bullet b = new Bullet(1,i); 
         listOfBullets.add(b);
           }
        }
        System.out.println(listOfBullets);
        System.out.println(listOfBullets.get(1)); 
        listOfBullets.remove(null);
        System.out.println(listOfBullets);
        System.out.println(listOfBullets.get(1)); 
        listOfBullets.remove(null);   
        System.out.println(listOfBullets);
        listOfBullets.remove(null);   
        System.out.println(listOfBullets);
   }
}