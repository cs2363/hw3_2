package h3_2;

public class GraphEdge {
	private GraphNode from;
	private GraphNode to;
	
	public GraphEdge(GraphNode from, GraphNode to){
		this.from = from;
		this.to = to;
	}
	
	public GraphNode getFrom(){
		return this.from;
	}
	
	public GraphNode getTo(){
		return this.to;
	}
}
