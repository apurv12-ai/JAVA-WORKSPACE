import java.util.Scanner;
class Checksmallest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a<b && a<c){
System.out.printf("%d is smallest",a);
}else if(b<a && b<c){
System.out.printf("%d is smallest",b);
}else{
System.out.printf("%d is smallest",c);
}
}
}