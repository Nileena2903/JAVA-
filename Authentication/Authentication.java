import java.util.*;
import java.util.Scanner;
class InvalidUserException extends Exception
{
 public InvalidUserException(String msg)
 {
  super(msg);
 }
}
public class Authentication
{
 public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Username :");
   String user=sc.nextLine();
   System.out.println("Enter Password :");
   String pswd=sc.nextLine();
try
{
 if(user.length()<8)
{
 throw new InvalidUserException("Username must be greater than 7 characters");
}
else if(!pswd.equals("12345678"))
{
 throw new InvalidUserException("Invalid password!!...Enter correct password");
}
else
{
System.out.println("\nLOGIN SUCCESSFUL");
}
}catch(InvalidUserException e)
{
e.printStackTrace();
}
}
}
      


