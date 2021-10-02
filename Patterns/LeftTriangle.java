package Patterns;
import java.util.*;

/*
i/p ---> Enter number of lines : 5

o/p --->   *
           * *
           * * *
           * * * *
           * * * * *

           * * * * *
           * * * *
           * * *
           * *
           *

 * */

public class LeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");int n = sc.nextInt();
        for(int row=1;row<=n;row++)
        {
            for (int col = 0; col < row; col++)
                System.out.print("* ");
            System.out.print("\n");
        }
        System.out.println();
        for(int row=n;row>0;row--)
        {
            for(int col=row;col>0;col--)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}
