import java.util.*;
public class IfElse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        if ( sum == 5){
            System.out.println("yes its 5");
        }else {
            System.out.println(sum);
        }
    }
}