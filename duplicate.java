import java.io.*;
import java util.*;
class duplicate
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String a=s.next();
char c[]=a.toCharArray();
int i,j;
TreeSet<String> tss=new TreeSet<String>();
for(i=0;i<c.length;i++)
{
tss.add(c[i]);
}
Iterator it=new iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
