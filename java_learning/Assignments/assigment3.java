import java.util.Scanner;

public class assigment3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number:");
        int first = in.nextInt();
        System.out.println("enter second number:");
        int second = in.nextInt();

        System.out.println("enter operator:");
        char operator = in.next().charAt(0);

        if(operator == '+') {
            System.out.println(first + second);
        } else if (operator == '-') {
            System.out.println(first - second);

        }else if (operator == '*') {
            System.out.println(first * second);
        }else if (operator == '/') {
            System.out.println(first / second);
        } else System.out.println("you entered wrong input...");
    }
}
