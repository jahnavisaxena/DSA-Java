import java.util.Scanner;
public class Exercise_1 {
    //question1
    static double convert(int f){
        double c= (f-32)*5/9;
        return c;
    }
    //question2
    static double size(int i){
        double m= i/39.37;
        return m;
    }
    //question3
    static int sum(int n){
        int result=0;
        System.out.println("Enter a number between 0 and 100: "+n);
        int first=n%10; //565%10=5
        int rem=n%10;//
        int second=rem%10;
        rem=rem/10;
        int third=rem%10;
        rem=rem/10;
        int fourth=rem%10;
        result=first+second+third+fourth;
        return result;
    }
    //question4
    static void min(long x){
        long day=x/1440;
        long years= day/365;
        System.out.println("days: "+day+" years:"+years);
    }
    //question5
    static void conversion(int d,int h,int m,int sec){
        int time= h*3600+m*60+sec;
        float kph,mph;
        kph=(d/1000f)/(time/3600f);
        mph=kph/1.609f;
        System.out.println("kph: "+kph+ "mph: "+mph);
    }
    public static void main(String[] args) {
        System.out.println(convert(273));
        System.out.println(size(1000));
        System.out.println(sum(565));
        min(3456789);
        conversion(2500,5,56,23);
    }
}
