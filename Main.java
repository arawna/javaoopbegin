package deneme;

public class Main {

	public static void main(String[] args) {


		Kurs kurs1=new Kurs(1,"C# Kursu","Engin Demiroğ","1.png",54);
		Kurs kurs2=new Kurs(2,"Java Kursu","Engin Demiroğ","2.png",32);
		Kurs kurs3=new Kurs(3,"Programlama Kursu","Engin Demiroğ","3.png",0);
		
		Kurs[] kurslar= {kurs1,kurs2,kurs3};
		
		KursManager kursManager=new KursManager();
		kursManager.listele(kurslar);
		kursManager.detayGetir(kurs1);
		kursManager.detayGetir(kurs2);
		kursManager.detayGetir(kurs3);
		
	}
}

