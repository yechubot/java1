
public class AuthApp3 {

	public static void main(String[] args) {
		String[] users = {"yeeun", "sungsoo", "insun"};
		String inputId = args[0];
		
	    boolean isLogin = false;//it's false because it's not log-in yet?
		for(int i = 0; i<users.length; i++) {
	        String currentId = users[i];
	        if(currentId.equals(inputId)) {
	        	isLogin = true;//it's true because it's log-in now?
	        	break;
	        }
		}
	        System.out.println("Hello");
	        if(isLogin) {
	        	System.out.println("hi,a lovey user");
	        }else {
	        	System.out.println("wrong access");
	        }
		} 
		
	}

