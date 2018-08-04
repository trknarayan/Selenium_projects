import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 */

/**
 * @author home
 *
 */
public class HandlingLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub



		LinkedList<Integer> a = new LinkedList<Integer>();

		a.add(1);
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(58);

		System.out.println("Using Iterator");
		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}



	}

}
