package q009;

public class catinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random = (int)(Math.random()*6+1);
		cat cat = new cat();
		
		cat.name = "냐옹이";
		cat.age = random;
		cat.family = "코리안 숏헤어";
		cat.color = "검은색";
		
		cat.info();
	}

}
