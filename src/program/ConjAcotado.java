package program;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ConjAcotado {
	
	private LinkedList<Integer> elems = new LinkedList<Integer>();
	private Vector<ListIterator<Integer>> index = new Vector<ListIterator<Integer>>();
	
	public ConjAcotado() {}
	
	public ConjAcotado(Integer cota) {
		for(Integer i = 0; i < cota; ++i) {
	        index.add(elems.listIterator()); //elems.end()
	    }
	}
	
	public Boolean pertenece(Integer elem) {
		return index.elementAt(elem).hasNext();
	}
	
	public void agregar(Integer elem) {
		elems.addFirst(elem);
		index.setElementAt(elems.listIterator(), elem);
	}
	
	public void eliminar(Integer elem) {
		elems.remove(index.elementAt(elem).next());
		index.setElementAt(elems.listIterator(elems.size()), elem); //elems.end()
	}
	
	public Boolean empty() {
		return elems.isEmpty();
	}
	
	public Integer cota() {
		return index.size();
	}
	
	public Integer size() {
		return elems.size();
	}
	
	IteratorConjAcotado iterator(){
		IteratorConjAcotado iter = new IteratorConjAcotado(elems.listIterator());
		return iter;
	}
	
	public static void main(String[] args) {

		ConjAcotado conj = new ConjAcotado(10);
		conj.agregar(3);
		conj.agregar(7);
		conj.agregar(4);
		conj.agregar(9);
		conj.agregar(5);
		
		if (conj.pertenece(5))
			conj.eliminar(5);
		
		IteratorConjAcotado iter = conj.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
}
