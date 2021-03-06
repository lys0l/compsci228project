package elements;

public class DLLNode <E> {

	private E info;
	private DLLNode<E> next;
	private DLLNode<E> prev;
	
	public DLLNode<E>(E info){
		this.info = info;
		next = null;
		prev = null;
	}
	
	public E getInfo() {
		return info;
	}
	
	public void setInfo(E info) {
		this.info = info;
	}
	
	public DLLNode getNext() {
		return next;
	}
	
	public void setNext(DLLNode next) {
		this.next = next;
	}
	
	public DLLNode getPrev() {
		return prev;
	}
	
	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}
	
}
