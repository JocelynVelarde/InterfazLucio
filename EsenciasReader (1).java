package objetos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EsenciasReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub 
		
		Esencias[] array = new Esencias[700];
		
		String path = "/Users/macbookpro/Documents/Main/Escuela/PrepaTec /INFO Internal/Practica/Documentos prueba/Ventas.csv";
		String line = "";
		
		try {	
			BufferedReader br = new BufferedReader (new FileReader(path));
			
			while ((line = br.readLine()) != null) {
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
						
}
		

	}

