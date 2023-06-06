class Publisher
{
String pubName;
Publisher(String pubName)
{
this.pubName=pubName;
}
void display()
{
System.out.print("\nPublisher\t:"+pubName);
}
}
class Book extends Publisher
{
String title;
String author;
Book(String pubName,String title,String author)
{
super(pubName);
this.title=title;
this.author=author;
}
void display()
{
super.display();
System.out.println("\n\nTitle:\t\t:"+title);
System.out.println("\nAuthor:\t\t:"+author);
}
}
class Literature extends Book
{
String type;
Literature(String pubName,String title,String author,String type)
{
super(pubName,title,author);
this.type=type;
}
void display()
{
super.display();
System.out.println("\nType:\t\t:"+type);
}
}
class Fiction extends Book
{
String genre;
Fiction(String pubName,String title,String author,String genre)
{
super(pubName,title,author);
this.genre=genre;
}
void display()
{
super.display();
System.out.println("\nGenre:\t\t:"+genre);
}
}
class Books
{
public static void main(String[]args)
{
Literature[]l=new Literature[2];
Fiction[]f=new Fiction[2];
l[0]=new Literature("Harper collis","The Alchemist","Paulo Coelho","Drama");
l[1]=new Literature("DC books","The Aarachaar","K.R Meera","Novel");
f[0]=new Fiction("Cassel","Macbeth","William Shakespeare","Tragedy");
f[1]=new Fiction("penguin Books","The Legend of Khasak","O.V Vijayan","Magical Realism");

System.out.println("\n\t LITERATURE");
for(int i=0;i<l.length;i++)
{
System.out.println("______________________"+(i+1));
l[i].display();
}
System.out.println("\n\n\t FICTION");
for (int i=0;i<f.length;i++)
{
System.out.println("______________________"+(i+1));
f[i].display();
}
}
}
