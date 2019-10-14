package optional;

import java.util.ArrayList;
import java.util.List;

/* Extract a Milkshake class from TheYard */

public class TheYard {

	private String iceCreamFlavor;
	private boolean cherryOnTop;
	private String syrupFlavor;

	private List<Boy> theBoys = new ArrayList<Boy>();

	void bringAllTheBoysToTheYard() {
		for (Boy aBoy : theBoys) {
			aBoy.bringToTheYard(iceCreamFlavor, cherryOnTop, syrupFlavor);
		}
	}

	public void addBoy(Boy boy) {
		this.theBoys.add(boy);
	}

	public void setMilkshake(String iceCreamFlavor, boolean cherryOnTop, String syrupFlavor) {
		this.iceCreamFlavor = iceCreamFlavor;
		this.cherryOnTop = cherryOnTop;
		this.syrupFlavor = syrupFlavor;
	}

	public static void main(String[] args) {
		TheYard theYard = new TheYard();
		theYard.setMilkshake("vanilla", true, "strawberry");
		theYard.addBoy(new Boy("groucho"));
		theYard.addBoy(new Boy("harpo"));
		theYard.addBoy(new Boy("zeppo"));
		theYard.bringAllTheBoysToTheYard();
	}

}

class Boy {

	private String name;

	public Boy(String name) {
		this.name = name;
	}

	public void bringToTheYard(String iceCreamFlavor, boolean cherryOnTop, String syrupFlavor) {
		if (cherryOnTop)
			System.out.println("damn right, it's better than yours");
		else
			System.out.println("i could teach you, but i'd have to charge");
	}

}
