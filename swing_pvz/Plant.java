public abstract class Plant implements Entity{
    // attributes
    protected int x;
    protected int y;
    protected int health;
    protected int speed; //kecepatan nembak, makin tinggi makin lambat
    protected char name;
    protected int turn;
    protected int damage;

    // constructor
    public Plant(int x, int y){
        this.x = x;
        this.y = y;
        this.turn = 0;
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
        return this.health <= 0;
    }
    public int getHealth() {
        return health;
    }
    public void eaten(int damage){
        this.health -= damage;
    }
    public int getSpeed() {
        return speed;
    }

    public abstract Bullet shoot();

    
}