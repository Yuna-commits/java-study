package drill06.prob04;

public class Car {
	private String model;
	private int speed;

	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	public String toString() {
		return ("Car[model=" + model + ", speed=" + speed + "]");
	}
}
