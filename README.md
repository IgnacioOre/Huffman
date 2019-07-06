# ArbolHuffman

Implementación del algoritmo de Huffman con un Heap binario.

### Contexto

Proyecto realizado como tarea opcional en el ramo de Estructuras de Datos, dictado por el profesor Miguel Romero en la Universidad del Bío-Bío, sede Chillán.

## Instrucciones

Se debe crear un objeto ArbolHuffman para empezar a trabajar. El método agregarCaracter() recibe un nuevo nodo para el árbol, el cual contiene un cáracter a codificar, y un número entero que indica la frecuencia con la que este caracter se repite. Una vez que se han agregado todos los caracteres y las frecuencias requeridas por el usuario, se llama al método crearArbol(), el cual construye el árbol de Huffman, en el cual cada caracter tiene una representación binaria, siguiendo la regla de que aquellos caracteres con mayor frecuencia requerirán una menor cantidad de bits para ser almacenados en su versión codificada.

Una vez hecho esto, se pueden utilizar los métodos codificar(), el cual recibe un cáracter y retorna la representación binaria codificada correspondiente a ese caracter (si es que esta existe), y decodificar(), que recibe una cadena de 1's y 0's y entrega los caracteres decodificados a partir de esta.

También esta disponible el método calcularBits(), el cual recibe una cadena de caracteres, y retorna la cantidad de bits que le tomaría al arbol representarla en su forma codificada.

Cabe destacar que esta implementación fue realizada para observar de manera rápida el funcionamiento del algoritmo de Huffman, por lo que no funciona con bits, sino que los representa como los caracteres '0' y '1'.
