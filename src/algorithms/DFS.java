package algorithms;

import java.util.Stack;

import classes.State;

public abstract class DFS<T> extends CommonSearcher<T>{
	
	public DFS() {
		newSearch();
	}

	protected void newSearch() {
		openlist= new Stack<State<T>>();
		setEvaluatedNodes(0);
		
	}

	protected boolean addToopenList(State<T> initailstate) {
		return ((Stack<State<T>>)openlist).add(initailstate);
	}

	protected State<T> popOpenList() {
		setEvaluatedNodes(getNUmberOfNodesEvaluted()+1);
		State<T> State= ((Stack<State<T>>) openlist).pop();
		return State;
	}

}
