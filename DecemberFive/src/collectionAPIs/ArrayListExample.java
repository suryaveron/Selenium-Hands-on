package collectionAPIs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("A");
		ar.add("B");
		ar.add("C");
		ar.add("A");
		ar.add("F");
		
		System.out.println("Size of arraylist: "+ar.size());
		Iterator<String> it=ar.iterator();
		while(it.hasNext()){
			//String iterated=it.next();
				System.out.println(it.next());
		}
		}
	}


