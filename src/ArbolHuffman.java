import java.util.ArrayList;

public class ArbolHuffman {
	Nodo<Integer> root;
	BinaryHeap<Nodo<Integer>> heap = new BinaryHeap<Nodo<Integer>>();
	ArrayList<Nodo<Integer>> hojas = new ArrayList<Nodo<Integer>>();
	
	public ArbolHuffman(Nodo<Integer> a) {
		root = a;
	}
	
	public ArbolHuffman() {
		root = null;
	}
	
	public void agregarCaracter(Nodo<Integer> a) {
		heap.insert(a);
	}
	
	public void crearArbol() {
		try {
			
			while (heap.getSize() > 1) {
				Nodo<Integer> primero = heap.deleteMin();
				Nodo<Integer> segundo = heap.deleteMin();
				Nodo<Integer> cabeza = new Nodo<Integer>(primero.getFrecuencia() + segundo.getFrecuencia());
				cabeza.setHijoI(primero);
				cabeza.setHijoD(segundo);
				root = cabeza;
				heap.insert(cabeza);
			}

			encontrarHojas(root);

			
		} catch (Exception e1) {
			
		}
	}
	
	public void addSubArbolIzquierdo(Nodo<Integer> a) {
		root.setHijoI(a);
		a.setPadre(root);
	}
	
	public void addSubArbolDerecho(Nodo<Integer> a) {
		root.setHijoD(a);
		a.setPadre(root);
	}
	
	public Nodo<Integer> getRoot() {
		return root;
	}
	
	public String codificar(String caracteres) {
		String codigo = "";
		
		for (int i=0;i<caracteres.length();i++) {
			codigo += camino(encontrarCaracter(caracteres.charAt(i)));
		}
		
		return codigo;
	}
	
	public String codificar(char caracter) {
		return camino(encontrarCaracter(caracter));
	}
	
	public String decodificar(String caracteres) {
		String resultado = "";
		Nodo<Integer> aux = root;
		for (int i=0;i<caracteres.length();i++) {
			if (caracteres.charAt(i) == '1') {
				aux = aux.getHijoD();
			} else {
				aux = aux.getHijoI();
			}
			
			if (aux.esHoja()) {
				resultado += aux.getCaracter();
				aux = root;
			}

		}
		
		return resultado;
	}
	
	private String camino(Nodo<Integer> nodo) {
		String resultado = "";
		while (nodo.getPadre() != null) {
			if (nodo.getPadre().getHijoI() == nodo) {
				resultado = 0 + resultado;
			} else {
				resultado = 1 + resultado;
			}
			nodo = nodo.getPadre();
		}
		return resultado;
	}
	
	public void encontrarHojas(Nodo<Integer> nodo) {

	    if (nodo == null) {
	      return;
	    }

	    if (nodo.esHoja()) {
	    	hojas.add(nodo);
	    }
	    
	    encontrarHojas(nodo.getHijoI());
	    encontrarHojas(nodo.getHijoD());
	}
	
	public Nodo<Integer> encontrarCaracter(char x) {
		for (int i=0;i<hojas.size();i++) {
			if (hojas.get(i).getCaracter() == x) {
				return hojas.get(i);
			}
		}
		return null;
	}
	
	public int calcularBits(String palabra) {
		int resultado = 0;
		for (int i=0;i<palabra.length();i++) {
			resultado += (codificar(palabra.charAt(i)).length() * encontrarCaracter(palabra.charAt(i)).getFrecuencia());
		}
		return resultado;
	}
	
	
	

}
