public class pr_set7 {
    //question1
    static void table(int n){
        for(int i=0;i<=10;i++){
            System.out.printf("%d x %d =%d\n",n,i,n*i);
        }

    }
    //question2
    static void pattern(char a){
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    //question3
    static int recsum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+recsum(n-1);
        }
    }
    //question4
    static void pattern2(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //question5
    static double avg(int...a){
        int sum=0;
        for(int element:a){
            sum += element;
        }
        double avg=(sum)/a.length;
        return avg;
    }
    //question6
    static int fibRec(int n){
        if(n==1){          //0,1,1,2,3,5,8... n is the position
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibRec(n-1)+fibRec(n-2);
        }
    }
    //question7
    static double converter(int c){
        double f=(9/5)*c+32;
        return f;
    }
    //question8
    static int sum(int n){
        int s=0;
        for(int i=0;i<=n;i++){
            s+=i;
        }
        return s;
    }

    public static void main(String[] args) {
        table(9);
        pattern('*');
        System.out.println(recsum(4));
        pattern2(4);
        System.out.println("Average of 2,3,4,56,6,3 is: " + avg(2, 3, 4, 56, 6, 3));
        System.out.println(fibRec(5));
        System.out.println(converter(100));
        System.out.println("Sum is: "+ sum(9));

    }
}
