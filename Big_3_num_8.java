import java.util.Scanner;
public class Big_3_num_8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number-1: ");
        int a = sc.nextInt();
        System.out.print("Number-2: ");
        int b = sc.nextInt();
        System.out.print("Number-3: ");
        int c = sc.nextInt();
        if ((a > b)&&(a > c)){
            System.out.println("A is  the big number.");
        }
        else if ((b > a)&&(b > c)){
            System.out.println("B is the big number.");
        }
        else{
            System.out.println("C is the big number.");
        }
    }
}
