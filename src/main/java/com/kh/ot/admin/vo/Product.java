package com.kh.ot.admin.vo;

import java.sql.Date;

public class Product {

	private int prdtNo;
	private int upNo;
	private String prdtName;
	private String prdtComment;
	private int prdtPrice;
	private String prdtBrand;
	private String prdtMake;
	private String prdtImage;
	private Date prdtDate;
	private Date prdtModifyDate;
	private String prdtUser;
	private int downNo;
	private String prdtCode;
	private String prdtImagePath;
	private String prdtDetailImage;
	private String prdtDetailImagePath;
	
	
	public Product() {
	}


	/**
	 * @param prdtNo
	 * @param upNo
	 * @param prdtName
	 * @param prdtComment
	 * @param prdtPrice
	 * @param prdtMake
	 * @param prdtImage
	 * @param prdtDate
	 * @param prdtModifyDate
	 * @param downNo
	 * @param prdtCode
	 * @param prdtImagePath
	 * @param prdtDetailImage
	 * @param prdtDetailImagePath
	 */
	public Product(int prdtNo, int upNo, String prdtName, String prdtComment, int prdtPrice, String prdtBrand,
			String prdtMake, String prdtImage, Date prdtDate, Date prdtModifyDate, String prdtUser, int downNo,
			String prdtCode, String prdtImagePath, String prdtDetailImage, String prdtDetailImagePath) {
		super();
		this.prdtNo = prdtNo;
		this.upNo = upNo;
		this.prdtName = prdtName;
		this.prdtComment = prdtComment;
		this.prdtPrice = prdtPrice;
		this.prdtBrand = prdtBrand;
		this.prdtMake = prdtMake;
		this.prdtImage = prdtImage;
		this.prdtDate = prdtDate;
		this.prdtModifyDate = prdtModifyDate;
		this.prdtUser = prdtUser;
		this.downNo = downNo;
		this.prdtCode = prdtCode;
		this.prdtImagePath = prdtImagePath;
		this.prdtDetailImage = prdtDetailImage;
		this.prdtDetailImagePath = prdtDetailImagePath;
	}


	/**
	 * @return the prdtNo
	 */
	public int getPrdtNo() {
		return prdtNo;
	}


	/**
	 * @param prdtNo the prdtNo to set
	 */
	public void setPrdtNo(int prdtNo) {
		this.prdtNo = prdtNo;
	}


	/**
	 * @return the upNo
	 */
	public int getUpNo() {
		return upNo;
	}


	/**
	 * @param upNo the upNo to set
	 */
	public void setUpNo(int upNo) {
		this.upNo = upNo;
	}


	/**
	 * @return the prdtName
	 */
	public String getPrdtName() {
		return prdtName;
	}


	/**
	 * @param prdtName the prdtName to set
	 */
	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}


	/**
	 * @return the prdtComment
	 */
	public String getPrdtComment() {
		return prdtComment;
	}


	/**
	 * @param prdtComment the prdtComment to set
	 */
	public void setPrdtComment(String prdtComment) {
		this.prdtComment = prdtComment;
	}


	/**
	 * @return the prdtPrice
	 */
	public int getPrdtPrice() {
		return prdtPrice;
	}


	/**
	 * @param prdtPrice the prdtPrice to set
	 */
	public void setPrdtPrice(int prdtPrice) {
		this.prdtPrice = prdtPrice;
	}


	/**
	 * @return the prdtMake
	 */
	public String getPrdtMake() {
		return prdtMake;
	}


	/**
	 * @param prdtMake the prdtMake to set
	 */
	public void setPrdtMake(String prdtMake) {
		this.prdtMake = prdtMake;
	}


	/**
	 * @return the prdtImage
	 */
	public String getPrdtImage() {
		return prdtImage;
	}


	/**
	 * @param prdtImage the prdtImage to set
	 */
	public void setPrdtImage(String prdtImage) {
		this.prdtImage = prdtImage;
	}


	/**
	 * @return the prdtDate
	 */
	public Date getPrdtDate() {
		return prdtDate;
	}


	/**
	 * @param prdtDate the prdtDate to set
	 */
	public void setPrdtDate(Date prdtDate) {
		this.prdtDate = prdtDate;
	}


	/**
	 * @return the prdtModifyDate
	 */
	public Date getPrdtModifyDate() {
		return prdtModifyDate;
	}


	/**
	 * @param prdtModifyDate the prdtModifyDate to set
	 */
	public void setPrdtModifyDate(Date prdtModifyDate) {
		this.prdtModifyDate = prdtModifyDate;
	}


	/**
	 * @return the downNo
	 */
	public int getDownNo() {
		return downNo;
	}


	/**
	 * @param downNo the downNo to set
	 */
	public void setDownNo(int downNo) {
		this.downNo = downNo;
	}


	/**
	 * @return the prdtCode
	 */
	public String getPrdtCode() {
		return prdtCode;
	}


	/**
	 * @param prdtCode the prdtCode to set
	 */
	public void setPrdtCode(String prdtCode) {
		this.prdtCode = prdtCode;
	}


	/**
	 * @return the prdtImagePath
	 */
	public String getPrdtImagePath() {
		return prdtImagePath;
	}


	/**
	 * @param prdtImagePath the prdtImagePath to set
	 */
	public void setPrdtImagePath(String prdtImagePath) {
		this.prdtImagePath = prdtImagePath;
	}


	/**
	 * @return the prdtDetailImage
	 */
	public String getPrdtDetailImage() {
		return prdtDetailImage;
	}


	/**
	 * @param prdtDetailImage the prdtDetailImage to set
	 */
	public void setPrdtDetailImage(String prdtDetailImage) {
		this.prdtDetailImage = prdtDetailImage;
	}


	/**
	 * @return the prdtDetailImagePath
	 */
	public String getPrdtDetailImagePath() {
		return prdtDetailImagePath;
	}


	/**
	 * @param prdtDetailImagePath the prdtDetailImagePath to set
	 */
	public void setPrdtDetailImagePath(String prdtDetailImagePath) {
		this.prdtDetailImagePath = prdtDetailImagePath;
	}
	
	

	public String getPrdtBrand() {
		return prdtBrand;
	}


	public void setPrdtBrand(String prdtBrand) {
		this.prdtBrand = prdtBrand;
	}
	
	


	public String getPrdtUser() {
		return prdtUser;
	}


	public void setPrdtUser(String prdtUser) {
		this.prdtUser = prdtUser;
	}


	@Override
	public String toString() {
		return "Product [prdtNo=" + prdtNo + ", upNo=" + upNo + ", prdtName=" + prdtName + ", prdtComment="
				+ prdtComment + ", prdtPrice=" + prdtPrice + ", prdtBrand=" + prdtBrand + ", prdtMake=" + prdtMake
				+ ", prdtImage=" + prdtImage + ", prdtDate=" + prdtDate + ", prdtModifyDate=" + prdtModifyDate
				+ ", prdtUser=" + prdtUser + ", downNo=" + downNo + ", prdtCode=" + prdtCode + ", prdtImagePath="
				+ prdtImagePath + ", prdtDetailImage=" + prdtDetailImage + ", prdtDetailImagePath="
				+ prdtDetailImagePath + "]";
	}
	
	
	
	
	
}