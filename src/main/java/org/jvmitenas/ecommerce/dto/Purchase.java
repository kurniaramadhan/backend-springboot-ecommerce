package org.jvmitenas.ecommerce.dto;

import java.util.Set;

import org.jvmitenas.ecommerce.entity.Address;
import org.jvmitenas.ecommerce.entity.Customer;
import org.jvmitenas.ecommerce.entity.Order;
import org.jvmitenas.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
	private Customer customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private Set<OrderItem> orderItems;
}
