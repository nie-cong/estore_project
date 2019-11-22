package com.briup.bean;

import java.io.Serializable;

public class SCateDetail implements Serializable {
    private Long id;

    private String name;

    private Long categoryId;

    private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public SCateDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SCateDetail(Long id, String name, Long categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
	}

	public SCateDetail(String name, Long categoryId) {
		super();
		this.name = name;
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "SCateDetail [id=" + id + ", name=" + name + ", categoryId=" + categoryId + "]";
	}

    
}