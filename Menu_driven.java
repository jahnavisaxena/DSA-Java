import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        System.out.println("Enter your choice : \n1.Area of rectangle\n2.Area of square\n3.Area of circle \n");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter length:");
                int a= sc.nextInt();
                System.out.print("Enter breadth:");
                int b=sc.nextInt();
                int area1=a*b;
                System.out.println(area1);
                break;
            case 2:
                System.out.print("Enter length:");
                int s= sc.nextInt();
                int area2=s*s;
                System.out.println(area2);
                break;
            case 3:
                System.out.print("Enter radius:");
                float r=sc.nextFloat();
                double area3=3.14*r*r;
                System.out.println(area3);
                break;
            default:
                System.out.println("Invalid choice entered");
        }


    }
}
