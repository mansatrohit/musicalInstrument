package musicalInstrument;
import java.util.Scanner;
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The No Of Strings Of ElectricGuitar:");
		int x = s.nextInt();
		ElectricGuitar E = new ElectricGuitar(x);
		//E.ElectricGuitar(x);
		E.display();
		System.out.print("Enter The No Of Strings Of ElectricBassGuitar:");
		int y = s.nextInt();
		ElectricBassGuitar B = new ElectricBassGuitar(y);
		//B.ElectricBassGuitar(y);
		B.display();
	}

}
