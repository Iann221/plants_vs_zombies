public class Peashooter extends Plant{
    // constructor

    public Peashooter(int x, int y){
        super(x,y);
        this.name = 'P';
        this.speed = 2;
        this.health = 5;
        this.damage = 1;
    }

    public Bullet shoot(){
        turn ++;
        Bullet b;
        if (turn % 2 == 0){
            b = new Bullet(this.x,this.y+1,damage);
            return b;
        } else {
            b = new Bullet(-1,-1,damage); // bullet dummy
            return b;
        }
    }
}