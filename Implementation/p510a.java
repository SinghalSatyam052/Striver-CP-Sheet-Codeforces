import java.util.*;
public class p510a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int c = 0;

        for(int i =0;i<n;i++){
            if(i%2 ==0){
                System.out.println("#".repeat(m));
            }
            else{
                if(c%2 != 0){
                    System.out.println("#"+".".repeat(m-1));
                    c++;
                }
                else{
                    System.out.println(".".repeat(m-1)+"#");
                    c++;
                }
            }
        }
        sc.close();
    }
}