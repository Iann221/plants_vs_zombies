public class Repeater extends Plant{
    // constructor

    public Repeater(int x, int y){
        super(x,y);
        this.name = 'R';
        this.speed = 1;
        this.health = 5;
        this.damage = 2;
    }

    public Bullet shoot(){
        turn ++;
        Bullet b;
        b = new Bullet(this.x,this.y+1,damage);
        return b;
    }
}