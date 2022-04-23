package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(order);
		
	
		OrderStatus os1 = OrderStatus.ENTREGUE;
		//precisa ser o mesmo nome em STRING
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
				
	}

}
