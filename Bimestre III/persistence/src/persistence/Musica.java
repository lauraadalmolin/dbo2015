package persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Musica {
	
	private String artista;
	private String titulo;
	private int ano;
	private Duracao duracao;
	private int codigo;
	
	public Musica(String artista, String titulo, int ano, Duracao duracao , int codigo) {
		this.artista = artista;
		this.titulo = titulo;
		this.ano = ano;
		this.duracao = duracao;
		this.codigo = codigo;
		/*
		File arq = new File ("codes.csv");
		if (! arq.exists()) {
			try {
				FileWriter f = new FileWriter("codes.csv");
				codigo = 1;
				f.write(1+"");
				f.flush();
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		else {
			try {
				Scanner scan = new Scanner(arq);
				String s = scan.nextLine();
				int n = Integer.parseInt(s);
				codigo = n + 1;
				arq.delete();
				try {
					FileWriter f = new FileWriter("codes.csv");
					f.write(codigo+"");
					f.flush();
					f.close();					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
						
		}
*/		
				
	}

	@Override
	public String toString() {
		return "Musica [artista=" + artista + ", titulo=" + titulo + ", ano="
				+ ano + ", duracao=" + duracao + ", codigo=" + codigo + "]";
	}

	public Musica() {
		
	}

	public Musica(String artista2, String titulo2, int parseInt, String string, int parseInt2) {
		this.artista = artista2;
		this.titulo = titulo2;
		this.ano = parseInt;
		fixDuracao(string);
		this.codigo = parseInt2;
	}

	public String getArtista() {
		return artista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Duracao getDuracao() {
		return duracao;
	}

	public void setDuracao(String colunas) {
		fixDuracao(colunas);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int chave) {
		codigo = chave;
		
	}

	public void fixDuracao(String string) {
		String[] colunas = string.split(":");
		duracao = new Duracao(Integer.parseInt(colunas[0]), Integer.parseInt(colunas[1]));
		
	}



	

}
