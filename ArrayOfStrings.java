import java.util.Scanner;
import java.util.Arrays;

class ArrayOfStrings
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of Strings\n");
int size=sc.nextInt();
String[] strings=new String[size];
System.out.print("Enter the strings\n");
for(int i=0;i<size;i++)
{
strings[i]=sc.next();
}
System.out.print("\nMENU\n1.in-built\n2.user-defined\n");
System.out.print("\nEnter your option\n");
int opt=sc.nextInt();
switch(opt)
{
case 1:Arrays.sort(strings);
       break;
case 2:String temp;
       for(int i=0;i<size-1;i++)
       {
       for(int j=i+1;j<size;j++)
       {
        if(strings[i].compareTo(strings[j])>0)
         {
          
          temp=strings[i];
          strings[i]=strings[j];
          strings[j]=temp;
         }
       }
      }
      break;
default:System.out.print("Invalid option");
        break;
}
for(int i=0;i<size;i++)
{
System.out.print("\n"+strings[i]);
}
}
}

