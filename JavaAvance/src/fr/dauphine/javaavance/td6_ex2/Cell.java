package fr.dauphine.javaavance.td6_ex2;

public class Cell<T> {
	private T value ;
	private Cell<T> succ ;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Cell<T> getSucc() {
		return succ;
	}
	public void setSucc(Cell<T> succ) {
		this.succ = succ;
	}
	public Cell(T value) {
		this(value, null);
	}
	
	public Cell(T s, Cell<T> succ) {
		this.value = s ;
		this.succ = succ ;
	}
	
	

	

}
