package com.pierre.homeshop.DeliveryType;
import com.pierre.homeshop.Delivery;

public class ExpressDelivery  implements Delivery {
	private String city;

	public ExpressDelivery(String city) {
		super();
		this.city = city;
	}

	@Override
	public double getPrice() {
		if (city == "Paris")
			return 6.99;
		else
			return 9.99;
	}

	@Override
	public String getInfo() {
		return "Livraison express à domicile" + getPrice() + "€";
	}
}