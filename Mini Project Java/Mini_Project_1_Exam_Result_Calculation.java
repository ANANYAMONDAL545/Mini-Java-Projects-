
import java.util.Scanner;
public class Mini_Project_1_Exam_Result_Calculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bengali number:");
        int Bengali = sc.nextInt();
        System.out.println("Enter your English number:");
        int English = sc.nextInt();
        System.out.println("Enter your Science group number:");
        int Science = sc.nextInt();
        System.out.println("Enter your Arts group number:");
        int Arts = sc.nextInt();
        System.out.println("Enter your Extra curriculam activity number:");
        int ECA = sc.nextInt();

        float Parcentage = ((Bengali+English+Science+Arts+ECA)/500.0f)*100;
        System.out.println("Your parcentage is: "+ Parcentage+" %");
    }
}
