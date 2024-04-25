package hardik;

public class Ex3 {

	public static void main(String[] args) {
		  int n = 9;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}



/*    inverted pattern    
  int n = 5;
for(int i=n; i>=1; i--) {
	for(int j=1; j<=i; j++) {
		System.out.print("*");
	}
	System.out.println();
}

}

}*/