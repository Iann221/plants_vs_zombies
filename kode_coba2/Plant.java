public class Plant implements Entity{
    // attributes
    protected int x;
    protected int y;
    protected int health;
    protected int speed;
    protected char name;
    protected int turn;

    // constructor
    public Plant(int x, int y, int health, int speed){
        this.x = x;
        this.y = y;
        this.turn = 0;
        this.health = health;
        this.speed = speed;
        this.name = 'P';
    }

    // method
    public char getSymbol() {
        return name;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean isDead(){
        return this.health == 0;
    }
    public int getHealth() {
        return health;
    }
    public void eaten(){
        this.health --;
    }
    public int getSpeed() {
        return speed;
    }

    public Bullet shoot(){
        turn ++;
        Bullet b;
        if (turn % 2 == 0){
            b = new Bullet(this.x,this.y+1);
            return b;
        } else {
            b = new Bullet(-1,-1);
            return b;
        }
    }

    
}