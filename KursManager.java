package deneme;

public class KursManager {
	public void listele(Kurs[] kurslar ) {
		System.out.println("-----------------");
		for(Kurs kurs:kurslar) {
			System.out.println(kurs.name);
		}
		System.out.println("-----------------");
	}
	public void detayGetir(Kurs kurs) {
		System.out.println("Id:"+kurs.id+" "+kurs.name+" E�itmen: "+kurs.teacher+" �lerleme: %"+kurs.ilerleme);
	}
}
