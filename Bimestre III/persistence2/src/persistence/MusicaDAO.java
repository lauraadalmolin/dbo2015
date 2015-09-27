package persistence;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicaDAO implements DAO<Musica> {

		@Override
		public void store(Musica m) {
			try {
				// diretório
				File dir = new File("musicas");
				if (!dir.exists()) dir.mkdir();
			
				File arq = new File("musicas/" + m.getNumero() + ".csv");
				if (arq.exists()) return;
				
				FileWriter writer = new FileWriter(arq);
				writer.write(m.getNumero() + ";");
				writer.write(m.getNome() + ";");
				writer.write(m.getBanda() + ";");
				writer.write(m.getAndamento() + ";");
				writer.write(m.getAno() + "\n");
		
				writer.flush();
				writer.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

		@Override
		public void delete(Musica f) {
			try {
				File arq = new File("musicas/" + f.getNumero() + ".csv");
				// se o arquivo não existe não continua
				if ( ! arq.exists()) return; 
		
				arq.delete();
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}

		@Override
		public void update(Musica m) {
			delete(m);
			store(m);
			
		}

		@Override
		public ArrayList<Musica> list() {
			ArrayList<Musica> lista = new ArrayList<Musica>();
			try {
				File dir = new File("filmes");		
				File[] arqs = dir.listFiles();
				for (File arq : arqs) { // for each
					Scanner scan = new Scanner(arq);
					String linha = scan.nextLine();
					String[] colunas = linha.split(";");
					
					Musica f = new Musica();
					f.setNumero(Integer.parseInt(colunas[0]));
					f.setNome(colunas[1]);
					f.setBanda(colunas[2]);
					f.setAndamento(colunas[3]);
					f.setAno(Integer.parseInt(colunas[4]));
					lista.add(f);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return lista;
		}

		@Override
		public Musica load(int chave) {
			try {
				File arq = new File("musicas/" + chave + ".csv");
				
				if ( ! arq.exists()) return null;
				
				Scanner scan = new Scanner(arq);
				String linha = scan.nextLine();
				String[] colunas = linha.split(";");
				
				Musica f = new Musica();
				f.setNumero(Integer.parseInt(colunas[0]));
				f.setNome(colunas[1]);
				f.setBanda(colunas[2]);
				f.setAndamento(colunas[3]);
				f.setAno(Integer.parseInt(colunas[4]));
				return f;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;
		}
		

	}
	
