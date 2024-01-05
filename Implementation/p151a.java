import java.util.*;
public class p151a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, l, c, d, p, nl, np;
        n = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = sc.nextInt();
        nl = sc.nextInt();
        np = sc.nextInt();
        int tot_dr = k*l,tot_sl = c*d;
        int num_dr = tot_dr/nl,num_sal = p/np;
        
        System.out.println(Math.min(Math.min(num_dr, num_sal),tot_sl)/n);
        sc.close();
    }
}