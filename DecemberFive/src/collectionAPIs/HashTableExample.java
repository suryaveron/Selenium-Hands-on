package collectionAPIs;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Object,Object> ht=new Hashtable<Object,Object>();
		ht.put("cname","Synechron");
		ht.put("cname", "Technologies");
		ht.put("country", "india");
		ht.put("address", "");
		//System.out.println(ht.get("cname"));
		Enumeration<Object> k=ht.keys();
		Enumeration<Object> e=ht.elements();
		while(e.hasMoreElements()){
			System.out.println(k.nextElement() + "===" + e.nextElement());
		}
	}

}
