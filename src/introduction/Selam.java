package introduction;

public class Selam {

	 String world;

	public String selamSoyle(String kime) {
		String cumle;
		if(kime != "") 
			cumle = "Selam" + kime +":)";
		else
			cumle = "Selam"+ world + ":)";
		
		
		return cumle;
	}

}
