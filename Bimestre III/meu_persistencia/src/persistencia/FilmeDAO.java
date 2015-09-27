package persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FilmeDAO implements DAO<Filme> {
	///////////////////////////////////////////////
		// ESTÁ COM ERROS NÃO RESOLVIDOS //
	///////////////////////////////////////////////
	@Override
	public void save(Filme f) {
		System.out.println(f.getNumero());
		if (f.getNumero() != 0 && f.getTitulo() != null
				&& f.getGenero() != null && f.getAno() != 0) {
			
			if (validateNumero(""+f.getNumero())) {
				
				File file = new File("filmes.csv");
				if ( ! file.exists()) { 
					try {
						FileWriter fi = new FileWriter(file);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // make directory;
				}

				Scanner scan = null;
				try {
					scan = new Scanner(file);
					ArrayList<String> lista = new ArrayList<String>();

					StringBuilder builder = new StringBuilder();
					while (scan.hasNextLine()) {
						String line = scan.nextLine();
						builder.append(line);
						builder.append("\n");

					}

					builder.append(f.getNumero());
					builder.append(";");
					builder.append(f.getTitulo());
					builder.append(";");
					builder.append(f.getGenero());
					builder.append(";");
					builder.append(f.getAno());
					builder.append(";");
					addNumeroToList(f);
					FileWriter writer;
					try {
						writer = new FileWriter(file);
						writer.write(builder.toString() + "\n");
						
						writer.flush();
						writer.close();
					} catch (IOException e) {
					
						e.printStackTrace();
					}
		
				
					
					
			

				} catch (Exception e) {
					e.printStackTrace();
				}
		
			}	
		}

	}

	private void addNumeroToList(Filme f) throws IOException {

		File numeros = new File("numeros.csv");
		if (!numeros.exists()) {
			FileWriter e = new FileWriter("numeros.csv");
			e.flush();
			e.close();
		}

		Scanner scan = new Scanner(numeros);

		ArrayList<String> lista = new ArrayList<String>();

		if (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] columns = line.split(";");
			for (int i = 0; i < columns.length; i++) {
				lista.add(columns[i]);
			}

			scan.close();

			numeros.delete();

			FileWriter numeros2 = new FileWriter("numeros.csv");

			StringBuilder builder2 = new StringBuilder();
			for (int i = 0; i < lista.size(); i++) {
				builder2.append(lista.get(i));

				builder2.append(";");
			}

			builder2.append(f.getNumero());
			builder2.append(";");

			numeros2.write(builder2.toString());
			numeros2.flush();
			numeros2.close();

		} else {
			FileWriter ems = new FileWriter("numeros.csv");
			ems.append("" + f.getNumero());
			ems.append(";");
			ems.flush();
			ems.close();

		}

	}

	private boolean validateNumero(String numero) {

		File numeros = new File("numeros.csv");

		Scanner scan;
		try {
			scan = new Scanner(numeros);
		} catch (FileNotFoundException e) {

			return true;
		}
		ArrayList<String> lista = new ArrayList<String>();

		if (scan.hasNextLine()) {
			String line = scan.nextLine();
			scan.close();
			String[] columns = line.split(";");
			for (int i = 0; i < columns.length; i++) {
				lista.add(columns[i]);
			}

			for (int i = 0; i < lista.size(); i++) {

				if (lista.get(i).equals(numero))
					return false;
			}
		}

		return true;

	}
		

	@Override
	public void delete(Filme f) {
		ArrayList<Filme> filmes = findAll();
		System.out.println(filmes);
		filmes.remove(f);	
		System.out.println(filmes);
		File file = new File("filmes.csv");
		
		file.renameTo(new File("filmes2.csv"));
		
		for (int j = 0; j < filmes.size(); j++) {
			save(filmes.get(j));
		}
		
	}

	@Override
	public Filme load(int chave) {
		ArrayList<Filme> filmes;
		filmes = findAll();
		for (int i = 0; i < filmes.size(); i++) {
			if (filmes.get(i).getNumero() == chave) return filmes.get(i);
		}
		return null;
		
	}

	@Override
	public void update(Filme f) {
		ArrayList<Filme> filmes = findAll();
		for(int i = 0; i < filmes.size(); i++) {
			if (filmes.get(i).equals(f)) {
				filmes.set(i, f);
			}
		}
		File file = new File("filmes.csv");
		file.delete();
		
		for (int j = 0; j < filmes.size(); j++) {
			save(filmes.get(j));
		}
	}

	@Override
	public ArrayList<Filme> findAll() {
		File file = new File("filmes.csv");
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		Scanner scan;
		try {
			scan = new Scanner(file);
		
			while(scan.hasNextLine()) {
				String row = scan.nextLine();
				String[] columns = row.split(";");
				Filme f = new Filme();
				if(Integer.parseInt(columns[0]) != 0) f.setNumero(Integer.parseInt(columns[0]));
				if(!columns[1].equals(null)) f.setTitulo(columns[1]);
				if(!columns[2].equals(null)) f.setGenero(columns[2]);
				if(Integer.parseInt(columns[3]) != 0) f.setAno(Integer.parseInt(columns[3]));
				filmes.add(f);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filmes;
	}
	


}
