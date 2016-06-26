
public class DDIniReturnTypeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object[][] arrayint=new Object[2][3];
arrayint[0][0]="5";
arrayint[0][1]="6";
arrayint[0][2]="7";
		
arrayint[1][0]="8";
arrayint[1][1]="9";
arrayint[1][2]="10";


for(int i=0;i<arrayint.length;i++)
{
for(int j=0;j<arrayint[i].length;j++)
{
System.out.println(arrayint[i][j]);	
}

}
	}

}
