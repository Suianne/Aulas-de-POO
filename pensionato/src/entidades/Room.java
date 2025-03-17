package entidades;

public class Room {
	private String name;
	private String email;
	private int numberOfRoom;
	
	public Room() {
		
	}

	public Room(String name, String email, int numberOfRoom) {
		super();
		this.name = name;
		this.email = email;
		this.numberOfRoom = numberOfRoom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumberOfRoom() {
		return numberOfRoom;
	}

	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}

	@Override
	public String toString() {
		return ":" + name + ", " + email;
	}
	
	
	
}
