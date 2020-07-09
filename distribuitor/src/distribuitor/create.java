package distribuitor;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class create {
	private int number; //numarul tipurilor de retete de vopsea
	private int x; //cantitate vopsea EP1
	private int y; //cantitate vopsea EP2
	private int z; //cantitate vopsea EP3
	public void creation( String[] args) {
		try (PrintWriter out = new PrintWriter("filename.txt")) {  
		System.out.println("VopseauaNR"+number+" are codul:  EP1_<"+x+"> EP2_<"+y+"> EP3_<"+z+">");
		out.println(txt);
		}
	}
}


