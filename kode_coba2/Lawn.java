import java.util.ArrayList;
import java.util.List;

public class Lawn { //[row][column]
    private char[][] petak = new char[3][5];

    public Lawn(){
        petak = new char[][]{
        {'p',' ',' ',' ',' '},
        {' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' '}
        };
        //petak = new char[3][2]
    }
    // public void set(Bullet[] entity){
    //     for (int i=0;i<3;i++){//row
    //         for (int j=0;j<2;j++){//column 
    //             if((entity[0].getX()==i)&&(entity[0].getY()==j)){
    //                 petak[i][j] = entity[0].getSymbol();
    //             } 
    //         }
    //     }      
    // }

    public void reset(){
        for (int i=0;i<3;i++){//row
            for (int j=0;j<5;j++){//column 
                petak[i][j] = ' ';
            }
        }
    }

    // coba2 set

    // public static <T> void set(T[] entity){
    //     petak[1][0] = entity[0].getSymbol();      
    // }

    // public <T extends Entity> void set(List<T> entity){
    //     T temp = entity.get(0);
    //     petak[1][0] = temp.getSymbol();    
          
    // } //bisa cuk

    public <T extends Entity> void set(List<T> entity){
        for (T temp: entity){
            for (int i=0;i<3;i++){//row
                for (int j=0;j<5;j++){//column 
                    if((temp.getX()==i)&&(temp.getY()==j)&&(!(temp.isDead()))){
                        petak[i][j] = temp.getSymbol();
                    } 
                }
            }   
        }   
    }

    // public void set(List<Bullet> entity){
    //     Bullet temp = entity.get(0);
    //     petak[1][0] = temp.getSymbol();      
    // } //compile sukses

    // public <T extends String> void set(List<T> entity){
    //     T temp = entity.get(0);
    //     System.out.println(temp.length());      
    // } //bisaaaa

    // public void set(List<String> entity){
    //     String temp = entity.get(0);
    //     System.out.println(temp.length());      
    // } //compile sukses

    // coba2 print
    //char[][] petak = new char[5][4]
    //for (int i=0;i<5;i++){

    //}
    // public Lawn(){
        
    // }

    public void cetak(){
        for (int i=0;i<3;i++){//row
            for (int j=0;j<5;j++){//column
                System.out.print(petak[i][j]);
            }
            System.out.println();
        }
    }

    // cek kena zombie
    public void cekKena(List<Bullet> bullets, List<Zombie> zombies){
        for (Bullet b : bullets){
            for (Zombie z : zombies){
                if ((z.getY()<=b.getY())&&(z.getX()==b.getX())&&(!(b.isDead()))&&(!(z.isDead()))){
                    z.hurt();
                    b.shot();
                }
            }
        }
    }

    public void cekTingkahZombie(List<Plant> plants, List<Zombie> zombies){
        for (Plant p : plants){
            for (Zombie z : zombies){
                if ((z.getY()==(p.getY()+1))&&(z.getX()==p.getX())&&(!(p.isDead()))&&(!(z.isDead()))){
                    System.out.println("eating");
                    z.makan(p);
                } else {
                    z.move();
                }
            }
        }
    }
}