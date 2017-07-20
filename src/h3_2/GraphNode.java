package h3_2;

public class GraphNode {
	private DLList<GraphEdge> adjacencyedge = new DLList<GraphEdge>();
	private String name;
	
	public GraphNode(String name){
		this.name = name;
	}
	
	public void addEdge(GraphNode to){
		GraphEdge temp = new GraphEdge(this,to);
		adjacencyedge.append(temp);
	}
	
	public String toString(){
		return this.name;
	}
	
	public DLList<GraphEdge> getAdjacencyList(){
		return this.adjacencyedge;
	}
	
	public void addStack(Stack<GraphNode> stack){
		for(int i = 1; i <= this.adjacencyedge.length(); i++){
			stack.append(this.adjacencyedge.findByPosition(i).getData().getTo());
		}
	}
	
	public void addQueue(Queue<GraphNode> queue){
		for(int i = 1; i <= this.adjacencyedge.length(); i++){
			queue.append(this.adjacencyedge.findByPosition(i).getData().getTo());
		}
	}
}
