package object.example;

public class Car {
	public String company = "HYUNDAI";
	
	private String model = "�׷���";
	private String color = "����";
	int speed;

	protected int maxSpeed = 160;
	
	public static String madeBy = "KOREA";
	public static final String exportTo = "USA";

	// ������
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	// ����Ʈ ������
	public Car() {
		
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
