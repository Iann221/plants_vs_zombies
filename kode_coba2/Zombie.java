public abstract class Zombie implements Entity {
    // attributes
    protected int x;
    protected int y;
    protected int health; // the times it needs to be hit to die
    protected int speed;
    protected char name;
    protected boolean isMoving;
    protected int turn;
    protected int damage;
    
    //constructor
    public Zombie(int x, int y){
        this.x = x;
        this.y = y;
        this.turn = 0;
        this.isMoving = true;
        // this.health = health;
        // this.speed = speed;
        // this.name = 'Z';
    }
    // getter & setter
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getHealth() {
        return health;
    }
    public char getSymbol() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public void hurt(Bullet b){
        this.health = this.health - b.getDamage();
    }

    // abstract method
    

    //method
    public boolean isDead() {
        return (this.health <= 0);
    }

    public boolean isMoving() {
        return this.isMoving;
    }

    public void ate(){
        isMoving = false;
    }

    public void moving(){
        isMoving = true;
    }

    public abstract void move();
   
    public void makan(Plant p){
        p.eaten(damage);
    }

}