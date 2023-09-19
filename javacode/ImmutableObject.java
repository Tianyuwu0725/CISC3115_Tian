public class ImmutableObject {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		double farenheit=98.6;
		double centigrade;
		
		centigrade=(double)5/9*(farenheit-32);
	
		for(int i=0;i<=40;i++) {
			i+=4;
			System.out.println(centigrade);
			
		}
		double x=0.0;
		while(x<=40.0) {
			System.out.print(centigrade + " ,");
			x+=4.0;
		}
		System.out.println("\n");
		StopChecking();
	}
	
	public static void StopChecking() {
		Scanner sc=new Scanner(System.in);
		String[][] myarry= new String[][] {{"BMW","Ferrari","Lambo"},{"pizza","burger","dumpling"}};
		
		String isin;
		String inputwords;
		System.out.println("Enter a word: ");
		inputwords = sc.next();
		while(!(inputwords.equals("STOP"))) {
			isin=checkarrary(myarry,inputwords);
			if(isin.equals("true")) {
			System.out.println(inputwords + " is in the 2d array");
			}
			else if(isin.equals("false")) {
				System.out.println(inputwords + " is not in the 2d array");
			}
			
			System.out.println("enter a new word: ");
			inputwords=sc.next();
		}
	}
	public static String checkarrary(String[][] arr, String word) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j].equals(word))
					return "true";
			}
		}
		return "false";
	}
}
