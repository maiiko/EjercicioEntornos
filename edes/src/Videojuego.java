import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Videojuego {
// patata
	BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
	
	String titulo, genero, compañia;
	int horasEstimadas;
	boolean entregado;
	
	Videojuego(){
		titulo="";
		genero="";
		compañia="";
		horasEstimadas=10;
		entregado=false;
	}
	Videojuego(String tit){
		titulo=tit;
		genero="";
		compañia="";
		horasEstimadas=10;
		entregado=false;
	}
	
	Videojuego(String tit,String comp,String gen,int h){
	titulo=tit;
	genero=gen;
	compañia=comp;
	horasEstimadas=h;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	
	
}
