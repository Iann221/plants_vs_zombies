public abstract class Zombie {
    // attributes
    protected int x;
    protected int y;
    protected int health; // the times it needs to be hit to die
    protected int speed;
    protected String name;
    protected boolean moving;

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
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }

    // abstract method
    

    //method
    public boolean isDead() {
        return (this.health == 0);
    }

    public boolean isMoving() {
        return this.moving;
    }

    // move zombie from right of screen to the left according to its speed
    public void move(int speed) {
        this.x -= speed; // moves at the 
    }


}