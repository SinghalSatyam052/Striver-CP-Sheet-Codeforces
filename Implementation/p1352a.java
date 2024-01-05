
import java.util.*;

public class p1352a {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            int c = 0;

            while(n>0){
                arr.add(n%10);
                n/=10;
            }
            for (int i : arr) {
                if(i!=0) c++;
            }
            System.out.println(c);


            for (int i= 0 ;i<arr.size();i++) {
                if(arr.get(i) != 0){
                    System.out.print((int)( arr.get(i)*Math.pow(10,i)) + " ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}