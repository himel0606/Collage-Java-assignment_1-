import java.util.Scanner;
public class Small_num_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("B= ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("B is small ");
        }
        else if (a==b){
            System.out.println("Operation not possible  a=b= "+a);
        }
        else{
            System.out.println("a is small ");
        }
    }
}
