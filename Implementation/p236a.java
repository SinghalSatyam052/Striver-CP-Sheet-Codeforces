
import java.util.*;
public class p236a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String uniq = "";

        for(int i =0;i<name.length();i++){
            if(uniq.indexOf(name.charAt(i)) == -1) uniq = uniq +name.charAt(i);
        }

        if(uniq.length() %2 !=0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");

        sc.close();
    }
}