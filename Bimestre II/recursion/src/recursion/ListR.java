package recursion;


/**
 * 
 * @author João Victor Acosta
 *
 */

public class ListR  {
	
	protected Object[] list = new Object[10];
		
	
	
	public ListR () {
		this.clean();
	}
	
	
	public void append (Object o) {
	
		if (o != null) {
			boolean test = false;
			int i = 0;
			test = for1(o, i);
			if (test == false) {	
				Object[] temp = new Object[list.length+10];
				i = 0;
				temp = for2(i, temp);
				temp[list.length] = o;
				list = temp;
			}
		}
	}	
	
	public boolean for1 (Object o, int j) {
		if (j < list.length) {
			if (list[j] == null) {
				list[j] = o;
				return true;
			}
			return for1(o, j + 1);
		}
		return false;
	}
	
	public Object[] for2 (int i, Object[] temp) {
		if (i == list.length) return temp;
		temp[i] = list[i];
		return for2(i + 1, temp);
	}
	
	public Object get(int index) {
		if (index >= 0 && index < this.count()) return (Object) list[index];
		return null;
	}

	public Object first() {
		if (list[0] != null) return (Object) list[0];
		return null;
	}
	
	public Object last() {
		int a = this.count();
		if (a == 0) return (Object) list[0];
		return list[a-1];
	}

	public Object drop(int index) {
		if (index >= 0 && index < count()) {
			Object n = new Object();
			n = list[index];
			this.delete(index);
			return n;
		}
		return null;
	}

	public boolean delete(int index) {
		if (index >= 0 && index < count()) {
			if (list[index] == null) return false;
			list[index] = null;
			Object[] temp = new Object[list.length-1];
			int j = 0, i = 0;
			temp = for3(i, j, temp);
			list = temp;
			return true;
		}
		return false;
	}
	
	public Object[] for3 (int i, int j, Object[] temp) {
		if (i < list.length) {
			if(list[i] != null) {
				temp[j] = list[i];
				j++;
			}
			return for3(i + 1, j, temp);
		}
		return temp;
	}

	public boolean remove(Object o) {
		int i = 0;
		return for4(o, i);
	}
	
	public boolean for4(Object o, int i) {
		if(i < list.length) {
			if(list[i] == o) {
				this.delete(i);
				return true;
			}
			return for4(o, i + 1);
		}
		return false;
	}

	public void clean() {
		Object[] temp = {null, null, null, null, null, null, null, null, null, null};
		list = temp;
		
	}

	public int count() {
		int q = 0, i = 0;
		int j = for5(q, i);
		return j;
	}
	
	public int for5(int q, int i) {
		if (i < list.length) {
			if (list[i] != null) return for5 (q + 1, i + 1);
		}
		return q;
	}

	public boolean has(Object o) {
		int i = 0;
		return for6(i, o);
	}
	
	public boolean for6 (int i, Object o) {
		if(i < list.length) {
			if(list[i] == o) return true;
			return for6(i + 1, o);
		}
		return false;
	}
		
	public boolean empty() {
		int i = 0;
		return for7(i);
	}
	
	public boolean for7 (int i) {
		if(i == list.length) return true;
		if(list[i] != null) return false;
		return for7(i + 1);
		
	}

}
