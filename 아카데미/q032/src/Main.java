
public class Main {

	public static void main(String[] args) {
		Members member01 = new Members();
			member01.name = "김씨";
			member01.tel = "010-1111-2222";
			member01.gender = "남자";
		
		member01.info();
		
		Members member02 = new Members();
			member02.name = "이씨";
			member02.tel = "010-3333-4444";
			member02.gender = "여자";
			
		member02.info();
		
		Member member03 = new Member("박씨", "010-5555-6666", "남자");
		Member member04 = new Member("최씨", "010-7777-8888", "여자");
		
		member03.printInfo();
		member04.printInfo();
	}

}
