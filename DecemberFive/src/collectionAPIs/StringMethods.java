package collectionAPIs;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Bangalore is too far from pune";
		String s1="           Bangalore is too far from pune";
		System.out.println(s.length());
		System.out.println(s.equals("Bangalore is too far from Pune"));
		System.out.println(s.equalsIgnoreCase("Bangalore is too far from pune"));
		System.out.println(s.contains("is"));
		System.out.println(s.isEmpty());
		System.out.println(s.charAt(14));
		System.out.println(s.indexOf(" "));
		System.out.println(s.replace("too","quite"));
		System.out.println(s1.trim());
		System.out.println(s.substring(1));
		System.out.println(s.substring(10, 20));
		String[] sp=s1.split(" ");
		for(String x:sp){
			System.out.println(x);
		}
		String join=String.join("-", s);
		String join1=String.join("-", sp);
		System.out.println(join);
		System.out.println(join1);
		
	}

}
