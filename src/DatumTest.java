
public class DatumTest {
	public static void main(String[] args) {
		Datum prviDatum = new Datum(10, 12, 2014);
		Datum drugiDatum = new Datum(prviDatum);
		
		prviDatum.setDan(15);
		System.out.println(prviDatum.toString());
		System.out.println(drugiDatum.toString());
		
		if(prviDatum.equals(drugiDatum) == true)
			System.out.println("Datumi su jednaki.");
		else
			System.out.println("Datumi nisu jednaki.");
		System.out.println(prviDatum.compareTo(drugiDatum));
}
	}
