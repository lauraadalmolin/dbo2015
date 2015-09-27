package persistence;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicaDAO implements DAO<Musica> {

	@Override
	public void save(Musica m) {
		try {
			// diretório
			File dir = new File("musicas");
			if (!dir.exists()) dir.mkdir();
			// arquivo individual
			File arq = new File("musicas/" + m.getCodigo() + ".csv");
			if (arq.exists()) return;
			// gravar os dados
			FileWriter writer = new FileWriter(arq);
			writer.write(m.getCodigo() + ";");
			writer.write(m.getArtista() + ";");
			writer.write(m.getTitulo() + ";");
			writer.write(m.getAno() + ";");
			writer.write(m.getDuracao().toString() + "\n");
			// fechar o arquivo
			writer.flush();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Musica m) {
		try {
			
			File arq = new File("musicas/" + m.getCodigo() + ".csv");
			
			if ( ! arq.exists()) return;
			
			arq.delete();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}

	@Override
	public Musica load(int chave) {
		try {
			File arq = new File("musicas/" + chave + ".csv");
			
			if ( ! arq.exists()) return null;
			
			Scanner scan = new Scanner(arq);
			String linha = scan.nextLine();
			String[] colunas = linha.split(";");
			
			Musica m = new Musica(colunas[1], colunas[2], Integer.parseInt(colunas[3]), colunas[4], Integer.parseInt(colunas[0]));
			return m;		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void update(Musica obj) {
		delete(obj);
		save(obj);
		
	}

	@Override
	public ArrayList<Musica> findAll() {
		ArrayList<Musica> lista = new ArrayList<Musica>();
		try {
			File dir = new File("musicas");		
			File[] arqs = dir.listFiles();
			for (File arq : arqs) { // for each
				Scanner scan = new Scanner(arq);
				String linha = scan.nextLine();
				String[] colunas = linha.split(";");
				
				Musica m = new Musica();
				m.setCodigo(Integer.parseInt(colunas[0]));
				m.setArtista(colunas[1]);
				m.setTitulo(colunas[2]);
				m.setAno(Integer.parseInt(colunas[3]));
				m.setDuracao(colunas[4]);
				lista.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	

}
