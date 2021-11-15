package com.pierre.homeshop;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import com.pierre.homeshop.DeliveryType.RelayDelivery;
import com.pierre.homeshop.ProductFolder.Fridge;
import com.pierre.homeshop.ProductFolder.Television;

public class BillTest {
	private String output;
	private Writer writerMock = new Writer() {
		@Override
		public void start() {
			output = "";
		}
		
		@Override
		public void writeLine(String line) {
			output += line + "%n";
		}
		
		@Override
		public void stop() {
		}
	};
	private Product cafe = new Product("Cofee Maker 3000","Machine à café ultra performante 40 tasses", 79.99);
	private Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
    private Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
    private Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");
    private Delivery lowCostRelayDelivery = new RelayDelivery(27);
    @Test
    public void Given_2productsAndDelivery_When_generatingBill_Then_getGoodLineNumber() {
        Bill bill = new Bill(customer, lowCostRelayDelivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.generate(writerMock);
        int lineNumber = output.split("%n").length;
        assertEquals(20, lineNumber);
    }

    @Test
    public void Given_3productsAndDelivery_When_generatingBill_Then_getGoodTotal() {
        Bill bill = new Bill(customer, lowCostRelayDelivery);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        assertEquals(870.98, bill.getTotal(), 0.01);
    }
}