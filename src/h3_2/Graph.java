package h3_2;

public class Graph {
	private GraphNode head;
	private DLList<GraphNode> NodeList;
	private DLList<DLList> AdjacencyEdgeList;
	
	public Graph(){
		NodeList = new DLList<GraphNode>();
		AdjacencyEdgeList = new DLList<DLList>();
	}
	
	public void addPeople(GraphNode node){
		if(this.NodeList.length() == 0){
			NodeList.append(node);
			this.head = node;
		}
		else{
			NodeList.append(node);
		}
	}
	
	public void addPath(GraphNode from, GraphNode to){
		for(int i = 1; i <= NodeList.length(); i++){
			if(NodeList.findByPosition(i).getData().equals(from)){
				GraphNode temp = (GraphNode)NodeList.findByPosition(i).getData();
				temp.addEdge(to);
			}
		}
	}
	
	public void addAdjacencyList(GraphNode node){
		AdjacencyEdgeList.append(node.getAdjacencyList());
	}
	
	public GraphNode getHead(){
		return this.head;
	}
	
	
}
