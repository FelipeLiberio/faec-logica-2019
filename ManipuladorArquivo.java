import java.nio.file.Files; 
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

import java.io.PrintWriter;
import java.io.File;

public class ManipuladorArquivo{

	public static void main (String [] args) throws IOException{ //throws IOException: se algo anormal acontecer jogue fora, interromper a execução do programa e cuspir o erro
		//Cria/abre um arquivo de nome.txt
		Path file = Paths.get("Felipe.txt");
		
		//Escreve uma String "Primeira linha" no arquivo
		Files.write(file, "Primeira linha ".getBytes());
		
		//Escreve uma String "Segunda linha" no arquivo
		Files.write(file, "Segunda linha ".getBytes(),StandardOpenOption.APPEND);
		
		//Apagar arquivo
		Files.delete(file);
		
		//Cria/abre um arquivo de nome.txt
		PrintWriter writer = new PrintWriter(new File("Turma.txt"));
		
		writer.println("Primeira Linha");
		
		writer.println("Segunda Linha");
		
		//Escrever numero de 0 a 100 no arquivo numeros.txt. Um numero em cada linha
		PrintWriter num = new PrintWriter(new File("Numeros.txt"));
		for(int i = 0; i <100; i++){
			String j = Integer.(i);
			num.println(j);
		}
		
		//Fechar arquivo
		writer.close();
		
	}
}