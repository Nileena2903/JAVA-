import java.util.Scanner;
import java.*;
public class Matrix
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n enter rows");
int m=sc.nextInt();
System.out.println("\n enter coloumns");
int n=sc.nextInt();
int[][]m1=new int[m][n];
int[][]m2=new int[m][n];
int[][]m3=new int[m][n];
System.out.println("\n enter first matrix");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
m1[i][j]=sc.nextInt();
}
}
System.out.println("\n enter second matrix");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
m2[i][j]=sc.nextInt();
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
m3[i][j]=m1[i][j]+m2[i][j];
}
}
System.out.println("\n sum of two matrix :");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(m3[i][j]+"\t");
}
System.out.println();
}
}
}

