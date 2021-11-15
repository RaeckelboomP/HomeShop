package com.pierre.homeshop.DeliveryType;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pierre.homeshop.Delivery;

class RelayDeliveryTest {

	@Test
	public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0e() {
		Delivery delivery = new RelayDelivery(5);
		assertEquals(0, delivery.getPrice(), 0.01);
		}
	@Test
	public void Given_LowPriceRelay_WhenGettingDeliveryPrice_ThenGet2e99() {
		Delivery delivery = new RelayDelivery(27);
		assertEquals(2.99, delivery.getPrice(), 0.01);
		}
	@Test
	public void Given_HighPriceRelay_WhenGettingDeliveryPrice_ThenGet4e99() {
		Delivery delivery = new RelayDelivery(60);
		assertEquals(4.99, delivery.getPrice(), 0.01);
		}
}
