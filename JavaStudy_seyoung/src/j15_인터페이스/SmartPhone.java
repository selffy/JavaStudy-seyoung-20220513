package j15_인터페이스;

public class SmartPhone {

		private final Hdmi hdmi; //final : 상수는 선언을 하고 초기화를 하지 않으면 안됨. 무조건 값이 주입이 되어야 함. 
								// 생성 될때 상수가 바로 값을 주입하기 위해 final를 붙임. 
		//인터페이스를 하나 줌. 생성이 될때 인터페이스의 부속을 바꿔줌.(빔을 연결할 것인지 모니터를 연결할 것인지 선택)
		
		
		public SmartPhone(Hdmi hdmi) {
			this.hdmi = hdmi;	
		}
		
		public void powerOn() {
			System.out.println("스마트폰의 전원을 켭니다.");
			hdmi.connect();
		}
		
		public void powerOff() {
			System.out.println("스마트폰의 전원을 끕니다.");
			hdmi.disconnect();
		}
}
