class rectangle{
    int length;
    int breadth;
    public int square(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class q4 {
    public static void main(String[] args) {
        rectangle a=new rectangle();
        a.length=89;
        a.breadth=91;
        System.out.println(a.square());
        System.out.println(a.perimeter());
    }
}
