
public class CopyConstructorExample {
	
	int x,y,z;
	CopyConstructorExample(int a,int b,int c )
	{
		x=a; y=b;z=c;
	}
	
	CopyConstructorExample(CopyConstructorExample c )
	{
		x=c.x;
		y=c.y;
		z=c.z;
	}
	
	public void display()
	{
		System.out.println(x+""+y+""+z);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CopyConstructorExample c1=new CopyConstructorExample(10,20,30);
CopyConstructorExample c2=new CopyConstructorExample(c1);
c1.display();
c2.display();
		
	}

}
