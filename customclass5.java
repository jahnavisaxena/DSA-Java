class circle{
    double radius;
    public double square(){
        return 3.14*radius*radius;
    }
    public double circumference(){
        return 2*3.14*radius;
    }
}
public class q5 {
    public static void main(String[] args) {
        circle o=new circle();
        o.radius=1.4;
        System.out.println(o.square());
        System.out.println(o.circumference());
    }
}
