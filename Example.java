interface calinf{
int computer(int a, int b);
}
public class Example{
public static void main(String[]args){
calinf oj1=(a,b)-> a+b;
calinf oj2=(a,b)-> a-b;
calinf oj3=(a,b)-> a*b;
 System.out.println(oj1.computer(10,3));
 System.out.println(oj2.computer(10,3));
System.out.println(oj3.computer(10,3));
 }
 }