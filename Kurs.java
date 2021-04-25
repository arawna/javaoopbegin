package deneme;

public class Kurs {

	int id;
	String name;
	String teacher;
	String img;
	int ilerleme;
	
	public Kurs() {
		
	}
	
	public Kurs(int id,String name,String teacher,String img,int ilerleme) {
		this.id=id;
		this.name=name;
		this.teacher=teacher;
		this.img=img;
		this.ilerleme=ilerleme;
		
		System.out.println("'"+name+"' Kurs kaydý yapýldý");
	}
	
}
