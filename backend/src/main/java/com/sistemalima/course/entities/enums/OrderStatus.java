package com.sistemalima.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	// atributo
	
	private int code;
	
	// construtor privado
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	// metodo para visualisar
	
	public int getCode() {
		return code;
	}
	
	// metodo statico
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value: OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}

}
