public class Box<T extends Entity> {
    protected T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public void print(){ // mengeprint data dengan tampilan Simbol(row,column)
        System.out.println(t.getSymbol() + "(" + t.getX() + "," + t.getY() + ")");
    }
}