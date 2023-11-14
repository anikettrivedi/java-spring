package com.example.springjpa.jpaonetomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Table(name="cart")
@Getter
@Setter
@NoArgsConstructor
public class Cart {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="cart_id")
	private long id;
	
	@Column(name="total")
	private double total;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="cart")
	private Set<CartItem> items;
}