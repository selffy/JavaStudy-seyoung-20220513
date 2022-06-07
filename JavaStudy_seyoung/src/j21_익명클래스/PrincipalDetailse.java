package j21_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrincipalDetailse {

	
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		GrantedAuthority grantedAutority = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				return null;
			}
			
		};
		//익명클래스: 따로클래스를 만들지 않고 바로 구현
		//구현 내용이 달라질 때
		
			GrantedAuthority grantedAuthority2 = new GrantedAuthority() {
				
				@Override
				public Collection<String> getRoles(List<String> roles) {
					// TODO Auto-generated method stub
					return null;
				}
			};
			
			GrantedAuthority grantedAuthority3= new GrantedAuthority() {
				
				@Override
				public Collection<String> getRoles(List<String> roles) {
					// TODO Auto-generated method stub
					return null;
				}
			};
			
		GrantedAuthority grantedAutority2 = new GrantedAutorityImpl();
	
		grantedAutority.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAutority2.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority3.getRoles(strList).forEach(r -> {System.out.println(r);});

	}

}
