import java.io.*;
import java.util.*;
class target
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j=1;
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int target=s.nextInt();
for(i=0;i<a.length;i++)
{
for(j=1;j<a.length;j++)
{
int sum=a[i]+a[j];
if(sum==target)
{
System.out.println("the two nos is"+a[i]+"and"+a[j]);
}
}
}}
}
