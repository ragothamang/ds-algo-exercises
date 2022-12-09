package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graph.Graph.Vertex;


class Graph1{
	public Map<Vertex, List<Vertex>> adjVertices;

    Graph1() {
        this.adjVertices = new HashMap<Vertex, List<Vertex>>();
    }

    void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<Vertex>());
        
    }

    void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    void addEdge(String label1, String label2) {
    	
    	System.out.println("***********adding Edge   *********");
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        System.out.println("v1->   "+v1);
        
        System.out.println("adjVertices.get(v1) " +adjVertices.get(v1));
    	adjVertices.get(v1).add(v2);
    	
    	System.out.println("adjVertices.get(v1) after add   " +adjVertices.get(v1));
    	adjVertices.get(v2).add(v1);
    	/*
        if(adjVertices.get(v1)!=null && adjVertices.get(v2)!=null) {
        	
        }else {
        	List<Vertex> al = adjVertices.get(v1);
        	adjVertices.put(v1, al);
            al.add(v2);             
            List<Vertex> al2 = new ArrayList<Vertex>();
            adjVertices.put(v2, al2);
            al2.add(v1);
                    	
        }
        */
    }

    void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    List<Vertex> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }
    
    String printGraph() {
        StringBuffer sb = new StringBuffer();
        for(Vertex v : adjVertices.keySet()) {
            sb.append(v);
            sb.append(adjVertices.get(v));
        }
        return sb.toString();
    }

    class Vertex {
    	int count = 1;
        String label;
        Vertex(String label) {
            this.label = label;
        }
        
        @Override
        public int hashCode() {
        	System.out.println("hashcode is generated when object is created  "+ count++);
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + ((label == null) ? 0 : label.hashCode());
            return result;
        }
     
        @Override
        public boolean equals(Object obj) {
        	System.out.println("from equals-->   "   + count++);
        	System.out.println("equal getting invovked   ");
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            
            System.out.println("obj in equal method  "+obj);
            
            Vertex other = (Vertex) obj;
            
            System.out.println("other in equal method  "+other);
            
            System.out.println(obj.getClass() );
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (label == null) {
                if (other.label != null)
                    return false;
            } else if (!label.equals(other.label))
                return false;
            
            System.out.println("obj ->   "+ obj);
            System.out.println("other ->   "+ other);
            return true;
        }
        

        @Override
        public String toString() {
            return label;
        }
  
		
		  private Graph1 getOuterType() { return Graph1.this; }
		  
    }
}

public class BasicGraphCreation {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph1 graph = new Graph1();
		
        graph.addVertex("Bob");    
        System.out.println(graph);
        
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        
        System.out.println(graph.adjVertices);
        
        graph.addEdge("Bob", "Alice");
//        graph.addEdge("Bob", "Rob");
//        graph.addEdge("Alice", "Mark");
//        graph.addEdge("Rob", "Mark");
//        graph.addEdge("Alice", "Maria");
//        graph.addEdge("Rob", "Maria");
        
        System.out.println(graph.printGraph());
	}

	
	
}
