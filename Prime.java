public class Prime{


public static void main(String args[]) 
{
int count =0;
int number =21;
   for(int i = 2; i<= number; i++)
   if (number % i==0){
   count ++;
   
   }

if (count<2)
{
System.out.println("is prime number");
}
else
{
System.out.println("is not prime number");

}

}

}