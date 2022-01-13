package fr.dauphine.javaavance.td6;

public class Cell {
	private String value ;
	private Cell succ ;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Cell getSucc() {
		return succ;
	}
	public void setSucc(Cell succ) {
		this.succ = succ;
	}
	public Cell(String value) {
		this(value, null);
	}
	
	public Cell(String s, Cell succ) {
		this.value = s ;
		this.succ = succ ;
	}
	
	

	

}
