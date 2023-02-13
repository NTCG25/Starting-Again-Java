
public class hondaShadow {

		String type = "Cruiser"; 
		String color = "Black";
		String engineType = "745cc liquid-cooled V-twin four-stroke";
		String style = "Bobber-Inspired"; 
		
		static boolean riding = false; 
		
		public static void riding() {
			riding = true; 
		} 
		
		public static void dismounted() {
			riding = false; 
		}
}


