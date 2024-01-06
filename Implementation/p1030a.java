
import java.util.*;
public class p1030a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i =0;i<n;i++) x.add(sc.nextInt());

        Collections.sort(x);

        int i = x.get(n-1);

        if(i== 0) System.out.println("EASY");
        else System.out.println("HARD");

        sc.close();
    }
}