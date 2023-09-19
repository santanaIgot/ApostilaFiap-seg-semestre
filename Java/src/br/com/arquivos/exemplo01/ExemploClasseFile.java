package br.com.arquivos.exemplo01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploClasseFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File arquivo = new File("texto.txt");
			
			if(!arquivo.exists())//verifica se arquivo existe
				arquivo.createNewFile(); //Cria novo arqivo
			
			FileWriter inputStream = new FileWriter(arquivo); //escreve no arquivo 
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
