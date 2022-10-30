package kodlamaioNLayeredApp.entities;

public class Course {
	private int id;
	private String name;
	private String instructoreName;
	private int unitPrice;
	
	
	public Course() {
		super();
	}


	public Course(int id, String name, String instructoreName, int unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.instructoreName = instructoreName;
		this.unitPrice = unitPrice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getInstructoreName() {
		return instructoreName;
	}


	public void setInstructoreName(String instructoreName) {
		this.instructoreName = instructoreName;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
	
	
	
}
