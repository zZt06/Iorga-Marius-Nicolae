package distribuitor;


public class modify implements Order {
	   private create vopsea;

	   public modify(create vopsea){
	      this.vopsea = vopsea;    //modifica reteta de vopsea selectata
	   }

	   public void execute() {
		      vopsea.creation();
		   }
	}
