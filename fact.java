import java.util.*;
class fact
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int f=n;
for(int i=n-1;i>1;i--)
{
f=f*i;
}
System.out.println("factorial of a number is"+f);
}
}
