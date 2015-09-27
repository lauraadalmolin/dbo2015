package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

// geral ou abstrato
public interface DAO<T> {
	
	// métodos para salvar:
	// public void persist(T obj);
	// public void insert(T obj);
	// public void store(T obj);
	public void save(T obj);
	
	// métodos para excluir:
	// public void remove(T obj);
	public void delete(T obj);
	
	// métodos para carregar:
	// public T find(int chave);
	// public T open(int chave);
	// public T search(int chave);
	public T load(int chave);
	
	// método para atualizar/alterar registro existente:
	public void update(T obj);
	
	// método 
	public ArrayList<T> findAll();
	// public ArrayList<T> all();
	// public ArrayList<T> find();
	
	
}
