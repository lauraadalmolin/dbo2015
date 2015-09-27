package recursion;

public interface IList {

	public void append(Object o);

	public Object get(int index);

	public Object first();

	public Object last();

	public Object drop(int index);

	public boolean delete(int index);

	public boolean remove(Object o);

	public void clean();

	public int count();

	public boolean has(Object o);

	public boolean empty();

}
