import java.util.Scanner;
public class TriangleArea_7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the frist number: ");
        int a = sc.nextInt();
        System.out.print("Enter the scecond number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        if (((a + b)> c) && ((a + c)>b) && ((b + c)>a)){
            int s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("The tringle area is "+area);
        }
        else{
            System.out.println("Tringle area not possible.");
        }
    }
}
