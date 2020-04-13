package com.kh.ot.admin.vo;

import java.sql.Date;
import java.util.List;

public class Product {

	private int prdtNo;
	private int upNo;
	private String prdtName;
	private String prdtComment;
	private int prdtPrice;
	private String prdtMake;
	private String prdtImage;
	private Date prdtDate;
	private Date prdtModifyDate;
	private int downNo;
	private String prdtCode;
	private String prdtImagePath;
	private String prdtDetailImage;
	private String prdtDetailImagePath;
	private int prdtSale;
	
	List<Product> pList;
	
	public Product() {
	}

	public Product(int prdtNo, int upNo, String prdtName, String prdtComment, int prdtPrice, String prdtMake,
			String prdtImage, Date prdtDate, Date prdtModifyDate, int downNo, String prdtCode, String prdtImagePath,
			String prdtDetailImage, String prdtDetailImagePath, int prdtSale, List<Product> pList) {
		super();
		this.prdtNo = prdtNo;
		this.upNo = upNo;
		this.prdtName = prdtName;
		this.prdtComment = prdtComment;
		this.prdtPrice = prdtPrice;
		this.prdtMake = prdtMake;
		this.prdtImage = prdtImage;
		this.prdtDate = prdtDate;
		this.prdtModifyDate = prdtModifyDate;
		this.downNo = downNo;
		this.prdtCode = prdtCode;
		this.prdtImagePath = prdtImagePath;
		this.prdtDetailImage = prdtDetailImage;
		this.prdtDetailImagePath = prdtDetailImagePath;
		this.prdtSale = prdtSale;
		this.pList = pList;
	}

	public Product(int prdtNo, int upNo, String prdtName, String prdtComment, int prdtPrice, String prdtMake,
			String prdtImage, Date prdtDate, Date prdtModifyDate, int downNo, String prdtCode, String prdtImagePath,
			String prdtDetailImage, String prdtDetailImagePath, int prdtSale) {
		super();
		this.prdtNo = prdtNo;
		this.upNo = upNo;
		this.prdtName = prdtName;
		this.prdtComment = prdtComment;
		this.prdtPrice = prdtPrice;
		this.prdtMake = prdtMake;
		this.prdtImage = prdtImage;
		this.prdtDate = prdtDate;
		this.prdtModifyDate = prdtModifyDate;
		this.downNo = downNo;
		this.prdtCode = prdtCode;
		this.prdtImagePath = prdtImagePath;
		this.prdtDetailImage = prdtDetailImage;
		this.prdtDetailImagePath = prdtDetailImagePath;
		this.prdtSale = prdtSale;
	}

	public int getPrdtNo() {
		return prdtNo;
	}

	public void setPrdtNo(int prdtNo) {
		this.prdtNo = prdtNo;
	}

	public int getUpNo() {
		return upNo;
	}

	public void setUpNo(int upNo) {
		this.upNo = upNo;
	}

	public String getPrdtName() {
		return prdtName;
	}

	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}

	public String getPrdtComment() {
		return prdtComment;
	}

	public void setPrdtComment(String prdtComment) {
		this.prdtComment = prdtComment;
	}

	public int getPrdtPrice() {
		return prdtPrice;
	}

	public void setPrdtPrice(int prdtPrice) {
		this.prdtPrice = prdtPrice;
	}

	public String getPrdtMake() {
		return prdtMake;
	}

	public void setPrdtMake(String prdtMake) {
		this.prdtMake = prdtMake;
	}

	public String getPrdtImage() {
		return prdtImage;
	}

	public void setPrdtImage(String prdtImage) {
		this.prdtImage = prdtImage;
	}

	public Date getPrdtDate() {
		return prdtDate;
	}

	public void setPrdtDate(Date prdtDate) {
		this.prdtDate = prdtDate;
	}

	public Date getPrdtModifyDate() {
		return prdtModifyDate;
	}

	public void setPrdtModifyDate(Date prdtModifyDate) {
		this.prdtModifyDate = prdtModifyDate;
	}

	public int getDownNo() {
		return downNo;
	}

	public void setDownNo(int downNo) {
		this.downNo = downNo;
	}

	public String getPrdtCode() {
		return prdtCode;
	}

	public void setPrdtCode(String prdtCode) {
		this.prdtCode = prdtCode;
	}

	public String getPrdtImagePath() {
		return prdtImagePath;
	}

	public void setPrdtImagePath(String prdtImagePath) {
		this.prdtImagePath = prdtImagePath;
	}

	public String getPrdtDetailImage() {
		return prdtDetailImage;
	}

	public void setPrdtDetailImage(String prdtDetailImage) {
		this.prdtDetailImage = prdtDetailImage;
	}

	public String getPrdtDetailImagePath() {
		return prdtDetailImagePath;
	}

	public void setPrdtDetailImagePath(String prdtDetailImagePath) {
		this.prdtDetailImagePath = prdtDetailImagePath;
	}

	public int getPrdtSale() {
		return prdtSale;
	}

	public void setPrdtSale(int prdtSale) {
		this.prdtSale = prdtSale;
	}

	public List<Product> getpList() {
		return pList;
	}

	public void setpList(List<Product> pList) {
		this.pList = pList;
	}

	@Override
	public String toString() {
		return "Product [prdtNo=" + prdtNo + ", upNo=" + upNo + ", prdtName=" + prdtName + ", prdtComment="
				+ prdtComment + ", prdtPrice=" + prdtPrice + ", prdtMake=" + prdtMake + ", prdtImage=" + prdtImage
				+ ", prdtDate=" + prdtDate + ", prdtModifyDate=" + prdtModifyDate + ", downNo=" + downNo + ", prdtCode="
				+ prdtCode + ", prdtImagePath=" + prdtImagePath + ", prdtDetailImage=" + prdtDetailImage
				+ ", prdtDetailImagePath=" + prdtDetailImagePath + ", prdtSale=" + prdtSale + ", pList=" + pList + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
	
}