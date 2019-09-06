
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randint = (int)(Math.random() * ((100 - 0) + 1)) + 0;
		while (randint > 0) {
			for (int i = 1; i < 11; i++) {
				System.out.println("Loop #" + i);
				System.out.println(randint);
				randint -= 10;
				if (i == 10 || randint < 0) {
					System.exit(0);;
				}
			}
		}
	}

}
