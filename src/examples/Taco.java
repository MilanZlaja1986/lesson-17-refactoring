package examples;

public class Taco {

	private String filling;
	private String tortilla = "corn";

	public void setFilling(String filling) {
		System.out.println("Setting filling to: " + filling);
		this.filling = filling;
	}

	private String getFilling() {
		return this.filling;
	}

	public static void main(String[] args) {
		Taco taco = new Taco();
		taco.setFilling("carne asada");
	}

}
