package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor //매개변수가 없는 생성자(기본생성자)
@RequiredArgsConstructor
@AllArgsConstructor // 전체 생성자
@Getter 
@Setter
@EqualsAndHashCode
@ToString

/*
 * 롬복을 쓰는 이유
 * 1. 코드를 줄여줌.
 * NonNull을 쓰게 될 경우 ReaquiredArgsConstructor도 같이 써야함.
	현재 값이 null일 수가 없다라는 의미
 */
public class Product2 {

	private int productCode;
	@NonNull
	private String productName;
	private int category;
	private LocalDate productionDate;
		
}
