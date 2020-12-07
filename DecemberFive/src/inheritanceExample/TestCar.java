package inheritanceExample;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car b=new BMW();
		b.start();
		b.stop();
		
		BMW bc=new BMW();
		bc.start();
		bc.stop();
		bc.theftsafety();
	}

}
