
public class PrimeNumbersEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=19;
int count=0;
for(int i=1;i<=number;i++)
{

	if((number%i)==0)
{
count++;	
}
	

}
if(count==2)
{
	System.out.println("It is prime");
	}

else
	
{
System.out.println("Not a prime number");	
}
	}

}
