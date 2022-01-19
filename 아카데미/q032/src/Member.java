// 생성자 있음
public class Member {
	//	이름, 전화번호, 성별
	String name; 
	String tel;
	String gender;
	
	Member (String name, String tel, String gender) {
		this.name = name;
		this.tel = tel;
		this.gender = gender;
	}
	
	void printInfo() {
		System.out.println("성함: "+name+" 연락처: " +tel+" 성별: "+gender);
	}
}
