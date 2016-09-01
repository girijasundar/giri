import java.io.*;
import java.util.*;
class Sump
{
 public static void main(String args[])
 {
int i,n=0;
String f="";
  Scanner s=new Scanner(System.in);
  String e=s.next();
  for(i=0;i<e.length();i++)
  {
    n=n+Character.getNumericValue(e.charAt(i));
  }
  f=String.valueOf(n);
  StringBuffer sb=new StringBuffer(f);
  sb.reverse();
  String d=new String(sb);
  if(f.equals(d))
     System.out.println("palindrome");
  else
    System.out.println("not palindrome");
 }
}
