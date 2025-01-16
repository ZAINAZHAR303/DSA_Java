import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        if (num%2 == 0){
            System.out.println("given number is even");

        }else System.out.println("given number is odd");

    }
}
