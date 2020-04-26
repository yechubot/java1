
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "yechubot";
		String inputId = args[0];
		
		String pass ="1111";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		//if(id == inputId) {
//	if(inputId.equals(id)) {
//		if(inputPass.equals(pass)) {
//			System.out.println("Hi Master!");
//		} else {
//			System.out.println("Who are you?");
//		}
//	
//		System.out.println("Hi Master!");
//		} else {
//			System.out.println("Who are you?");
//		}
//		
//	}
	
		if(inputId.equals(id) && inputPass.equals(pass)) {
				System.out.println("Hi Master!");
			} else {
				System.out.println("Who are you?");
			}
	
	}
	
}
			
		


