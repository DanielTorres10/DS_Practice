import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {
    public static final int CAP=16; // default array capacity
	private E[ ] data; // generic array used for storage
	private int size = 0; // current number of elements

	
	public MyArrayList(int CAPACITY) {
	    data = (E[]) new Object[CAPACITY]; // creates a new array with given cap, casting generic data tyoe
	}
	public MyArrayList(){
		this(CAP); 
	}
	
	@Override
	public boolean add(E e) {
		if(size == data.length) this.resize(data.length*2);
		data[size] = e; 
		size++;
		return true;
	}

	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException {
		this.checkIndex(i, size);
		if(size == data.length) this.resize(data.length*2);
		for(int k = size-1; k >= i;k--) {
			data[k+1] = data[k];
		}
		data[i] = e;	
		size++;
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		for(int i=0;i<data.length;i++) {
			if(this.get(i).equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i,size);
		return data[i];
	}

	protected void checkIndex(int i, int size) {
		if(i<0 || i>=size) throw new IndexOutOfBoundsException("Index: "+i+" not in range");	
	} 
	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	 public E remove(int i) throws IndexOutOfBoundsException { 
		checkIndex(i, size);
	 	E temp = data[i];
	 	for (int k=i; k < size-1; k++) { // shift elements to fill hole
	 		data[k] = data[k+1];
	 	}
	 	data[size-1] = null; // help garbage collection
	 	size--;
	 	return temp;
	 }

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException  {
		this.checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public List<E> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity]; // new array with bigger size
		for(int k=0; k<size; k++) {
			temp[k]=data[k];
		}
		data = temp;
	}

}
