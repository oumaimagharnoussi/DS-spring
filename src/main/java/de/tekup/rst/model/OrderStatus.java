package de.tekup.rst.model;

public enum OrderStatus {
CREATE(0), SHIPPING(1), DELIVERED(2), PAID(3);
	
	private int displayName;
	
	private OrderStatus(int i) {
		this.displayName = i;
	}
	
	public int getDisplayName() {
		return displayName;
	}
}
