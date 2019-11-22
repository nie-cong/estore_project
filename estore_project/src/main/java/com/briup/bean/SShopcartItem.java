package com.briup.bean;

import java.io.Serializable;

public class SShopcartItem implements Serializable {
    private Long id;

    private Long userId;

    private Long productId;

    private Long num;

    private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public SShopcartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SShopcartItem(Long id, Long userId, Long productId, Long num) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.num = num;
	}

	public SShopcartItem(Long userId, Long productId, Long num) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.num = num;
	}

	@Override
	public String toString() {
		return "SShopcartItem [id=" + id + ", userId=" + userId + ", productId=" + productId + ", num=" + num + "]";
	}

  
}