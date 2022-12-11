public class sunday_revision_1 {
    public static void main(String[] args) {
        int a = 345;
        int sum = 0;
        for (int i=1; i<=3; i++){
            int rem = a%10;
            sum += rem;
            a /= 10;
        }
        System.out.println(sum);
    }
}
