package ro.emanuel.pojo;

public class Parfum {
	private int id;
	private String nume;
	private double pret;

	public Parfum(int id, String nume, double pret) {
		super();
		this.id = id;
		this.nume = nume;
		this.pret = pret;
	}

	public Parfum() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

}
