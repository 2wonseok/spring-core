package spring_ex1;

public class Car {
	private Tire tire;
	
	public void drive() {
		tire.test();
	}
	
	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
