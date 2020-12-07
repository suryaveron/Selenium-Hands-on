package basicsConcepts;

public class ArrayWithMultiDataTypeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] obj=new Object[4];
		obj[0]="B";
		obj[1]=23;
		obj[2]=true;
		obj[3]=23.44;
		int length = obj.length; //ctrl+1 to assign a variable
		for(int i=0;i<length;i++)
		{
			System.out.println(obj[i]);
		}
		for(Object o:obj)
		{
			System.out.println(o);
		}
	}

}
