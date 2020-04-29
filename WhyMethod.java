
public class WhyMethod {
	
    public static void main(String[] args) {
    	         //argument
	printTwoTimes("a","-");
    //one billion lines
	printTwoTimes("b","*");
	//one billion lines
	printTwoTimes("a","=");
	printTwoTimes("a","+");
    }
                                    //parameter
    public static void printTwoTimes(String text,String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
}
