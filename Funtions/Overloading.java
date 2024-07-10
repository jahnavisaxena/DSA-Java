public class functionOverloading {
    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b,float c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,3));
        System.out.println(sum(3.4f,22.4f,4.5f));
    }
}
