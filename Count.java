public class Count {

public static void main (String args[])



{
	int evencount =0;
	int oddcount = 0;

for(int i=1 ; i<=50 ; i++)
if (i % 2 == 0)
{


evencount ++;
}

else{
	oddcount ++;


}
System.out.println("is even" + evencount);
System.out.println("is Odd"+ oddcount);
}
}