public abstract class Zombie implements Entity {
    // attributes
    protected int x;
    protected int y;
    protected int health; // the times it needs to be hit to die
    protected int speed;
    protected char name;
    protected boolean moving;
    protected int turn = 0;
    
    //constructor
    public Zombie(int x, int y){
        this.x = x;
        this.y = y;
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
    public void hurt(){
        this.health --;
    }

    // abstract method
    

    //method
    public boolean isDead() {
        return (this.health == 0);
    }

    public boolean isMoving() {
        return this.moving;
    }

    public abstract void move();
    // move zombie from right of screen to the left according to its speed
    // public void move(int speed) {
    //     this.x -= speed; // moves at the 
    // }


}