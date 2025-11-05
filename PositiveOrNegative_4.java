import java.util.Scanner;
public class PositiveOrNegative_4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if (a > 0){
            System.out.println("positive number");
        }
        else if (a == 0){
            System.out.println("Neutral number ");
        }
        else{
            System.out.println("Negative number");
        }
    }
}
