public class Bullet implements Entity{
    protected static int jml = -1;
    protected int x;
    protected int y;
    protected int speed;
    protected char symbol;
    protected boolean dead;
    protected int damage;

    public Bullet(int x, int y, int damage){
        this.x = x;
        this.y = y;
        this.speed = 1;
        this.symbol = '-';
        this.jml ++;
        this.dead = false;
        this.damage = damage;
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

    public int getDamage(){
        return this.damage;
    }

    public void move(){
        this.y += 1;
        if (this.y>12){
            shot();
        }
    }

    public void shot(){
        this.dead = true;
    }

    public boolean isDead(){
        return dead;
    }

}