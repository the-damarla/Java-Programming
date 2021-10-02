package Patterns;
import java.util.*;

/*
       Enter number of lines : 5

            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *
*/

public class SquareAsterisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}
