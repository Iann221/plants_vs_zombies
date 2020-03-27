public class RegularZombie extends Zombie {
    // added attributes

    // constructor
    
    public RegularZombie(int x, int y) {
        super(x,y);
        this.name = 'Z';
        // this.x = maximum position on the right
        // this.x = maximum position on the right
        this.moving = false;
        this.speed = 1;
        this.health = 5;
    }

    public void move(){
        this.x --;
    }
}