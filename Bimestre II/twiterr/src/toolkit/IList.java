package toolkit;

public interface IList<TYPE> {

	public int count();
	public boolean empty();
	public TYPE get(int index);
	public TYPE first();
	public TYPE last();
	public void append(TYPE add);
	public boolean has(TYPE s);
	public boolean delete(int index);
	public boolean remove(TYPE s);
	public TYPE drop(int index);
	public void clean();
}
