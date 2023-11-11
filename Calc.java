import java.util.*;

public class Main{
    public static void main(String args[]){
    Scanner num = new Scanner(System.in);
    
    System.out.println("Enter value of 1st number ::");
    int a = num.nextInt();

    
    System.out.println("Enter value of 2nd number ::");
    int b = num.nextInt();


    System.out.println("Enter what to perform (+ , - , / , *) ");
    char c = num.next().charAt(0);
    // logic
    
    switch(c){
        case '+' : System.out.println(a+b);
            break;
        case '-' : System.out.println(a-b);    
            break;
        case '/' : System.out.println(a/b);
            break;
        case '*' : System.out.println(a*b);
            break;
    }
}
}