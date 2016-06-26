
public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] numbers=new int[]{10,20,30,40,50,60,70,80,90,90};

for(int i=0;i<numbers.length;i++)
{
for(int j=i+1;j<numbers.length;j++)	
{

	if((numbers[i]==numbers[j]) && (i!=j))
	{
		
		System.out.println(numbers[i]);
	}

}
}
	}

}
