
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String RT="malayalam";
int rtl=RT.length();

String reverse="";

for(int i=rtl-1 ;i>=0;i--)
reverse=reverse+RT.charAt(i);
System.out.println(reverse);

if(RT.equals(reverse))
{
System.out.println("It is Palindrome");	
}
else
{
System.out.println("It is not palindrome");	
}
}
	}


