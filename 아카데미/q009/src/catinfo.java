package q009;

public class catinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random = (int)(Math.random()*6+1);
		cat cat = new cat();
		
		cat.name = "�Ŀ���";
		cat.age = random;
		cat.family = "�ڸ��� �����";
		cat.color = "������";
		
		cat.info();
	}

}
