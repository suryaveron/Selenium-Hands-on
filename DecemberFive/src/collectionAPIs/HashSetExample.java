package collectionAPIs;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("A");
		hs.add("A");
		System.out.println("Size of hashset: "+hs.size());
		Iterator<String> it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
