import java.util.ArrayList;
import java.util.List;

public class Lawn { //[row][column]
    private char[][] petak = new char[3][2];

    public Lawn(){
        petak = new char[][]{
        {'p',' '},
        {' ',' '},
        {' ',' '}
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
            for (int j=0;j<2;j++){//column 
                petak[i][j] = ' ';
            }
        }
    }

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
                for (int j=0;j<2;j++){//column 
                    if((temp.getX()==i)&&(temp.getY()==j)){
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

    //char[][] petak = new char[5][4]
    //for (int i=0;i<5;i++){

    //}
    // public Lawn(){
        
    // }

    public void cetak(){
        for (int i=0;i<3;i++){//row
            for (int j=0;j<2;j++){//column
                System.out.print(petak[i][j]);
            }
            System.out.println();
        }
    }
}