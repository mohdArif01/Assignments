import java.util.Scanner;
public class sunday_revision_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int power = 1;
        int bin = 0;
        while (num>0){
            int rem = num%10;
            bin += rem*power;
            power *= 2;
            num /= 10;
        }
        System.out.println(bin);
    }
}
