package com.pierre.homeshop.DeliveryType;
import com.pierre.homeshop.Delivery;

public class DirectDelivery implements Delivery {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 4.99;
	}

	@Override
	public String getInfo() {
		return "Livraison à domicile: 4,99€";
	}
}