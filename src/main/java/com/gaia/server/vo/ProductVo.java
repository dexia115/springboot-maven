package com.gaia.server.vo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductVo {
	
	private BigDecimal price;
	
	private String name;
	
	private String picUrl;
	
	public ProductVo() {
		
	}
	
	public ProductVo(String name,BigDecimal price,String picUrl) {
		this.name = name;
		this.price = price;
		this.picUrl = picUrl;
	}

}
