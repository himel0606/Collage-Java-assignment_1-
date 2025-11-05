import java.util.Scanner;
public class Small_3_num_9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number-1: ");
        int a = sc.nextInt();
        System.out.print("Number-2: ");
        int b = sc.nextInt();
        System.out.print("Number-3: ");
        int c = sc.nextInt();
        if ((a < b)&&(a < c)){
            System.out.println("A is  the small number.");
        }
        else if ((b < a)&&(b < c)){
            System.out.println("B is the small number.");
        }
        else{
            System.out.println("C is the small number.");
        }
    }
}
