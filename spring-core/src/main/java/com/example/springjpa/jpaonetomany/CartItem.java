package com.example.springjpa.jpaonetomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="cart_item")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "cart")
public class CartItem {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="item_id")
	private String itemId;
	
	@Column(name="item_total")
	private double itemTotal;
	
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="cart_id", nullable=false)
	private Cart cart;

	public CartItem(String itemId, double total, int qty, Cart cart){
		this.itemId=itemId;
		this.itemTotal=total;
		this.quantity=qty;
		this.cart=cart;
	}

}