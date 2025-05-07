package ar.edu.unlp.info.oo2.patrones_ejercicio_4;

public class ToDoItem {
	
	private String name;
	private State currentState;
	private String comment;
	
	/**
	 * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	 */
	public ToDoItem(String name) {
		this.name = name;
		this.currentState = new StatePending();
	}
	
	/**
	 * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	 * pending. Si se encuentra en otro estado, no hace nada.
	 */
	public void start() {
		currentState.start(this);
	}
	
	/**
	 * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si
	 * estado es paused. Caso contrario (pending o finished) genera un error
	 * informando la causa especifica del mismo.
	 */
	public void togglePause() {
		currentState.togglePause(this);
	}
	
	/**
	 * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
	 * in-progress o paused. Si se encuentra en otro estado, no hace nada.
	 */
	public void finish() {
		currentState.finish(this);
	}
	
	/**
	 * Retorna el tiempo que transcurrio desde que se inicio el ToDoItem (start)
	 * hasta que se finalizo. En caso de que no este finalizado, el tiempo que
	 * haya transcurrido hasta el momento actual. Si el ToDoItem no se inicio,
	 * genera un error informando la causa especifica del mismo. 
	 */
	// public Duration workedTime() {	
	// }
	
	/**
	 * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado.
	 * Caso contrario, no hace nada.
	 */
	public void addComment(String comment) {
		currentState.addComment(this, comment);
	}
	
	public void setState(State state) {
		this.currentState = state;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
}

