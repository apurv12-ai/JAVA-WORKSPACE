import java.util.Scanner;
class Div{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter number");
int a=sc.nextInt();
if(a%5==0){
System.out.println(+a+" is divisble by 5");
}
else
{System.out.println(+a+" is not divisble by 5");
}
}
}