package br.com.bytebank.banco.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacão {

	public static void main(String[] args) throws IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Nico", null);
		cliente.setProfissao("Dev", null);
		cliente.setCpf("234113131");
		
		ContaCorrente cc = new ContaCorrente(0, 0);
		cc.setTitular(cliente);
		((Object) cc).deposita(222, 3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cliente);
		oos.close();
	}
}
