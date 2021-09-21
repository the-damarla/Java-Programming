package DSA.MultiDimensionalArrays;
import java.util.*;
public class Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");int r = sc.nextInt();
        System.out.print("Enter number of cols : ");int c = sc.nextInt();
        int[][] ar = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter " + i + "th row " + j + "th col element : ");ar[i][j] = sc.nextInt();
            }
        }
        System.out.print("Gie=ven Array is :\n");
        PrintArray(ar, r, c);
    }

    private static void PrintArray(int[][] ar, int r, int c) {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)System.out.print(ar[i][j] + " ");
            System.out.println();
        }
    }
}
