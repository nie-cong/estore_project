package com.briup.bean;

import java.io.Serializable;

public class SProduct implements Serializable {
    private Long id;

    private String name;

    private Long price;

    private String publish;

    private String img;

    private Long hot;

    private Long remain;

    private Long sellnum;

    private Long clickrate;

    private Long publishdate;

    private Long cateDetailId;

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

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Long getHot() {
		return hot;
	}

	public void setHot(Long hot) {
		this.hot = hot;
	}

	public Long getRemain() {
		return remain;
	}

	public void setRemain(Long remain) {
		this.remain = remain;
	}

	public Long getSellnum() {
		return sellnum;
	}

	public void setSellnum(Long sellnum) {
		this.sellnum = sellnum;
	}

	public Long getClickrate() {
		return clickrate;
	}

	public void setClickrate(Long clickrate) {
		this.clickrate = clickrate;
	}

	public Long getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(Long publishdate) {
		this.publishdate = publishdate;
	}

	public Long getCateDetailId() {
		return cateDetailId;
	}

	public void setCateDetailId(Long cateDetailId) {
		this.cateDetailId = cateDetailId;
	}

	public SProduct() {
		super();
	}

	public SProduct(Long id, String name, Long price, String publish, String img, Long hot, Long remain, Long sellnum,
			Long clickrate, Long publishdate, Long cateDetailId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.publish = publish;
		this.img = img;
		this.hot = hot;
		this.remain = remain;
		this.sellnum = sellnum;
		this.clickrate = clickrate;
		this.publishdate = publishdate;
		this.cateDetailId = cateDetailId;
	}

	public SProduct(String name, Long price, String publish, String img, Long hot, Long remain, Long sellnum,
			Long clickrate, Long publishdate, Long cateDetailId) {
		super();
		this.name = name;
		this.price = price;
		this.publish = publish;
		this.img = img;
		this.hot = hot;
		this.remain = remain;
		this.sellnum = sellnum;
		this.clickrate = clickrate;
		this.publishdate = publishdate;
		this.cateDetailId = cateDetailId;
	}

	@Override
	public String toString() {
		return "SProduct [id=" + id + ", name=" + name + ", price=" + price + ", publish=" + publish + ", img=" + img
				+ ", hot=" + hot + ", remain=" + remain + ", sellnum=" + sellnum + ", clickrate=" + clickrate
				+ ", publishdate=" + publishdate + ", cateDetailId=" + cateDetailId + "]";
	}

    
}