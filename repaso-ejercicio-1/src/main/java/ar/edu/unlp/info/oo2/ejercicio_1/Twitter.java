package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<User> users = new ArrayList<User>();
	
	public List<User> getUsers() {
		return this.users;
	}
	
	public void createUser(String screenName) {
		User user = new User(screenName);
		
		if (!this.users.contains(user)) {
			this.users.add(user);
		}
	}
	
	public void deleteUser(String screenName) {
		User user = this.findUser(screenName);
		
		if (user != null) {
			user.deleteTweets();
			this.users.remove(user);
		}
	}
	
	public User findUser(String screenName) {
		return this.users.stream()
				.filter(u -> u.getScreenName() == screenName)
				.findFirst()
				.orElse(null);
	}
}
