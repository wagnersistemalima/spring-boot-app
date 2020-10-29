package com.sistemalima.course.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sistemalima.course.entities.Order;
import com.sistemalima.course.entities.Product;

// classe auxiliar para ser  chave primaria composta

@Embeddable
public class OrderItemPk implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	// associação para as classes Order e Product
	
	@ManyToOne                                     // muitos para 1 com o pedido
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne                                    
	@JoinColumn(name = "product_id")
	private Product product;
	
	// não terá construtor
	
	// Getters & Setters
	
	public Order getOrder() {
		return order;
	}
	
	// HashCode & Equals comparando as duas chaves compostas
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPk other = (OrderItemPk) obj;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
