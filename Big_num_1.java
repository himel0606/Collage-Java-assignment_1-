
import java.util.Scanner;
public class Big_num_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        if (a > b){
            System.out.println("a is big ");
        }
        else if(a == b){
            System.out.println("Operation not posible");
        }        
        else{
            System.out.println("b is big ");
        }
        
    }
}
