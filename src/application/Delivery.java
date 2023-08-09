package application;

import java.util.Date;

import entities.Pedidos;
import entities.enums.DeliveryEnum;

public class Delivery {

	public static void main(String[] args) {
		
		Pedidos pedido = new Pedidos(1080, new Date(), DeliveryEnum.AGUARDANDO_PAGAMENTO);
		System.out.println(pedido);
		
		DeliveryEnum de1 = DeliveryEnum.ENTREGUE;
		DeliveryEnum de2 = DeliveryEnum.valueOf("ENTREGUE");
		System.out.println(de1);
		System.out.println(de2);
	}

}
