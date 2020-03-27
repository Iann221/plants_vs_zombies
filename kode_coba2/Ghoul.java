public class Ghoul extends Zombie {
    // added attributes

    // constructor
    
    public Ghoul(int x, int y) {
        super(x,y);
        this.name = 'G';
        // this.x = maximum position on the right
        // this.x = maximum position on the right
        this.moving = false;
        this.speed = 2;
        this.health = 10;
    }

    public void move(){
        turn ++;
        if (turn % 2 == 0){
            this.y --;
        }
    }
}