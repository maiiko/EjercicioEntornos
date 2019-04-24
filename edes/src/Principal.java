import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
	public static String pedirtexto(String l) throws IOException {
		System.out.println(l);
		
		return leer.readLine();
	}
	
	public static boolean pedirboo(String l,char f, char t) throws IOException {
		boolean fa; // d-devuelto-false s- sacado-true
		char a;
		
		do {
		a=pedirtexto(l).toUpperCase().charAt(0);
		}while(a!= f || a!= t);
		if(a==f) {
			fa=false;
		}else {
			fa=true;
		}
		
		return fa;
	}
	
	public static int pedirnum(String l, int min, int max) throws NumberFormatException, IOException {
		int j;
		do {
			System.out.println(l);
			j=Integer.parseInt(leer.readLine());
		}while(j<min || j>max);
		return j;
	}
	
	public static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Serie[] s=new Serie[5];
		Videojuego[] v=new Videojuego[5];
		//TODO: clase creadora única
//		for (int i = 0; i < s.length; i++) {
//			s[i]=new Serie();	
//		}
//		
//		for (int i = 0; i < v.length; i++) {
//			v[i]=new Videojuego();
//		}
		
		
	}

}
