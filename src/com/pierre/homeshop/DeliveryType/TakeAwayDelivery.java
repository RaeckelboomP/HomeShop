package com.pierre.homeshop.DeliveryType;
import com.pierre.homeshop.Delivery;

public class TakeAwayDelivery  implements Delivery {

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Retrait � l'entrep�t: 0�";
	}

	@Override
	public double getPrice() {
		return 0;
	}
}