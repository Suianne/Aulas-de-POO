package entidades;

public class Room {
	private String name;
	private String email;
<<<<<<< Updated upstream
=======
	private Integer numberOfRoom;
>>>>>>> Stashed changes
	
	public Room() {
		
	}

<<<<<<< Updated upstream
	public Room(String name, String email) {
=======
	public Room(String name, String email, Integer numberOfRoom) {
>>>>>>> Stashed changes
		super();
		this.name = name;
		this.email = email;
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

<<<<<<< Updated upstream
=======
	public int getNumberOfRoom() {
		return numberOfRoom;
	}

	public void setNumberOfRoom(Integer numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}

>>>>>>> Stashed changes
	@Override
	public String toString() {
		return ":" + name + ", " + email;
	}
	
	
	
}
