package j22_람다식;

@FunctionalInterface  //람다를 쓰기위해서는 FunctionalInterface 필요. 무조건 하나의 인터페이스 만 사용가능함. 
public interface Math {
	public double calc(double value1, double value2);

}
