
public class Test {
	public static void main(String[] args) {
		// Crea el arbol de Huffman sin ningún valor
		ArbolHuffman arbol = new ArbolHuffman();
		/*
		// Agrega nodos con valores del abecedario al min-heap dentro del arbol de Huffman
		arbol.agregarCaracter(new Nodo<Integer>(111, 'a')); 
		arbol.agregarCaracter(new Nodo<Integer>(5, 'b'));  
		arbol.agregarCaracter(new Nodo<Integer>(3, 'c')); 
		arbol.agregarCaracter(new Nodo<Integer>(20, 'd')); 
		arbol.agregarCaracter(new Nodo<Integer>(64, 'e')); 
		arbol.agregarCaracter(new Nodo<Integer>(50, 'f')); 
		arbol.agregarCaracter(new Nodo<Integer>(2, 'g')); 
		arbol.agregarCaracter(new Nodo<Integer>(10, 'h')); 
		arbol.agregarCaracter(new Nodo<Integer>(26, 'i')); 
		arbol.agregarCaracter(new Nodo<Integer>(22, 'j')); 
		arbol.agregarCaracter(new Nodo<Integer>(75, 'k')); 
		arbol.agregarCaracter(new Nodo<Integer>(36, 'l')); 
		arbol.agregarCaracter(new Nodo<Integer>(72, 'm')); 
		arbol.agregarCaracter(new Nodo<Integer>(3, 'n')); 
		arbol.agregarCaracter(new Nodo<Integer>(5, 'o')); 
		arbol.agregarCaracter(new Nodo<Integer>(8, 'p')); 
		arbol.agregarCaracter(new Nodo<Integer>(34, 'q')); 
		arbol.agregarCaracter(new Nodo<Integer>(12, 'r')); 
		arbol.agregarCaracter(new Nodo<Integer>(78, 's')); 
		arbol.agregarCaracter(new Nodo<Integer>(43, 't')); 
		arbol.agregarCaracter(new Nodo<Integer>(35, 'u')); 
		arbol.agregarCaracter(new Nodo<Integer>(66, 'v')); 
		arbol.agregarCaracter(new Nodo<Integer>(23, 'w'));
		arbol.agregarCaracter(new Nodo<Integer>(75, 'x')); 
		arbol.agregarCaracter(new Nodo<Integer>(27, 'y')); 
		arbol.agregarCaracter(new Nodo<Integer>(24, 'z'));
		arbol.agregarCaracter(new Nodo<Integer>(200, ' '));
		*/
		// Orden ascendente para comprobar que aquellos caracteres con menor frecuencia son los que utilizan más bits

		
		arbol.agregarCaracter(new Nodo<Integer>(1, 'a')); 
		arbol.agregarCaracter(new Nodo<Integer>(2, 'b'));  
		arbol.agregarCaracter(new Nodo<Integer>(3, 'c')); 
		arbol.agregarCaracter(new Nodo<Integer>(4, 'd')); 
		arbol.agregarCaracter(new Nodo<Integer>(5, 'e')); 
		arbol.agregarCaracter(new Nodo<Integer>(6, 'f')); 
		arbol.agregarCaracter(new Nodo<Integer>(7, 'g')); 
		arbol.agregarCaracter(new Nodo<Integer>(8, 'h')); 
		arbol.agregarCaracter(new Nodo<Integer>(9, 'i')); 
		arbol.agregarCaracter(new Nodo<Integer>(10, 'j'));
		arbol.agregarCaracter(new Nodo<Integer>(11, 'k')); 
		arbol.agregarCaracter(new Nodo<Integer>(12, 'l')); 
		arbol.agregarCaracter(new Nodo<Integer>(13, 'm')); 
		arbol.agregarCaracter(new Nodo<Integer>(14, 'n')); 
		arbol.agregarCaracter(new Nodo<Integer>(15, 'o')); 
		arbol.agregarCaracter(new Nodo<Integer>(16, 'p')); 
		arbol.agregarCaracter(new Nodo<Integer>(17, 'q')); 
		arbol.agregarCaracter(new Nodo<Integer>(18, 'r')); 
		arbol.agregarCaracter(new Nodo<Integer>(19, 's')); 
		arbol.agregarCaracter(new Nodo<Integer>(20, 't')); 
		arbol.agregarCaracter(new Nodo<Integer>(21, 'u')); 
		arbol.agregarCaracter(new Nodo<Integer>(22, 'v')); 
		arbol.agregarCaracter(new Nodo<Integer>(23, 'w'));
		arbol.agregarCaracter(new Nodo<Integer>(24, 'x')); 
		arbol.agregarCaracter(new Nodo<Integer>(25, 'y')); 
		arbol.agregarCaracter(new Nodo<Integer>(26, 'z'));
		arbol.agregarCaracter(new Nodo<Integer>(27, ' '));
		
		
		
		// Construye el arbol de Huffman a partir de los datos ingresados a su min-heap
		arbol.crearArbol();
		
		// Imprime el codigo de cada caracter en el árbol creado
		String abecedario = "abcdefghijklmnopqrstuvwxyz ";
		
		for (int i=0;i<abecedario.length();i++) {
			System.out.println(arbol.codificar(abecedario.charAt(i)));
		}
		
		// Calcula la cantidad de bits utilizados en la codificacion del abecedario
		System.out.println("Bits totales: " + arbol.calcularBits(abecedario));
		
		System.out.println(arbol.codificar("planta"));
		System.out.println(arbol.decodificar("11110100111001011011011001110010110"));
		
	}
}
