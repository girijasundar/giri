import java.io.*;
import java.util.*;
class oddreverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String s1[]=a.split(" ");
int i;
for(i=0;i<s1.length;i++)
{
if(s1[i].length()%2==0)
{
s1[i].reverse();
}
}String e="";
for(i=0;i<s1.length;i++)
{
e=e.concat(s1[i]);
}
System.out.println(e);
}
}
