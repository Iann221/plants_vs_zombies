public class Repeater extends Plant{
    // constructor

    public Repeater(int x, int y){
        super(x,y);
        this.name = 'R';
        //this.x = ;
        //this.y = ;
        this.speed = 1;
        this.health = 5;
    }

    public Bullet shoot(){
        turn ++;
        Bullet b;
        b = new Bullet(this.x,this.y+1,2);
        return b;
    }
}