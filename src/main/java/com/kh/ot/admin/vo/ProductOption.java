package com.kh.ot.admin.vo;

import java.util.List;

public class ProductOption {
	
	/*
	 * OPT_NO PRDT_NO OPT_COLOR OPT_SIZE OPT_STOCK OPT_DATE MODIFY_DATE OPT_USER
	 * PRDT_CODE
	 */
	
	private int opt_no;
	private int prdt_no;
	private String opt_color;
	private String opt_size;
	private int opt_stock;
	private String opt_date;
	private String modify_date;
	private String opt_user;
	private String prdt_code;
	
	private List<ProductOption> Product_OptionVOList;
	
	public ProductOption() {}
	public ProductOption(int opt_no, int prdt_no, String opt_color, String opt_size, int opt_stock, String opt_date,
			String modify_date, String opt_user) {
		super();
		this.opt_no = opt_no;
		this.prdt_no = prdt_no;
		this.opt_color = opt_color;
		this.opt_size = opt_size;
		this.opt_stock = opt_stock;
		this.opt_date = opt_date;
		this.modify_date = modify_date;
		this.opt_user = opt_user;
	}
	
	
	
	
	public ProductOption(int opt_no, int prdt_no, String opt_color, String opt_size, int opt_stock, String opt_date,
			String modify_date, String opt_user, String prdt_code, List<ProductOption> product_OptionVOList) {
		super();
		this.opt_no = opt_no;
		this.prdt_no = prdt_no;
		this.opt_color = opt_color;
		this.opt_size = opt_size;
		this.opt_stock = opt_stock;
		this.opt_date = opt_date;
		this.modify_date = modify_date;
		this.opt_user = opt_user;
		this.prdt_code = prdt_code;
		Product_OptionVOList = product_OptionVOList;
	}
	public int getOpt_no() {
		return opt_no;
	}
	public void setOpt_no(int opt_no) {
		this.opt_no = opt_no;
	}
	public int getPrdt_no() {
		return prdt_no;
	}
	public void setPrdt_no(int prdt_no) {
		this.prdt_no = prdt_no;
	}
	public String getOpt_color() {
		return opt_color;
	}
	public void setOpt_color(String opt_color) {
		this.opt_color = opt_color;
	}
	public String getOpt_size() {
		return opt_size;
	}
	public void setOpt_size(String opt_size) {
		this.opt_size = opt_size;
	}
	public int getOpt_stock() {
		return opt_stock;
	}
	public void setOpt_stock(int opt_stock) {
		this.opt_stock = opt_stock;
	}
	public String getOpt_date() {
		return opt_date;
	}
	public void setOpt_date(String opt_date) {
		this.opt_date = opt_date;
	}
	public String getModify_date() {
		return modify_date;
	}
	public void setModify_date(String modify_date) {
		this.modify_date = modify_date;
	}
	public String getOpt_user() {
		return opt_user;
	}
	public void setOpt_user(String opt_user) {
		this.opt_user = opt_user;
	}
	
	
	public List<ProductOption> getProduct_OptionVOList() {
		return Product_OptionVOList;
	}
	public void setProduct_OptionVOList(List<ProductOption> product_OptionVOList) {
		Product_OptionVOList = product_OptionVOList;
	}
	public String getPrdt_code() {
		return prdt_code;
	}
	public void setPrdt_code(String prdt_code) {
		this.prdt_code = prdt_code;
	}
	@Override
	public String toString() {
		return "ProductOption [opt_no=" + opt_no + ", prdt_no=" + prdt_no + ", opt_color=" + opt_color + ", opt_size="
				+ opt_size + ", opt_stock=" + opt_stock + ", opt_date=" + opt_date + ", modify_date=" + modify_date
				+ ", opt_user=" + opt_user + ", prdt_code=" + prdt_code + ", Product_OptionVOList="
				+ Product_OptionVOList + "]";
	}
	
	
	
	
	
	
}
