import java.util.Scanner;

public class NumberPattern {
    
    public static void numberPattern(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
            } else {
                int count1 = counter;
                for (int j = counter + i - 1; j >= count1; j--) {
                    System.out.print(j + " ");
                    counter++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        numberPattern(n);
        sc.close();
    }
}
