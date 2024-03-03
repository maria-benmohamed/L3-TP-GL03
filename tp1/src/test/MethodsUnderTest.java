package test;

public class MethodsUnderTest {
	private Livre l= null ;
	
	public int add(int a, int b){
		int res = a;
		if(b > 0){
			while ( b-- != 0 ) {
				res++;
			}
		}
		else {
			if(b < 0){
				while ( b++ != 0 ) {
					res--;
				}
			}
		}
		return res;
	}

	public int mult(int a, int b){
		int res = 0;
		while (b > 0) {
			if( b % 2 != 0 ){
				res = res + a ;
				b--;
			}
		}
		b = b/2;
		a = 2*a;
		return res;
	}
	
	public double calculatePI(int n ){
		double s = 0 ;
		double PI = 0 ;
		int i;
		if( n < 0 ){
			PI = -1;
		} 
		else{
			for(i=0; i<n; i++) {
				s = s+((java.lang.Math.pow(-1, i))/((2 * i)+1));
			}
			PI = 4*s ;
		}
		return PI;
	}
}