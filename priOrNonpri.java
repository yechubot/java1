
public class priOrNonpri {

	public static void main(String[] args) {
		
		int p1 = 1;
		int p2 = 1;
		
		if (p1==p2) {
			System.out.println(true);
		}else {
			System.out.println("false");
		}
		
		
		String o1 = new String("java");
		String o2 = new String("java");
		
		if (o1 == o2) {
			System.out.println("java");
		}else if(o1.equals(o2)){
			System.out.println("I am on object");
		}else {
			System.out.println("false");
		}
		
		String o3 = "java";
		String o4 = "java";
		
		if (o3.equals(o4)) {
			System.out.println("I am String");
		}else {
			System.out.println("false");
		}
	}
	
}
			
		


