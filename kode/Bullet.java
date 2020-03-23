public class Bullet implements Entity{
    private int x;
    private int y;
    private int speed;
    private char symbol;

    public Bullet(int x, int y){
        this.x = x;
        this.y = y;
        this.speed = 1;
        this.symbol = '-';
    }

    public char getSymbol(){
        return this.symbol;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void move(){
        this.y += 1;
    }

}