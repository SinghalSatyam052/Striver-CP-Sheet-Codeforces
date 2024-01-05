import java.util.*;
public class p_282_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int X =0;

        while (t-- > 0) {
            StringBuilder s = new StringBuilder();
            s.append(sc.next());
            if(s.indexOf("+") != -1 ) X++;
            else X--;
        }
        System.out.println(X);
        sc.close();
    }
}
