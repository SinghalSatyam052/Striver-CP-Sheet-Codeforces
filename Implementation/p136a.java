
import java.util.*;
public class p136a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n+1];
        int[] ind = new int[n+1];
        for(int i =1;i<=n;i++) {
            x[i] = sc.nextInt();
            ind[x[i]] = i;
        }

        for(int i =1;i<=n;i++) System.out.print(ind[i]+" ");
        System.out.println();

        sc.close();
    }
}