
public class Count {

	public static String countdown() {
		int startValue = 10;
		String output = "";
		while (startValue != -1) {
			output += (startValue + "\n");
			startValue--;
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countdown());
	}

}
