package algorithms;

import java.util.PriorityQueue;

import classes.State;

public class BestFirstSearch<T> extends CommonSearcher<T>{

	
	public BestFirstSearch() {
		newSearch();
	}

	@Override	
	protected void newSearch() {
		openlist= new PriorityQueue<State<T>>();
		setEvaluatedNodes(0);
	}
		
	@Override
	protected boolean addToopenList(State<T> initailstate) {
		// TODO Auto-generated method stub
		return ((PriorityQueue<State<T>>)openlist).add(initailstate);
	}


	@Override
	protected State<T> popOpenList() {
		setEvaluatedNodes(getNUmberOfNodesEvaluted()+1);
		State<T> State= ((PriorityQueue<State<T>>) openlist).poll();
		return State;
	}

}