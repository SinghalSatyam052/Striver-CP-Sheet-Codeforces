
import java.util.*;
public class p116a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total =0,max = 0;

        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            total = total - a + b;
            max = Math.max(total,max);

        }

        System.out.println(max);

        sc.close();
    }
}