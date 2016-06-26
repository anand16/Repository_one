
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> hl=new HashSet();
hl.add("one");
hl.add("two");
hl.add("three");
hl.add("four");
hl.add("five");
Iterator<String> itr=hl.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}




	}

}
