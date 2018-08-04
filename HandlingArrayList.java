import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author home
 *
 */
public class HandlingArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		ab.add(1);
		ab.add(11);
		ab.add(12);
		ab.add(13);
		
//		Collections.sort(ab);
	Collections.sort(ab,Collections.reverseOrder());	
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		//a.add(2, 12);
		//a.addAll(ab);
		System.out.println(a.size());
		System.out.println(a.get(3));

		// for(int i =0; i<a.size();i++)
		// {
		// System.out.println(a.get(i));
		// }

		System.out.println("Using Iterator");
		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
// Similarly remove and removeall as same as add addall