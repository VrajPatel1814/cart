package com.shashi.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DemandBean implements Serializable {

	private String userName;
	private String prodId;
	private int demandQty;

	public DemandBean() {
		super();
	}

	public DemandBean(String HaarduserName, String VrajprodId, int demandQty) {
		super();
		this.userName = HaarduserName;
		this.prodId = VrajprodId;
		this.demandQty = demandQty;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public int getDemandQty() {
		return demandQty;
	}

	public void setDemandQty(int demandQty) {
		this.demandQty = demandQty;
	}

}
