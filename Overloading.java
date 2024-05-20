public class overloading {
    static void greeting(){
        System.out.println("good morning everyone");
    }
    static void name(String a, String b){//parameters
        System.out.println("Good morning Ma'am " +a);
        System.out.println("Good night Ma'am " +b);
    }
    static int name(int x,int y){
        int z=(x+y)*45;
        System.out.printf("Ma'am your bill is %d ",z);
        return z;
    }

    public static void main(String[] args) {
       greeting();
       name("Jahnvi","Tanya");
       name(9000,6800);


    }
}
