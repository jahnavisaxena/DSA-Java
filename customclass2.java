
class cellphone{
    public void vibrating(){
        System.out.println("vibrating....");
    }
    public void ringing(){
        System.out.println("ringing....");
    }
    public void calling(){
        System.out.println("calling....");
    }
}

public class q2 {
    public static void main(String[] args) {
        cellphone samsung=new cellphone();
        samsung.ringing();
        samsung.vibrating();
        samsung.calling();


    }
}
