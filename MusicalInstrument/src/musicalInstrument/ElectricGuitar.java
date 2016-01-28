package musicalInstrument;

public class ElectricGuitar extends StringedInstrument {
	public ElectricGuitar(int n){
		Name = "GUITAR";
		Noofstrings = n;
		}
public void display() {
		System.out.println("THE ELECTRIC " +Name + " HAS " +Noofstrings + " STRINGS");
		}
}
