import java.util.Scanner;
public class Grade_mark_10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark (out of 100): ");
        int Mark = sc.nextInt();
        String grade;
        switch (Mark/10){
            case 10:
            case 9:
            case 8:
                grade = "A+ ";
                break;
            case 7:
                grade = "A ";
                break;
            case 6 :
                grade = "B";
                break;
            case 5:
                grade = "C";
                break;
            case 4:
                grade = "D ";
                break;
            default :
                grade = "F ";
        }
        System.out.println("The student grade is :"+grade);
    }
}
