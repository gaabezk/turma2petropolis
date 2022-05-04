package application;

public enum Turno {

	MANHA(1,"manha"),
	TARDE(2,"tarde"),
	NOITE(3,"noite");
	
	
	private String desc;
	private int id;

	Turno(int id,String desc) {
		this.desc = desc;
		this.id = id;
	}


}
