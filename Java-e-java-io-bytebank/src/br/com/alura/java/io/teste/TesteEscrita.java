package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo
		OutputStream fos = new FileOutputStream("lorem.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolar sit amet, consecteur adipiscing elit, sed do eiusmod");
//		bw.newLine();
		bw.newLine();
		bw.write("asfasdfsafdas dfs sdf asf assdB");
		
		bw.close();
	}
}
