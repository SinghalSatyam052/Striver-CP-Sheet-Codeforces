
import java.util.*;
public class c_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.nextLine());
        char[] arr = String.valueOf(x).toCharArray();
        int[] a = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            a[i] = arr[i] - '0';
        }
        for(int i = 0;i<arr.length;i++){
            if(i == 0 && a[i]>4 && a[i]< 9) a[i] = 9-a[i];
            else if(i>0 && a[i]>4 && a[i]<= 9) a[i] = 9-a[i];
        }
        x = 0;
        for (int i : a) {
            x = x*10 +i;
        }
        System.out.println(x);
        sc.close();
    }
}
