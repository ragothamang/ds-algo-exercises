package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearch {
	static class Node {
	    String name;
	    List<Node> children = new ArrayList<Node>();

	    public Node(String name) {
	      this.name = name;
	    }

	    public List<String> depthFirstSearch(List<String> array) {
	      // Write your code here.
	      array.add(this.name);
	      for(Node child : this.children){
	        if(!array.contains(child.name)){
	          child.depthFirstSearch(array);
	        }
	      }
	      return array;
	    }

	    public Node addChild(String name) {
	      Node child = new Node(name);
	      children.add(child);
	      return this;
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeF = new Node("F");
		Node nodeD = new Node("D");
		Node nodeG  = new Node("G");
		nodeA.addChild("B");
		nodeA.addChild("C");
		nodeA.addChild("D");
		nodeB.addChild("E");
		nodeB.addChild("F");
		nodeF.addChild("I");
		nodeF.addChild("J");
		nodeD.addChild("G");
		nodeD.addChild("H");
		nodeG.addChild("K");

		List<String> str = new ArrayList<String>(List.of("A","B","F","D","G"));
		System.out.println(str);
		List<String> rst = nodeA.depthFirstSearch(str);
		
		System.out.println(rst);
	}

}
