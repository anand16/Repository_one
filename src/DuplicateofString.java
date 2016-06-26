
public class DuplicateofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] duplicates=new String[]{"Won","Excellent","Great","Extradionary","Won"};

for(int i=0;i<duplicates.length;i++)
{
for(int j=i+1;j<duplicates.length;j++)	
{
if((duplicates[i]==duplicates[j] && i!=j))
		{
	
	System.out.println(duplicates[i]);
		}
}

}
	}

}
