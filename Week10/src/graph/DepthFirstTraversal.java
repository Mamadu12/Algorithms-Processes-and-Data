package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DepthFirstTraversal<T> extends AdjacencyGraph<T> implements Traversal<T> {

	private List<T> traversal = new ArrayList<T>();
	private Set<T> visited = new HashSet<T>();


	@Override
	public List<T> traverse() throws GraphError {
		T next = nextUnvisited();
		while(next !=null){
			traversalDesc(next);
			next = nextUnvisited();
		}
		return traversal;
	}


	private void traversalDesc(T next) throws GraphError {
		visitedNode(next);
		for(T n: neighbours(next))
		{
			if(!hasVisited(n)){
				traversalDesc(n);
			}
		}	
	}
	private boolean hasVisited(T n) {
		// TODO Auto-generated method stub
		return visited.contains(n);
	}


	private T nextUnvisited() {
		for(T node: getNodes()){
			if(!visited.contains(node)){
				return node;
			}
		}
		return null;
	}

	public void visitedNode(T node){
		if(visited.contains(node))
			return;
		traversal.add(node);
		visited.add(node);
	}
}

