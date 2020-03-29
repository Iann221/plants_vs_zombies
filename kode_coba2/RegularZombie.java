public class RegularZombie extends Zombie {
    
    public RegularZombie(int x, int y) {
        super(x,y);
        this.name = 'Z';
        this.speed = 1;
        this.health = 5;
        this.damage = 2;
    }

    public void move(){
        this.y --;
    }
}