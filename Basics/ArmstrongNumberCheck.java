package Basics;
import java.util.*;
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int num = sc.nextInt();
        if(num == Arms(num))System.out.print("Given number is an Armstrong number");
        else System.out.print("Given number is not an Armstrong number");
    }

    static int Arms(int num) {
        int sum = 0;
        while(num > 0)
        {
            int rem = num%10;
            sum += rem*rem*rem;
            num /= 10;
        }
        return sum;
    }
}
