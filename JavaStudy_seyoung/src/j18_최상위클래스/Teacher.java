package j18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스)
 * 
 * 
 */

public class Teacher {
	private String name;
	private String subject;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public int hashCode() { //hashCode: 주소값 (실제 메모리 주소), int 자료형 사용
							//Integer
		return Objects.hash(name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //getClass: class 내부 정보를 가지고 있음. 
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	 
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	public void classInfo() {
		System.out.println();
	}
	
}
