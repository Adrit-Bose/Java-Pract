import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //condition check
        if (a == b){
            System.out.println("Equal");
        }else if(a < b ){
            System.out.println("Smaller");
        }else{
            System.out.println("Bigger");
        } 
    }
}