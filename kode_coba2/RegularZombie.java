public class RegularZombie extends Zombie {
    // added attributes

    // constructor
    
    public RegularZombie(int x, int y) {
        super(x,y);
        this.name = 'Z';
        // this.x = maximum position on the right
        // this.x = maximum position on the right
        this.speed = 1;
        this.health = 5;
        this.damage = 2;
    }

    public void move(){
        this.y --;
    }
}