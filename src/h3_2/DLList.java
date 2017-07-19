package h3_2;

public class DLList<E> {
	private Node<E> head;
	private Node<E> back;
	private int length;
	
	public DLList(){
		this.head = null;
		this.back = null;
		this.length = 0;
	}
	
	public boolean isEmpty(){
		if(length == 0){return true;}
		else{return false;}
	}
	
	public void append(E data){
		Node<E> temp = new Node<E>(data);
		if(this.isEmpty()){
			this.head = temp;
			this.back = this.head;
			length++;
		}
		else{
			this.back.setNext(temp);
			temp.setPrevious(this.back);
			this.back = temp;
			length++;
		}
	}
	
	public Node<E> findByPosition(int position){
		Node<E> temp = this.head;
		for(int i = 1; i < position; i++){
			temp = temp.getNext();
		}//end of for loop
		return temp;
	}//end of findByPosition
	
	public void addAfter(int position, E data){
		Node<E> previous = this.findByPosition(position);
		Node<E> next = previous.getNext();
		Node<E> temp = new Node<E>(data);
		
		previous.setNext(temp);
		next.setPrevious(temp);
		temp.setNext(next);
		temp.setPrevious(previous);
		length++;
	}
	
	public void addBefore(int position, E data){
		Node<E> next = this.findByPosition(position);
		Node<E> previous = next.getPrevious();
		Node<E> temp = new Node<E>(data);
		
		previous.setNext(temp);
		next.setPrevious(temp);
		temp.setNext(next);
		temp.setPrevious(previous);
		length++;
	}
	
	public void deleteAfter(int position){
		Node<E> previous = this.findByPosition(position);
		Node<E> next = previous.getNext().getNext();
		
		previous.setNext(next);
		next.setPrevious(previous);
		length--;
	}
	
	public void deleteBefore(int position){
		Node<E> next = this.findByPosition(position);
		Node<E> previous = next.getPrevious().getPrevious();
		
		next.setPrevious(previous);
		previous.setNext(next);
		length--;
	}
	
	public String[] toStringArray(){
		String [] output = new String[this.length];
		for(int i = 1; i <= this.length; i++){
			String temp = this.findByPosition(i).getData().toString();
			output[i-1] = temp;
		}
		return output;
	}
	
	public int length(){
		return this.length;
	}
	
	public void addBeforeNode(Node<E> node, E data){
		Node<E> temp = new Node<E>(data);
		temp.setNext(node);
		temp.setPrevious(node.getPrevious());
		node.getPrevious().setNext(temp);
		node.setPrevious(temp);
		length++;
	}
	
	public void addAfterNode(Node<E> node, E data){
		Node<E> temp = new Node<E>(data);
		temp.setPrevious(node);
		temp.setNext(node.getNext());
		node.getNext().setPrevious(temp);
		node.setNext(temp);
		length++;
	}
	
	public void setFirst(E data){
		Node<E> temp = new Node<E>(data);
		temp.setNext(this.head);
		this.head.setPrevious(temp);
		this.head = temp;
		length++;
	}
	
	public boolean isHead(Node<E> node){
		if(this.head == node){return true;}
		else{return false;}
	}
	
	public boolean isBack(Node<E> node){
		if(this.back == node){return true;}
		else{return false;}
	}
}
