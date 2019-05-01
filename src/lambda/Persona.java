public class Persona {

	private int id;
	private String nombre;
	private String sexo;
	private int edad;
	private double sueldo;

	public Persona() {

	}

	public Persona(int id, String nombre, String sexo, int edad, double sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public Persona(int id, String nombre, String sexo, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;	
		this.sueldo = 900000;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", sueldo=" + sueldo
				+ "]";
	}

	
	
	

}
