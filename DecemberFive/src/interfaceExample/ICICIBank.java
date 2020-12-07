package interfaceExample;

public class ICICIBank implements RBI {

	@Override
	public void MinBalanceForSaving() {
		System.out.println("5000");
		
	}

	@Override
	public void MinBalanceForCurrent() {
		System.out.println("10000");
		
	}

	@Override
	public void ROIForSaving() {
		System.out.println("7%");
		
	}
	
	public void internationalBanking()
	{
		System.out.println("special feature in icici bank");
	}
	
	public static void main(String[] args)
	{
		ICICIBank a=new ICICIBank();
		a.ROIForSaving();
		a.MinBalanceForCurrent();
		a.MinBalanceForSaving();
		a.internationalBanking();
		RBI r = new ICICIBank();
		r.MinBalanceForCurrent();
		r.MinBalanceForSaving();
		r.ROIForSaving();
	}

}
