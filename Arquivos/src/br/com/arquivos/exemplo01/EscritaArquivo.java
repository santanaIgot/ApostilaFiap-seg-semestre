package br.com.arquivos.exemplo01;

import java.io.FileWriter;//ele abreum arquivo com modo de saida
import java.io.IOException;
import java.io.PrintWriter;//Esta classe printa os caracteres

public class EscritaArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//filewriter é uma classe que lê o arquivo
			//criar outputstream
			//tem que ser dentro de uma excessão pq se nao da erro
			FileWriter outputStream = new FileWriter("exemplo.txt", true);
			
			//objeto para escrecver um arquivo 
			PrintWriter arquivoDeSaida = new PrintWriter(outputStream);
			
			arquivoDeSaida.print("teste");
			arquivoDeSaida.print("conteudo do arquivo");
			
			arquivoDeSaida.close();
			outputStream.close();
			
			
			}catch(IOException e) {
				e.printStackTrace();
			}
	}

}
