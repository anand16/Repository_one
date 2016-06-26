
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=5;
String Result=null;
Result=checkprime(number);
System.out.println(Result);

	}
	
	public static String checkprime(int i)
	
	
	{if (i%2==0)
		return "Not Prime";
	else
	{
		return "Prime";
	}
		
		
	}

}
