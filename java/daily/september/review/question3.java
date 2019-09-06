
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randint = (int)(Math.random() * ((100 - 0) + 1)) + 0;
		if (randint <= 50){
			System.out.println(randint + ": The number is less than 50");
		}
		else{
			System.out.println(randint + ": The number is greater than 50");
		}
	}

}
