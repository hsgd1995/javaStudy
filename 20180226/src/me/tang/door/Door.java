package me.tang.door;

public abstract class Door {
	private String type;

	public Door() {
		super();
	}

	public Door(String type) {
		super();
		this.type = type;
	}

	public abstract void divide();
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
