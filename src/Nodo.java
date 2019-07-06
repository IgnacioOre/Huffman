
public class Nodo<Integer extends Comparable<Integer>> implements Comparable<Nodo<Integer>>{
	private Integer frecuencia;
	private char caracter;
	private Nodo<Integer> hijoD;
	private Nodo<Integer> hijoI;
	private Nodo<Integer> padre;


	
	public Nodo(Integer frecuencia, char caracter) {
		this.frecuencia = frecuencia;
		this.caracter = caracter;
		hijoD = null;
		hijoI = null;
		padre = null;

	}
	
	public Nodo(Integer frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	public Nodo() {
		this.frecuencia = null;
		this.caracter = 0;
		hijoI = null;
		hijoD = null;
		padre = null;

	}

	public void setPadre(Nodo<Integer> a) {
		this.padre = a;
	}
	
	public void setHijoI(Nodo<Integer> a) {
		hijoI = a;
		hijoI.setPadre(this);
		
	}
	
	public void setHijoD(Nodo<Integer> a) {
		hijoD = a;
		hijoD.setPadre(this);

	}
	
	public Nodo<Integer> getHijoI() {
		return hijoI;
	}
	
	public Nodo<Integer> getHijoD() {
		return hijoD;
	}
	
	public Nodo<Integer> getPadre() {
		return padre;
	}
	
	public int getFrecuencia() {
		return (int) frecuencia;
	}
	
	public char getCaracter() {
		return caracter;
	}
	
	@Override
    public int compareTo(Nodo<Integer> other) {
       return frecuencia.compareTo(other.frecuencia);
    }
	
	public boolean esHoja() {
        if (hijoI == null && hijoD == null) {
            return true;
        }
        return false;
    }
}
