
public class Ex1 {
	public static void main(String[] args){
		String notes = "ABCDEFG";

		//extract1 = notes.substring(2, notes.length());
		//extract2 = notes.substring(0, 2);
		/// OR
		String extract1 = notes.substring(0,2);
		String extract2 = notes.substring(2);
		String final_Extract = extract2 + extract1;
		System.out.println(final_Extract);

		
	}

}
