package com.company;
import java.util.*;
public class ArmStrongbetweenIntervals {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter start range : ");int start = sc.nextInt();
        System.out.print("Enter end range : ");int end = sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(i == Arms(i))System.out.print(i + " ");
        }
    }

    static int Arms(int i) {
        int sum = 0;
        while(i > 0)
        {
            int rem = i%10;
            sum += rem*rem*rem;
            i /= 10;
        }
        return sum;
    }
}
