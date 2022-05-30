package j15_인터페이스;

 
public class Main {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		SmartPhone smartPhone = new SmartPhone(beamProjector); //업캐스팅
		smartPhone.powerOn();
		smartPhone.powerOff();
		
		//implements -> 상위 클래스. 형변환 발생.

	}
}
