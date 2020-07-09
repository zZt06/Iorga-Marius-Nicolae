package distribuitor;

public class CommandPattern {
	   public static void main(String[] args) {
		  create vopsea = new create(); //se creeaza retete noi de vopsea

	      modify modifyOrder = new modify(vopsea); //se modificafa retetele de vopsea

	      Agent agent = new Agent();     // agentul
	      agent.takeOrder(modifyOrder);  //care ia ordine


	      agent.placeOrders();           //si le plaseaza
	   }
	}
