package ar.edu.unlp.info.oo2.patrones_ejercicio_4;

public class StatePending extends State {


	@Override
	public void start(ToDoItem toDoItem) {
		toDoItem.setState(new StateInProgress());
	}
	
	@Override
	public void togglePause(ToDoItem toDoItem) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress.");
	}

}
