
public class Wedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stars = 7;
		while (stars > 0) {
			for (int i = stars; i > 0; i--) {
				System.out.print("*");
			}
			System.out.print("\n");
			stars -= 1;
		}
	}

}
