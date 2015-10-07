package persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import web.*;

import model.Post;



public class PostDAO {
	
	private int code = 1;
	
	public void generateCode () {
		File f = new File("code.csv");
		if (f.exists()) {
			
			try {
				Scanner scan = new Scanner(f);
				String linha = scan.nextLine();
				String[] colunas = linha.split(";");
				code = Integer.parseInt(colunas[colunas.length - 1]) + 1;
				scan.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
				 
		try {
			FileWriter writer = new FileWriter("code.csv");
			writer.write(this.code + ";");
			writer.flush(); 
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
	}
	
	public void save (Post p) {
		try {
			generateCode();
			p.setCode(this.code);
			// diretório
			File dir = new File("posts");
			if (!dir.exists()) dir.mkdir();
			// arquivo individual
			File arq = new File("posts/" + p.getCode() + ".txt");
			if (arq.exists()) return;
			// gravar os dados
			String[] columns = p.getText().split("\n");
			FileWriter writer = new FileWriter(arq);
			writer.write(p.getTitle() + ";");
			for (int i = 0; i < columns.length; i++) {
				writer.write((columns[i])+";");
			}
			// fechar o arquivo
			writer.flush();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Post> findAll() {
		ArrayList<Post> lista = new ArrayList<Post>();
		try {
			File dir = new File("posts");		
			File[] arqs = dir.listFiles();
		
			//File[] arqs_order = new File[arqs.length];
			
			//for (int j = arqs.length; j >= 1; j--) {
//				for (int i = 0; i < arqs.length; i++) {
//					if (Integer.parseInt(arqs[i].getName()) == 1) {
//						arqs_order[j - 1] = arqs[i];
//					}
//				}
//			//}
			//int a = arqs.length;
			for (File arq : arqs) { // for each
				Scanner scan = new Scanner(arq);
				String text = scan.nextLine();
				String[] columns = text.split(";");
				scan.close();
				Post post = new Post();
				post.setTitle(Markdown.toHTML(columns[0]));
				System.out.println(post.getTitle());
				String s = arq.getName().replace(".txt", " ");
				s = s.trim();
				post.setCode(Integer.parseInt(s));
				s = "";
				for (int i = 1; i < columns.length; i++) {
					s = s + Markdown.toHTML(columns[i]);
				}
				post.setText(s);
				//a--;
				//lista.add(a, post);
				lista.add(post);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<Post> listanova = new ArrayList<Post>();
		int j = 0;
		for (int i = lista.size() -1; i >= 0; i--) {
			listanova.add(j, lista.get(i));
			j++;
		}
		
		return listanova;
	}
	
	
}
