import java.util.HashSet;
import java.util.Iterator;

public class HandlingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> a= new HashSet<Integer>();
		a.add(10);
		a.add(10);//not accept duplicate values
		a.add(109);
		a.add(105);
		a.add(104);
		a.add(106);
		a.add(100);
		a.add(101);
		
		System.out.println(a);
		
		System.out.println("Using Iterator");
		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
		

	}

}
