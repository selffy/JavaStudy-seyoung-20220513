package j10_클래스기본정리.repository;

	/*
	 * Entity(독립체) Class
	 * 
	 * 정보를 담는 객체를 Entity 객체라고 한다.
	 * 똑같은 데이터를 담는 객체를 찍어냄.
	 * 
	 */
		
		// get이 private된 변수를 가지고 오게 함.


public class User {
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	//기본생성자
	//전체생성자
	//getter
	//setter
	//toString
	
	
	//기본생성자	
	public User() {}
	
// 생산자 오버로딩이 되면 비활성화가 됨.
	
	//전체생성자(alt +shift +s -> constructer)
	//getter & setter
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercod) {
		this.usercode = usercod;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override //-> 상속을 배워야 알 수 있음.
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	

	
}
