import java.util.*;
/**
 * 
 */
import java.util.Map.Entry;

/**
 * @author home
 *
 */
public class HandlingTreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> a = new TreeMap<String, String>();
		
		a.put("Name","Lakshminarayanan");
		a.put("Company","Infosys");
		a.put("Department","Testing");
		System.out.println(a.get("Name"));
		System.out.println(a.get("Company"));
		System.out.println(a.get("Department"));
		
		
		Set d = a.entrySet();
		Iterator it = d.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}


		

	}

}