
import java.util.*;
public class p791a {
    public static int weigh(int n,int lim,int bob) {
        if(lim>bob) return n;
        return weigh(n+1, 3*lim, 2*bob);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(weigh(0, a, b));

        sc.close();
    }
}