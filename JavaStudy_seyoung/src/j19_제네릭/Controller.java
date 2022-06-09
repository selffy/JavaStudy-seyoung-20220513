package j19_제네릭;

public class Controller {
	public Object createUser() {
		return new CMResDto(1, "회원추가 성공", "aaaa, 1234");
		//데이터가 정상적인 데이터면 1, 아니면 -1
	}
	
	public Object updateUser() { 
		return new CMResDto(1,"회원정보(나이)수정 성공", "29");
	}
	
	
}

