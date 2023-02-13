
public class Ignition {

	public static void main(String[] args) {
		KawasakiVulcanVaquero KVV = new KawasakiVulcanVaquero(); 
		
		KVV.poweringOn();
		
		KVV.poweringOff();
		
		System.out.println(KVV.power);
		System.out.println(KVV.cruiseControl);
		System.out.println(KVV.performance);
		
	}
}
