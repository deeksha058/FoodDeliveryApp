package com.Deeksha.FoodDeliveryApp.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category {
	
	@Id
	private Integer categoryId;
	private String categoryName;

}
