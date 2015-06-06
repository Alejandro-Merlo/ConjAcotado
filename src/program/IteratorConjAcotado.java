package program;

import java.util.Iterator;
import java.util.ListIterator;

public class IteratorConjAcotado implements Iterator<Integer> {
	
	ListIterator<Integer> conj;
	
	IteratorConjAcotado(ListIterator<Integer> list) {
		conj = list;
	}

	@Override
	public boolean hasNext() {
		return conj.hasNext();
	}

	@Override
	public Integer next() {
		return conj.next();
	}

	@Override
	public void remove() {
		conj.remove();
	}

}
