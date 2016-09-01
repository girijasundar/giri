import java.io.*;
import java.util.*;
class notpalin
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter string");
String a=s.next();
String s1="";
String s2="";
int i,j,n=0,max=a.length();
for(i=0;i<=a.length();i++)
{
for(j=i;j<=a.length();j++)
{
s1=a.substring(i,j);
StringBuffer sb=new StringBuffer();
sb.reverse();
s2=sb.toString();
if(!(s1.equals(s2)))
{
System.out.println(s1);
n=a.length()-s1.length();
if(max<n)
max=n;
}
}
}
System.out.println(max);
}
}
