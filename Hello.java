public class Hello {
    private int val;
    public static void main(String[] args) {
        System.out.println("Hello hello");
		
		//killPC();
    }

    public Hello (int val) {
        this.val = val;
    }
	
	private void killPC() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i*123456789);
		}
	}

    public void incVal(int mult) {
        this.val = val * mult;
    } 
	
	public static int minFunction(int n1, int n2) {
   		int min;
		
   		if (n1 > n2)
      		min = n2;
   		else
      		min = n1;

   		return min; 
	}
	
    public void testMthd(String msg) {
        int n = 5;
        System.out.println(n);
    }

}