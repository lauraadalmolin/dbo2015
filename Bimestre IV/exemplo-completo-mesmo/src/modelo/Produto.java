package modelo;

import java.util.ArrayList;

public class Produto {
	
	private int codigo;
	private String descricao;
	private double preco;
	public static final ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	static {
		
		
		produtos.add(new Produto(189741, "TV 50' LG", 2349.9));
		produtos.add(new Produto(324723, "MicroSystem Sony", 1455.9));
		produtos.add(new Produto(187423, "iPhone 6s Plus", 3499.9));
		produtos.add(new Produto(478065, "Bluray Player", 762.9));
		produtos.add(new Produto(798942, "iPad Pro", 3445.9));
	
	}
	
	public Produto() {
		
	}
	
	public Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}	
	

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao
				+ ", preco=" + preco + "]";
	}
	
	
}
