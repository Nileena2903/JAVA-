import java.*;

class CPU
{
int price=54000;

class processor
{
int cores=8;
String manufacturer="Intel";

void display()
{
System.out.println("CPU INFORMATION");
System.out.print("------------------\n\n");

System.out.println("Number of Cores :"+cores+"\n");
System.out.println("Manufacturer Name :"+manufacturer+"\n");
}
}

void display()
{
processor p=new processor();
p.display();
System.out.println("Price :"+price);
}

static class Ram
{
int memory=16;
String manufacture="Micron Technology";

void display()
{
System.out.println("\n\nRAM INFORMATION");
System.out.print("--------------------\n\n");
System.out.println("Memory :"+memory+"\n");
System.out.println("Manufacturer :"+manufacture);
}
}
}
public class CPUs
{
public static void main(String[]args)
{
CPU c=new CPU();
c.display();
CPU.Ram r =new CPU.Ram();
r.display();
}
}

