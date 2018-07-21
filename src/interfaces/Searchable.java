package interfaces;

import java.util.Collection;

import classes.State;

public interface Searchable<T> {

	public State<T> getInitialState();
	@SuppressWarnings("rawtypes")
	public Collection<State<T>>  getAllPossibleStates(State s);
	public Boolean IsGoalState(State<T> s);
}
