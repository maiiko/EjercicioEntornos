import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
		
		Serie[] s=new Serie[5];
		Videojuego[] v=new Videojuego[5];
		
		for (int i = 0; i < s.length; i++) {
			s[i]=new Serie();	
		}
		
		for (int i = 0; i < v.length; i++) {
			v[i]=new Videojuego();
		}
		
		
	}

}
