package ar.edu.unlp.info.oo2.patrones_ejercicio_4;

public class StateInProgress extends State {

	@Override
	public void togglePause(ToDoItem toDoItem) {
		toDoItem.setState(new StatePaused());
	}
	
	@Override
	public void finish(ToDoItem toDoItem) {
		toDoItem.setState(new StateFinished());
	}
	
}
