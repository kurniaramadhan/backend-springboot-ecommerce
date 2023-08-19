package org.jvmitenas.ecommerce.services;

import org.jvmitenas.ecommerce.dto.Purchase;
import org.jvmitenas.ecommerce.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

public interface CheckoutService {
	
	PurchaseResponse placeOrder(Purchase purchase);
}
