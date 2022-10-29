import java.util.*;
public class pattern_factorial{

public static Scanner scn = new Scanner(System.in);

public static void pattern(int n){
    int nst = 1, a = 1, b = n;
    for(int row = 1; row <= n; row++){
        for(int i = 1; i <= nst;i++){
            System.out.print(a + "\t"); 
            int product = a * n;  
            a = product;
        }
        nst++;
        System.out.println();
    }
}
public static void main(String[] args){
    pattern(scn.nextInt());
}
}















// javac pattern_factorial.java && java pattern_factorial
