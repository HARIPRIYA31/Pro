import java.util.*;
public class pangram
{
public static void main(String args[])
{
  String str=args[0];
  str=str.replaceAll("\\s","").toLowerCase();
  for(char i='a';i<='z';i++)
  {
   for(int j=0;j<str.length();j++)
   {
      if(str.charAt(j)==i)
      {
         count++;
         str=str.replaceAll(String.valueOf(str.charAt(j),"");
       }
     }
     }
     if(count!=26)
       System.out.println("Not a Pangram");
       else
         System.out.println("Pangram");
   }
   }
       
