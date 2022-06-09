package j19_제네릭; 

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

//제네릭:자료형을 유동적으로 바꿔 쓸 수 있게 함.
public class CMResDto<T> {
	private int code;
	private String msg;
	private T data;
}
