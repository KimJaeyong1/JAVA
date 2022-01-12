package q009;

public class cat {
	String name;
	int age;
	String family;
	String color;
	
	void info() {
		String s = 
				"이름:" + name +"\n"
				+"나이:" + age +"\n"
				+"품종:" + family +"\n"
				+"털색:" + color;
		System.out.println(s);		
	}
}
