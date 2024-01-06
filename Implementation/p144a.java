import java.util.*;
public class p144a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i =0;i<n;i++) x.add(sc.nextInt());

        ArrayList<Integer> arr = new ArrayList<Integer>(x);
        Collections.sort(x);

        int max = x.get(n-1),min = x.get(0);
        int maxi = arr.indexOf(max), mini = arr.lastIndexOf(min),time = 0;

        if(mini != n-1 ||  maxi != 0) {
            if(maxi<mini) time = (maxi-0) + (n-1-mini);
            else time = (maxi-0) + (n-1-mini) -1;
        }
        System.out.println(time);

        sc.close();
    }
}