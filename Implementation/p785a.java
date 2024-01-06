import java.util.*;
public class p785a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int face = 0;
        while (t-- > 0) {
            String s = sc.next();

            if(s.equals("Tetrahedron")) face+=4;
            else if(s.equals("Cube")) face+=6;
            else if(s.equals("Octahedron")) face+=8;
            else if(s.equals("Dodecahedron")) face +=12;
            else if(s.equals("Icosahedron")) face +=20;
            
        }
        
        System.out.println(face);
        sc.close();
    }
}