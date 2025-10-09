package com.foodapp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address 
{
	@Id
	@GeneratedValue
	private Integer addressId;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
}
