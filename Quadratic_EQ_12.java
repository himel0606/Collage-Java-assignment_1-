import java.util.Scanner;
public class Quadratic_EQ_12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("General equation is : ax^2+bx+c\n");
        System.out.print("a :");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c : ");
        double c = sc.nextDouble();
        double d = ((b*b)-4*a*c);
        if (d > 0){
            double r1 = ((-b+Math.sqrt(d))/2*a);
            double r2 = ((-b-Math.sqrt(d))/2*a);
            System.out.println("The root are " +r1+ "and" +r2);
        }
        else if (d==0) {
            double r=(-b/(2*a));
            System.out.println("The root are "+r);
        }
        else{
            System.out.println("The root are not posible.");
        }
    }
}
