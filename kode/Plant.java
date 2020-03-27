public class Plant implements Entity{
    // attributes
    protected int x;
    protected int y;
    protected int health;
    protected int speed;
    protected char name;

    // constructor
    public Plant(int x, int y, int health, int speed){
        this.x = x;
        this.y = y;
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
    public void eated(){
        this.health --;
    }
    public int getSpeed() {
        return speed;
    }

    
}