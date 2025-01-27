public class Bullet implements Entity{
    private static int jml = -1;
    private int x;
    private int y;
    private int speed;
    private char symbol;
    private boolean active;

    public Bullet(int x, int y){
        this.x = x;
        this.y = y;
        this.speed = 1;
        this.symbol = '-';
        this.jml ++;
        this.active = True;
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

    public int getJml(){
        return this.jml;
    }

    public void move(){
        this.y += 1;
    }

    public void shot(){
        this.active = False;
    }

    public boolean isShot(){
        return active;
    }

}