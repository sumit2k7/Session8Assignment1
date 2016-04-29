import java.util.ArrayList;
import java.util.Iterator;

public class Session8Assignment1 {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<String>(); 
		arrl.add("First"); 
		arrl.add("Second"); 
		arrl.add("Third"); 
		arrl.add("Random"); 
		Iterator<String> itr = arrl.iterator(); 
		while(itr.hasNext())
		{ 
			System.out.println(itr.next()); 
		} 

	}

}
