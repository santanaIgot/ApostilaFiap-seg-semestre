package br.com.arquivos.exemplo01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDeArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader inputStream = new FileReader("exemplo.txt");
			BufferedReader arquivoEntrada = new BufferedReader(inputStream);
			
			String linha;
			
			while((linha=arquivoEntrada.readLine()) != null) {
				System.out.println(linha);
			}// se tiver alguma coisa no arquivo vai printar, caso contrario não ira printr
			
			FileWriter escrever = new FileWriter("Escreva o que esta gravado no arquiv")
			
			inputStream.close();
			arquivoEntrada.close();
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
