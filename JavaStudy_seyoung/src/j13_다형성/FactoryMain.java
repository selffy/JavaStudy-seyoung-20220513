package j13_다형성;

//상위 클래스로 업캐스팅 가능하다. 상위 클래스로 업캐스팅이 되면 

// SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();
//   -> Factory smartPhoneFactory = new SmartPhoneFactory();

public class FactoryMain {

	public static void main(String[] args) {
		
		Factory[] factorys = new Factory[100];
		
//		factorys[0] = new SmartPhoneFactory();        \
		//업캐스팅이 가능하기 때문. 업캐스팅을 하게되면 부모가 가진 메소드 밖에 못씀.
//		factorys[1] = new ComputerFactory();
		
		for(int i = 0; i < factorys.length; i++) {
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}		
		
		for(Factory factory : factorys)	{
			factory.start();
		}
		int i = 10;
		double d = i;
		int ii =(int) d;
		
		System.out.println();
		
		for(Factory factory : factorys) {  
			if(factory instanceof SmartPhoneFactory) {
				//instance=생성된객체
				SmartPhoneFactory spf = (SmartPhoneFactory) factory; 
				//스마트폰팩토리를 팩토리로 바꾸고 다시 팩토리를 스마트폰팩토리로 바꿈.
				spf.showsmartPhone();
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
	
			}
		
	}	
}
