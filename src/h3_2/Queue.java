package h3_2;

public class Queue<E> {
	private Node<E> first;
	private Node<E> back;
	private int length;
	
	public Queue(){
		this.first = new Node<E>();
		this.back = this.first;
		this.length = 0;
	}// end of constructor
	
	public boolean isEmptry(){
		if(length == 0){
			return true;
		}
		return false;
	}//end of isEmpty
	
	public void append(E data){
		Node<E> temp = new Node<E>(data);
		if(this.isEmptry()){
			this.first = temp;
			this.back = this.first;
			this.length++;
		}//append if queue is empty
		else{
			this.back.setNext(temp);
			this.back = temp;
			this.length++;
		}//append if queue is not empty
	}//end of append
	
	public Node<E> find(E data){
		Node<E> temp = this.first;
		for(int i = 0; i < this.length; i++){
			if(temp.getData() == data){
				return temp;
			}//return if found
			temp = temp.getNext();
		}//end of for loop
		return null;//return null if not found
	}//end of findByPosition
	
	public Node<E> findByPosition(int position){
		Node<E> temp = this.first;
		for(int i = 1; i < position; i++){
			temp = temp.getNext();
		}//end of for loop
		return temp;
	}//end of findByPosition
	
	public void delete(){
		//delete the last one
		Node<E> temp = first;
		for(int i = 2; i < this.length; i++){
			temp = temp.getNext();
		}
		this.back = temp;
		this.length--;
	}
	
	public boolean isExist(E data){
		Node<E> temp = this.first;
		for(int i = 0; i < this.length; i++){
			if(temp.getData() == data){
				return true;
			}//return if found
			temp = temp.getNext();
		}//end of for loop
		return false;//return null if not found
	}//end of findByPosition
	
	public void deleteFirst(){
		this.first = this.first.getNext();
		length--;
	}
	
	public int getLength(){
		return this.length;
	}
}
