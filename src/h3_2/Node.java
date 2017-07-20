package h3_2;

public class Node<E> {
	private E data;
	private Node<E> next;
	private  Node<E> previous;
	
	public E getData(){
		return this.data;
	}
	
	public Node<E> getNext(){
		return this.next;
	}
	
	public Node<E> getPrevious(){
		return this.previous;
	}
	
	public void setData(E data){
		this.data = data;
	}
	
	public void setNext(Node<E> next){
		this.next = next;
	}
	
	public void setPrevious(Node<E> previous){
		this.previous = previous;
	}
	
	public Node(E data){
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	
	public Node(){
		this.data = null;
		this.next = null;
		this.previous = null;
	}
	
	public String toString(){
		return this.data.toString();
	}
	

}
