
public class Split {

	public static void main(String[] args) {
		String s = "potato apple lemon orange";
		
		String[]vect = s.split(" ");
		
		for(int i=0;i<vect.length;i++) {
			System.out.println(vect[i]);
		}

	}

}
