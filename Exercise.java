import java.awt.*;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        System.out.println("Marks of 5 subjects in CBSE 12th Board: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of English: ");
        float num1=sc.nextFloat();
        System.out.println("Enter marks of Mathematics: ");
        float num2=sc.nextFloat();
        System.out.println("Enter marks of Social Science: ");
        float num3=sc.nextFloat();
        System.out.println("Enter marks of French: ");
        float num4=sc.nextFloat();
        System.out.println("Enter mark of Science: ");
        float num5=sc.nextFloat();
        float percentage=((num1 +num2+num3+num4+num5)/500)*100;
        System.out.print("Percentage of CBSE Board exam is: ");
        System.out.println(percentage);


    }
}
