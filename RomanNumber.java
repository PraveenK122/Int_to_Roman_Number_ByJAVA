import java.io.*;

public class RomanNumber
{
 public static void main(String[] args) throws IOException   
 {
   BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
   
   int number;
   int one,ten,hundred,thousand;
   System.out.println("Enter any number between(1-3000):-");
   number=Integer.parseInt(br.readLine());
   
   if(number==0)
    System.out.println("INVALID NUMBER");
    
    thousand=number/1000;
    hundred=((number/100)%10);
    ten=((number/10)%10);
    one=((number/1)%10);
    
    if(thousand==1)
    System.out.print("M");
    else if(thousand==2)
    System.out.print("MM");
    else if(thousand==3)
    System.out.print("MMM");
    
    if(hundred==1)
    System.out.print("C");
     else if(hundred==2)
    System.out.print("CC");
     else if(hundred==3)
    System.out.print("CCC");
     else if(hundred==4)
    System.out.print("CD");
     else if(hundred==5)
    System.out.print("D");
     else if(hundred==6)
    System.out.print("DC");
     else if(hundred==7)
    System.out.print("DCC");
     else if(hundred==8)
    System.out.print("DCCC");
     else if(hundred==9)
    System.out.print("CM");
    
     if(ten==1)
    System.out.print("X");
      else if(ten==2)
    System.out.print("XX");
      else if(ten==3)
    System.out.print("XXX");
      else if(ten==4)
    System.out.print("XL");
      else if(ten==5)
    System.out.print("L");
      else if(ten==6)
    System.out.print("LX");
      else if(ten==7)
    System.out.print("LXX");
      else if(ten==8)
    System.out.print("LXXX");
      else if(ten==9)
    System.out.print("XC");
    
      if(one==1)
    System.out.print("I");
      else if(one==2)
    System.out.print("II");
    else if(one==3)
    System.out.print("III");
    else if(one==4)
    System.out.print("IV");
    else if(one==5)
    System.out.print("V");
    else if(one==6)
    System.out.print("VI");
    else if(one==7)
    System.out.print("VII");
   else if(one==8)
    System.out.print("VIII");
    else if(one==9)
    System.out.print("IX");
    }
   } 
    
    
