public abstract class Zombie implements Entity {
    // attributes
    protected int x;
    protected int y;
    protected int health; // the times it needs to be hit to die
    protected int speed; //kecepatan jalan, makin tinggi makin lambat
    protected char name;
    protected boolean isMoving;
    protected int turn; 
    protected int damage; // damage yang dihasilkan zombie saat makan
    
    //constructor
    public Zombie(int x, int y){
        this.x = x;
        this.y = y;
        this.turn = 0;
        this.isMoving = true;
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
    public void setY(int y){
        this.y = y;
    }

    // abstract method
    public abstract void move();

    //method
    public boolean isDead() {
        return (this.health <= 0);
    }

    public void hurt(Bullet b){
        this.health = this.health - b.getDamage();
    }

    public boolean isMoving() {
        return this.isMoving;
    }

    public void ate(){ // jika zombie makan, dia tidak akan gerak
        isMoving = false;
    }

    public void moving(){
        isMoving = true;
    }
   
    public void makan(Plant p){ // makan plant didepannya
        p.eaten(damage); //nyawa plant berkurang sesuai damage zombie
    }

}