import java.io.*;
import java.util.*;
class overlap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println(" enter x1 and y1");
int x1=s.nextInt();
int y1=s.nextInt();
System.out.println(" enter x2 and y2");
int x2=s.nextInt();
int y2=s.nextInt();
System.out.println(" enter x3 and y3");
int x3=s.nextInt();
int y3=s.nextInt();
System.out.println(" enter x4 and y4");
int x4=s.nextInt();
int y4=s.nextInt();
if(x3>x2||y3>y2||x4<x1||y4<y1)
{
boolean a=false;
System.out.println(a);
}
else
{
boolean a=true;
System.out.println(a);
}
}
}
