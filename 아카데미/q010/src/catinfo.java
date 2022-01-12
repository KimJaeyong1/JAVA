package q010;

public class catinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int)(Math.random()*6+1);
		
		cat cat = new cat(
						"냐옹이",
						random,
						"코리안 숏헤어",
						"검은색"
						);
		
		cat.info();
	}
}
