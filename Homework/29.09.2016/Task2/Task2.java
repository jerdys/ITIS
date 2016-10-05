public class Task2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int C;
		int spaces = n;

		for (int i = 0; i < n; i++) {
			for (int j = spaces - 1; j >= 1; j--) {
				System.out.print("   ");
			}

			spaces--;
			C = 1; 

			if (C / 100 != 0) {
				System.out.print(C + "   ");
			}
			else if (C / 10 != 0) {
        			System.out.print("    ");
        		}
        		else if (C / 1000 != 0) {
        			System.out.print("  ");
        		}
    			else {
    				System.out.print(C + "     ");
			}
    	
    			for (int j = 1; j <= i; j++) {
   	    	 		C *= (i - j + 1);
   	    	 		C /= j;
        			System.out.print(C);

        			if (C / 100 != 0) {
        				System.out.print("   ");
        			}
        			else if (C / 1000 != 0) {
        				System.out.print("  ");
        			}
        			else if (C / 10 != 0) {
        				System.out.print("    ");
        			}
        			else {
        				System.out.print("     ");
        			}
        		
    			}
    
    			System.out.println();
		}
	}

}
