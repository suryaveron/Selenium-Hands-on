package basicsConcepts;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj[][]=new Object[3][2];
		obj[0][0]="name1";
		obj[0][1]=123;
		
		obj[1][0]="name2";
		obj[1][1]=231;
		
		obj[2][0]="name3";
		obj[2][1]=321;
		System.out.println("Row count: "+obj.length);
		System.out.println("column count: "+obj[0].length);
		
		for(int i=0;i<obj.length;i++)
		{
			for(int j=0;j<obj[0].length;j++)
			{
				System.out.println(obj[i][j]);
			}
		}
		
	}

}
