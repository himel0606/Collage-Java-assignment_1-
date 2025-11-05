import java.util.Scanner;
public class PassOrFail_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int mark = sc.nextInt();
        if (mark>=40 && mark<80){
            System.out.println("pass");
        }
        else if(mark>=80){
            System.out.println("Pass and Great mark ");
        }
        else if(mark>100){
            System.out.println("wrong input");
        }
        else{
            System.out.println("fail");
        }
    }
}
