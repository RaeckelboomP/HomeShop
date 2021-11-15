package com.pierre.homeshop;


import com.pierre.homeshop.DeliveryType.RelayDelivery;
import com.pierre.homeshop.ProductFolder.Fridge;
import com.pierre.homeshop.ProductFolder.Television;

public class HomeShop {

	 public static void main(String[] args) {
	        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
	        Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurv�e 49\"", 599, 49, "LED");
	        Fridge fridge = new Fridge("BEKO TSE 1042 F", "R�frig�rateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

	        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

	        Bill bill = new Bill(customer, new RelayDelivery(27));
	        bill.addProduct(cafe, 1);
	        bill.addProduct(tv, 1);
	        bill.addProduct(fridge, 1);

	        bill.generate(new FileWriter("facture_leblanc"));
	    }
	}