import java.util.*;
public class p_263_a {

    public static int move(int pi,int pj,int m) {
        if(pi == 2 && pj == 2) return m;
        if(pi == 2){
            if(pj == 3 || pj == 1) return move(pi, 2, m+1); 
        }
        if(pj == 2){
            if(pi == 3 || pi == 1) return move(2, pj, m+1); 
        }
        if(pi>2) return move(pi-1, pj, m+1); 
        if(pj>2) return move(pi, pj-1, m+1); 
        if(pi<2) return move(pi+1, pj, m+1);  
        if(pj<2) return move(pi, pj+1, m+1); 
        return m;
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[5][5];
        int pi =0,pj =0;
        for(int i =0;i<5;i++){
            for(int j =0;j<5;j++) {
                A[i][j] = sc.nextInt();
                if(A[i][j] == 1) {
                    pi = i;
                    pj = j;
                }
            }
        }
        System.out.println(move(pi,pj,0));
        
        sc.close();
     }
}

