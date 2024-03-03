package tp2_2;

public class MethodsUnderTest {
	private Livre l= null ;

	public int add(int a, int b){
		int res = a;
		if(b>0){
			while(b--!=0){res++;}
		}
		else {
			if(b<0){
				while(b++!=0){res--;}
			}
		}
		return res;
	}

	public int mult(int a, int b){
		int res = 0;
		while (b>0) {
			if(b%2!=0){
				res = res+a;
				b--;
			}
			a = 2*a;
			b = b/2;
		}
		return res;
	}
	
	public double calculatePI(int n ){
		double s = 0 ;
		double PI = 0 ;
		int i;
		if(n<0){
			PI = -1;
		} 
		else{
			for(i=0; i<n; i++){s = s+((java.lang.Math.pow(-1, i))/((2 * i)+1));}
			PI = 4*s ;
		}
		return PI;
	}
	
	public boolean verifiCode(int T[], int n){
		int res = 0;
		int i = 1;
		while(res<3 && i<n) {
			if(T[i] == T[i-1]+1) {
				res = res+1;
			}
			else {res = 0;}
			i = i+1;
		}
		return (res == 3);
	}
	
	public int[] leftRotation(int T[], int n){
		int T2[] = new int[n];
		for(int i=0; i<n; i++){T2[((i+4)%5)] = T[i];}
		return T2;
	}
	
	public Livre addLivre(String titre, String auteur, int nbpages, double prix) {
		if(!titre.equals("") && !auteur.equals("")){l = new Livre(titre, auteur, nbpages, prix);}
		return(l);
	}
	
	public Livre getLivre() {
		return l;
	}
}