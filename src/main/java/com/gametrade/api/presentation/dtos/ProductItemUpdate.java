package com.gametrade.api.presentation.dtos;

import com.gametrade.api.model.ProductItemLabel;

public class ProductItemUpdate {
    private Long id;
	private String title;
    private String description;
    private String imagePath;
    private ProductItemLabel productItemLabel;
    private Double price;
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public ProductItemLabel getProductItemLabel() {
		return productItemLabel;
	}
	
	public void setProductItemLabel(ProductItemLabel productItemLabel) {
		this.productItemLabel = productItemLabel;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
    
}
