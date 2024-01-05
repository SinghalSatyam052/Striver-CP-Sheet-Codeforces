
import java.util.*;
public class p723a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(sc.nextInt());
        x.add(sc.nextInt());
        x.add(sc.nextInt());

        Collections.sort(x);

        int meet = x.get(1);

        System.out.println(Math.abs(x.get(0)-meet)+Math.abs(x.get(2)-meet));

        sc.close();
    }
}