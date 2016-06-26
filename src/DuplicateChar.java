
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="vivekanand";
int count=0;
for(int i=0;i<s.length();i++)
{
for(int j=i+1;j<s.length();j++)	
	
{
	if((s.charAt(i)==s.charAt(j) && (i!=j)) )
			{
		System.out.println(s.charAt(i));
		count++;
		System.out.println(count);
			}

}
}
	}

}
