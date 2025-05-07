package ar.edu.unlp.info.oo2.patrones_ejercicio_4;

public abstract class State {
	
	public void start(ToDoItem toDoItem) {
		return;
	}
	
	public void togglePause(ToDoItem toDoItem) {
		return;
	}
	
	public void finish(ToDoItem toDoItem) {
		return;
	}
	
	public void addComment(ToDoItem toDoItem, String comment) {
		toDoItem.setComment(comment);
	}
	
}
