
public class DDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] dd=new int[2][3];
dd[0][0]=4;
dd[0][1]=5;
dd[0][2]=6;

dd[1][0]=7;
dd[1][1]=9;
dd[1][2]=10;
System.out.println(dd.length);
for(int i=0;i<dd.length;i++)
{
for(int j=0;j<dd[i].length;j++)
	
	System.out.println(dd[i][j]);
}

	}

}
