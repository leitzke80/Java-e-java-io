package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Lorem ipsum dolar sit amet, consecteur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("asfasdfsafdas dfs sdf asf assdB");
		
		bw.close();
	}
}
