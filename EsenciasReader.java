package objetos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EsenciasReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub 
		
		Esencias[] array = new Esencias[700];
		
		String path = "/Users/macbookpro/Documents/Main/Escuela/PrepaTec /INFO Internal/Practica/Documentos prueba/Ventas.csv";
		
		Scanner read = new Scanner(new File(path));
		
		read.nextLine();
		
		int row = 0;
		read.useDelimiter(",");
		
		while ( read.hasNext()) {
			
		}
		

	}

}
