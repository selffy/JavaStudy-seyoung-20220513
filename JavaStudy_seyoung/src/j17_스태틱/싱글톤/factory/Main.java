package j17_스태틱.싱글톤.factory;

public class Main {

	public static void main(String[] args) {
		KIA kiaFactory1 = KIA.getInstance();
		KIA kiaFactory2 = KIA.getInstance();
		KIA kiaFactory3 = KIA.getInstance();
		
		
		Car K5_01 = kiaFactory1.createCar("k5");
		Car K5_02 = kiaFactory1.createCar("k5");
		
		kiaFactory1.carInfo(K5_01);
		kiaFactory1.carInfo(K5_02);
		
		Car K7_01 = kiaFactory2.createCar("k7");
		Car K7_02 = kiaFactory2.createCar("k7");
		
		kiaFactory1.carInfo(K7_01);
		kiaFactory1.carInfo(K7_02);
		
		Car Sportage_01 = kiaFactory3.createCar("Sportage");
		Car Sportage_02 = kiaFactory3.createCar("Sportage");
		
		kiaFactory1.carInfo(Sportage_01);
		kiaFactory1.carInfo(Sportage_02);
		
		
	}
}
