interface Vehicle{
	void start();
}
interface Car{
	void opendoor();
}
class Alto implements Vehicle,Car{
	public void start(){
		System.out.println("from key...");
	}
	public void opendoor(){
		System.out.println("garib jaisa");
	}
}
class Lambo implements Vehicle,Car{
	public void start(){
		System.out.println("by Remote");
	}
	public void opendoor(){
		System.out.println("raisooo jaise");
	}
}
class TestVehicle{
	public static void main(String[] args) {
		Alto a=new Alto();
		a.start();
		a.opendoor();
		Lambo l=new Lambo();
		l.start();
		l.opendoor();
	}
}