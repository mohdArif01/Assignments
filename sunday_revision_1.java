public class sunday_revision_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 13;
        System.out.println("The number before swapping is: "+ a +","+ b);

        a = b - a;
        b = b - a;
        a = b + a;
        System.out.println("The numbers after swapping is: "+ a + "," + b);
    }
}
