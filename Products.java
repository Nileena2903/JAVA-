import java.util.Scanner;
import java.*;
class Product
{
int pCode,price;
String pName;
Product(int pCode,String pName,int price)
{
this.pCode=pCode;
this.pName=pName;
this.price=price;
}
}
public class Products
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter product code :");
int pCode=sc.nextInt();
System.out.print("\nEnter product name :");
String pName=sc.next();
System.out.print("\nEnter product price :");
int price=sc.nextInt();
Product[]ps=new Product[3];
ps[0]= new Product(pCode,pName,price);
ps[1]= new Product(101,"Pencil",12);
ps[2]= new Product(102,"Pen",10);
int minprice=ps[0].price;
System.out.print("\nCODE\tNAME\tPRICE");
System.out.print("\n____________________");
for(Product p:ps)
{
System.out.print("\n"+p.pCode+"\t"+p.pName+"\t"+p.price);
if(minprice > p.price)
{
minprice=p.price;
}
}
System.out.print("\n____________________");
System.out.print("\nLowest Cost Product details");
System.out.print("\n____________________");
for(Product p:ps)
{
if(minprice==p.price)
{
System.out.print("\nProduct Code :"+p.pCode);
System.out.print("\nProduct Name :"+p.pName);
System.out.print("\nProduct Price:"+p.price);
}
}
}
}
