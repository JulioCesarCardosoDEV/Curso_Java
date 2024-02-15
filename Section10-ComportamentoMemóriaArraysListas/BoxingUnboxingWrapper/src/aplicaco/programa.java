package aplicaco;

public class programa {

	public static void main(String[] args) {
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		Integer obj2 = y;
		
		//INTEGER É UM TIPO CLASSE DIFERENTEMENTE DE INT (TIPO PRIMITIVO), O INTEGER 
		// ACEITA NULL, INT NAO
		
		System.out.println(y);
		System.out.println(obj2);

	}

}
