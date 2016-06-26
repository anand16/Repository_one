
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=150;
int sum=0;

while(input!=0)
{
int lastdigit=input%10;
sum=sum+lastdigit;
input=input/10;
}

System.out.println(sum);
	}

}
