import java.util.ArrayList;
import java.util.List;

public class Lawn { //[row][column]
    protected int row = 6;
    protected int column = 13;
    protected char[][] petak = new char[row][column];

    public Lawn(){
        petak = new char[][]{
        {'*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}, //row 0 tidak dipakai   
        {'R',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {'U',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {'M',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {'A',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {'H',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}
        };
    }

    public char[][] getPetak(){
        return petak;
    }

    public void reset(){ // mengembalikan tampilan lawn menjadi semula agar nantinya bisa dicetak lagi dari awal
        for (int i=1;i<row;i++){//row
            for (int j=1;j<column;j++){//column 
                petak[i][j] = ' ';
            }
        }
    }

    public <T extends Entity> void set(List<T> entity){ // menerima list generic untuk menentukan posisi di lawn
        for (T temp: entity){
            for (int i=1;i<row;i++){//row
                for (int j=1;j<column;j++){//column 
                    if((temp.getX()==i)&&(temp.getY()==j)&&(!(temp.isDead()))){
                        petak[i][j] = temp.getSymbol();
                    } 
                }
            }   
        }   
    }

    public <T extends Entity> boolean cekAda(List<T> entities, T entity){ // mengecek jika suatu entitas sudah ada di posisi yang sama di lawn
        boolean retval = false;
        if ((entity.getX()>5) || (entity.getX()<1) || (entity.getY()>12) || (entity.getY()<1)){
            System.out.println("posisi tidak valid");
            retval = true;
        } else{
            for (T temp: entities){
                if ((entity.getX()==temp.getX())&&(entity.getY()==temp.getY())){
                    if (entity.getSymbol() == 'P' || entity.getSymbol() == 'R'){
                        System.out.println("sudah ada plant di situ");
                    }
                    retval = true;
                }  
            } 
        }
        return retval;  
    }

    public void cetak(){ //mencetak tampilan lawn
        for (int i=1;i<row;i++){//row
            System.out.println("**************************");
            for (int j=0;j<column;j++){//column
                System.out.print(petak[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println("**************************");
    }

    // mengecek apakah zombie terkena peluru, jika ya, nyawa zombie berkurang dan peluru tidak aktif
    public void cekKena(List<Bullet> bullets, List<Zombie> zombies){
        for (Bullet b : bullets){
            for (Zombie z : zombies){ //asumsi ga ada plant di kanan zombie
                if ((z.getY()<=b.getY())&&(z.getX()==b.getX())&&(!(b.isDead()))&&(!(z.isDead()))){
                    z.hurt(b);
                    b.shot();
                }
            }
        }
    }

    // mengecek apa yang harus dilakukan zombie. jika di depan ada plant, akan makan, jika tidak ada, akan jalan
    public void cekTingkahZombie(List<Plant> plants, List<Zombie> zombies){
        for (Plant p : plants){
            for (Zombie z : zombies){
                if ((z.getY()==(p.getY()+1))&&(z.getX()==p.getX())&&(!(p.isDead()))&&(!(z.isDead()))){
                    z.makan(p);
                    z.ate();
                } 
            }

        }
        for (Zombie z : zombies){
            if(z.isMoving()){
                z.move();
            }
            z.moving();
        }
    }

    // mengecek kondisi menang(zombie sampai rumah / semua zombie dikalahkan)
    public int cekMenang(List<Zombie> zombies){
        boolean plantmenang = true;
        boolean zombiemenang = false;
        for (Zombie z : zombies){
            if (z.getY()==0){
                zombiemenang = true;
                plantmenang = false;
            } else if (!z.isDead()){
                plantmenang = false;
            }
        }
        if (plantmenang){
            System.out.println("Selamat anda berhasil menahan para zombie");
            return 1;
        } else if (zombiemenang){
            System.out.println("Zombie sudah masuk rumah");
            return 2;
        } else {
            return 0;
        }
    }
}