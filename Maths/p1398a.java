import java.util.*;
public class p1398a {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        // LCM * GCD = |a * b|
        // LCM = |a * b| / GCD(a, b)
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x =-1,y=-1,flag = 0;

            for(int i = l;i<r && flag == 0;i++){
                for(int j = i+1;j<=r && flag == 0;j++){
                    if(lcm(i,j)>=l && lcm(i, j)<=r){
                        x=i;
                        y=j;
                        flag = 1;
                    }
                }
            }

            System.out.println(x+" "+y);
        }
        sc.close();
        
    }
}
