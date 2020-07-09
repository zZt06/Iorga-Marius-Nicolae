package distribuitor;

import java.util.ArrayList;
import java.util.List;

   public class Agent {
   private List<Order> orderList = new ArrayList<Order>(); //lista comenzilor pentru agent

   public void takeOrder(Order order){
      orderList.add(order);		//se adauga ordine de luat
   }

   public void placeOrders(){
   
      for (Order order : orderList) {
         order.execute();   //se adauga ordine de plasat (executat)
      }
      orderList.clear();   //se curata lista
   }
}
