import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Practica {

	public static void main(String[] args) {
		ArrayList<String> ciudades = new ArrayList<>();
		LinkedList<String> nombres = new LinkedList<>();
		PriorityQueue<String> palabras = new PriorityQueue<>();
		Stack<String> apellidos = new Stack<>();
		HashMap<String, Integer> estudiantes = new HashMap<>();
		
		String [][] matrizCiudades= crearMatrizCiudades();
		
		LinkedList<String> listaCiudades = consumirMatrizCiudades(matrizCiudades);
		
		System.out.println("Ciudades de la lista");
		for(String ciudad:listaCiudades) {
			System.out.println(ciudad);
		}
		
		
		
		
		

	}

	public static String[][] crearMatrizCiudades() {

		String[][] ciudades = { { "Armenia", "Calarca", "Montenegro" }, { "Tebaida", "Circacia", "Filandia" },
				{ "Genova", "Pijao", "Salento" } };
		return ciudades;
	}
	
	public static LinkedList <String> consumirMatrizCiudades(String  [][] matriz) {
		LinkedList<String> listaCiudades = new LinkedList<>();
		
		//Ciclo que recorre la lista
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				listaCiudades.add(matriz[i][j]);
			}
		}
		return listaCiudades;
	}

}
