public class Ghoul extends Zombie {
  
    
    public Ghoul(int x, int y) {
        super(x,y);
        this.name = 'G';
        this.speed = 2;
        this.health = 10;
        this.damage = 4;
    }

    public void move(){
        turn ++;
        if (turn % speed == 0){
            this.y --;
        }
    }
}