
public class AuthApp2 {

	public static void main(String[] args) {
	//	String users[] = {"rabbit", "tiger", "turtle"};
	    String [][] users = {
	    	{"rabbit", "111"},
	    	{"tiger", "222"},
	    	{"turtle", "333"}
	    };
		String inputId = args[0];
		String inputPw = args[1];
		
		boolean isLogin = false;
		for(int i = 0; i < users.length; i++) {
			String[]current = users[i];
			if(current[0].equals(inputId) && current[1].contentEquals(inputPw)) {
				isLogin = true;
				break;
			   }
				
			}
		System.out.println("Hi");
		if(isLogin) {
			System.out.println("Hello Master");
		}else {
			System.out.println("Who are you?");
		}
	}
}

