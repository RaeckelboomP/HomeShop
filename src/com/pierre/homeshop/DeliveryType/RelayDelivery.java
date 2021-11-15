package com.pierre.homeshop.DeliveryType;
import com.pierre.homeshop.Delivery;

public class RelayDelivery  implements Delivery {
	private int relayNumber;

	public RelayDelivery(int relayNumber) {
		super();
		this.relayNumber = relayNumber;
	}

	@Override
	public double getPrice() {
		if (relayNumber >= 1 && relayNumber <= 22)
			return 0;
		else if (relayNumber >=23 && relayNumber <= 57)
			return 2.99;
		else
			return 4.99;
	}

	@Override
	public String getInfo() {
		return "Livraison en point relais: " + getPrice() + "€";
	}
}
