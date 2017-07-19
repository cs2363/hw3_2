package h3_2;

public class HappyTreeFriends {
	public static void main (String[] args){
		Graph HTF = new Graph();
		myGraph(HTF);
		BFS(HTF);
		
	}
	
	public static void myGraph(Graph HTF){
		GraphNode cuddles = new GraphNode("Cuddles");
		GraphNode pentunia = new GraphNode("Petunia");
		GraphNode giggles = new GraphNode("Giggles");
		GraphNode toothy = new GraphNode("Toothy");
		GraphNode flack = new GraphNode("Flaky");
		GraphNode flippy = new GraphNode("Flippy");
		GraphNode handy = new GraphNode("Handy");
		GraphNode lammy = new GraphNode("Lammy");
		GraphNode discobear = new GraphNode("Disco Bear");
		HTF.addPeople(cuddles);
		HTF.addPeople(pentunia);
		HTF.addPeople(giggles);
		HTF.addPeople(toothy);
		HTF.addPeople(flack);
		HTF.addPeople(flippy);
		HTF.addPeople(handy);
		HTF.addPeople(lammy);
		HTF.addPeople(discobear);
		HTF.addPath(cuddles, giggles);
		HTF.addPath(cuddles, toothy);
		HTF.addPath(pentunia, toothy);
		HTF.addPath(giggles, pentunia);
		HTF.addPath(giggles, flack);
		HTF.addPath(giggles, flippy);
		HTF.addPath(toothy, flack);
		HTF.addPath(toothy, lammy);
		HTF.addPath(flack, flippy);
		HTF.addPath(flippy, handy);
		HTF.addPath(lammy, discobear);
		HTF.addPath(discobear, cuddles);
		HTF.addPath(flack, lammy);
		HTF.addAdjacencyList(discobear);
		HTF.addAdjacencyList(lammy);
		HTF.addAdjacencyList(handy);
		HTF.addAdjacencyList(flippy);
		HTF.addAdjacencyList(flack);
		HTF.addAdjacencyList(toothy);
		HTF.addAdjacencyList(giggles);
		HTF.addAdjacencyList(pentunia);
		HTF.addAdjacencyList(cuddles);
	}
	
	public static void DFS(Graph HTF){
		GraphNode head = HTF.getHead();
		Stack<GraphNode> nodestack = new Stack<GraphNode>();
		Queue<GraphNode> appearred = new Queue<GraphNode>();
		System.out.println(head);
		head.addStack(nodestack);
		appearred.append(head);
		while(nodestack.getLength() != 0){
			while(!appearred.isExist(nodestack.findByPosition(1).getData())){
				GraphNode temp = nodestack.findByPosition(1).getData();
				System.out.println(temp);
				appearred.append(temp);
				nodestack.delete();
				temp.addStack(nodestack);
			}
			nodestack.delete();
		}
		
		return;
	}
	
	public static void BFS(Graph HTF){
		GraphNode head = HTF.getHead();
		Queue<GraphNode> nodequeue = new Queue<GraphNode>();
		Queue<GraphNode> appearred = new Queue<GraphNode>();
		System.out.println(head);
		head.addQueue(nodequeue);
		appearred.append(head);
		while(nodequeue.getLength() != 0){
			while(!appearred.isExist(nodequeue.findByPosition(1).getData())){
				GraphNode temp = nodequeue.findByPosition(1).getData();
				System.out.println(temp);
				appearred.append(temp);
				nodequeue.deleteFirst();
				temp.addQueue(nodequeue);
			}
			nodequeue.deleteFirst();
		}
	}
}
