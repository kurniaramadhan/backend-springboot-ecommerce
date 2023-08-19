package org.jvmitenas.ecommerce.services;

import java.util.Set;
import java.util.UUID;

import org.jvmitenas.ecommerce.dao.CustomerRespository;
import org.jvmitenas.ecommerce.dto.Purchase;
import org.jvmitenas.ecommerce.dto.PurchaseResponse;
import org.jvmitenas.ecommerce.entity.Customer;
import org.jvmitenas.ecommerce.entity.Order;
import org.jvmitenas.ecommerce.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService {
	
	private CustomerRespository customerRespository;
	
	@Autowired
	public CheckoutServiceImpl(CustomerRespository customerRespository) {
		this.customerRespository = customerRespository;
	}

	@Override
	@Transactional
	public PurchaseResponse placeOrder(Purchase purchase) {
		// 1. Retrieve order dari DTO
		Order order = purchase.getOrder();
		
		// 2. Generate tracking number
		String orderTrackingNumber = generateTrackingNumber();
		order.setOrderTrackingNumber(orderTrackingNumber);
		
		// 3. Gabungkan order dengan order items
		Set<OrderItem> orderItems = purchase.getOrderItems();
		orderItems.forEach(item -> order.add(item));
		
		// 4. Gabungkan order dengan shipping address dan billing address
		order.setShippingAddress(purchase.getShippingAddress());
		order.setBillingAddress(purchase.getBillingAddress());
		
		// 5. Gabungkan customer dengan order
		Customer customer = purchase.getCustomer();
		customer.add(order);
		
		// 6. Simpan order pada database
		customerRespository.save(customer);
		
		return new PurchaseResponse(orderTrackingNumber);
	}

	private String generateTrackingNumber() {
		// Generate random UUID (UUID versi 4)
		// Apa itu UUID:
		// https://en.wikipedia.org/wiki/Universally_unique_identifier
		return UUID.randomUUID().toString();
	}

}
