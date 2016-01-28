package musicalInstrument;

public class ElectricBassGuitar extends StringedInstrument{
	public ElectricBassGuitar(int n){
		Name = "BASSGUITAR";
		Noofstrings = n;
		}
public void display() {
		System.out.println("THE ELECTRIC " +Name + " HAS " +Noofstrings + " STRINGS");
		}
}
