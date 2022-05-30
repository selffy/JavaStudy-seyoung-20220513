package j14_추상;

public class SamsungFactory extends Factory {
//abstact 메소드가 하나라도 있으면 무조건 abstract 클래스 사용.

	@Override
	public void start() {
		System.out.println("삼성 팩토리 가동");
  }
	
	@Override
	public void stop() {
		System.out.println("삼성 공장을 멈춥니다.");
	}
}
