package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Filme;

public class FilmeDAO implements DAO<Filme> {

	@Override
	public void save(Filme f) {
		try {
			// diret�rio
			File dir = new File("filmes");
			if (!dir.exists()) dir.mkdir();
			// arquivo individual
			File arq = new File("filmes/" + f.getNumero() + ".csv");
			if (arq.exists()) return;
			// gravar os dados
			FileWriter writer = new FileWriter(arq);
			writer.write(f.getNumero() + ";");
			writer.write(f.getTitulo() + ";");
			writer.write(f.getGenero() + ";");
			writer.write(f.getAno() + "\n");
			// fechar o arquivo
			writer.flush();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Filme f) {
		try {
			File arq = new File("filmes/" + f.getNumero() + ".csv");
			// se o arquivo n�o existe n�o continua
			if ( ! arq.exists()) return; // p�ra a execu��o do m�todo
			// exclui o arquivo
			arq.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public Filme load(int numero) {		
		try {
			File arq = new File("filmes/" + numero + ".csv");
			
			if ( ! arq.exists()) return null;
			
			Scanner scan = new Scanner(arq);
			String linha = scan.nextLine();
			scan.close();
			String[] colunas = linha.split(";");
			
			Filme f = new Filme();
			f.setNumero(numero);
			f.setTitulo(colunas[1]);
			f.setGenero(colunas[2]);
			f.setAno(Integer.parseInt(colunas[3]));
			return f;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void update(Filme f) {
		delete(f);
		save(f);
		
	}

	@Override
	public ArrayList<Filme> findAll() {
		ArrayList<Filme> lista = new ArrayList<Filme>();
		try {
			File dir = new File("filmes");		
			File[] arqs = dir.listFiles();
			for (File arq : arqs) { // for each
				Scanner scan = new Scanner(arq);
				String linha = scan.nextLine();
				scan.close();
				String[] colunas = linha.split(";");
				
				Filme f = new Filme();
				f.setNumero(Integer.parseInt(colunas[0]));
				f.setTitulo(colunas[1]);
				f.setGenero(colunas[2]);
				f.setAno(Integer.parseInt(colunas[3]));
				lista.add(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}