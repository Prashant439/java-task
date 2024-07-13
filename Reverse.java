public class Reverse{

public static void main(String args[])
{
int number=701970811;
int rem=0;
int reverse=0;
while(number!=0)
{
rem = number %10;
reverse = reverse *10 + rem;
number = number/10;
}
System.out.println("reverse"+reverse);
}
}