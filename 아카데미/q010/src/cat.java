package q010;

public class cat {
	String name;
	int age;
	String family;
	String color;
	
	cat(String name, int age, String family, String color) {
		this.name = name;
		this.age = age;
		this.family = family;
		this.color = color;
	}
	
	void info() {
		String s = 
				"�̸�:" + name +"\n"
				+"����:" + age +"\n"
				+"ǰ��:" + family +"\n"
				+"�л�:" + color;
		System.out.println(s);		
	}
	
}
