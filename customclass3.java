class square{
    int side;
    public int square(){
        int sq=side*side;
        return sq;
    }
    public int perimeter(){
        int pm=4*side;
        return pm;
    }
}
public class q3 {
    public static void main(String[] args) {
        square a=new square();
        a.side=6;
        System.out.println(a.square());
        System.out.println(a.perimeter());
    }
}
