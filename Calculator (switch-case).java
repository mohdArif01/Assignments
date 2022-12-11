import java.util.Scanner;
public class sunday_revision_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an operator (+, -, *, /): ");
        String k = sc.next();
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (k){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;

        }
    }
}
