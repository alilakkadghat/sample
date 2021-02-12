import java.util.*;
class laptob
{
 public static void main()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your name");
   String a=sc.nextLine();
   System.out.println("enter your address");
   String adis=sc.nextLine();
   System.out.println("enter the amount");
   double amt=sc.nextDouble();
   System.out.println("enter your choice of computer");
   System.out.println("enter d for desktop or L for laptob");
   char t = sc.next().charAt(0);
   double dis=0,net;
    System.out.println(" your name:"+a);
     System.out.println(" your adisdisress:"+adis);
 switch(t)
 {
case 'd':
case 'D':
if(amt>0 && amt<=25000)
dis=5;
else if(amt>25001 && amt<=57000)
dis=7.5;  
else if(amt>57001 && amt<=100000)
dis=10;
else
dis=15;
break;

 case 'l':
case 'L':
if(amt>0 && amt<=25000)
dis=0.0;
else if(amt>25001 && amt<=57000)
dis=5;  
else if(amt>57001 && amt<=100000)
dis=7.5;
else
dis=10;
break;
default:
  System.out.println("error!!!!!");
}
dis=(dis/100.0)*amt;
net=amt-dis;
System.out.println("dis gained "+"      "+dis);
  System.out.println("Net amount to be paid"+"      "+net);
}
}