/**
 * 
 */
package com.kh.ot.main.vo;

/**
 * @author user1
 *
 */
public class MainSearchCondition {

	private int product1;
	private int product2;
	private int minPrice;
	private int maxPrice;
	private String sortBest;
	private String sortReview;
	private String sortRowPrice;
	private String sortHighPrice;
	/**
	 * 
	 */
	public MainSearchCondition() {
		super();
	}
	/**
	 * @param product1
	 * @param product2
	 * @param minPrice
	 * @param maxPrice
	 * @param sortBest
	 * @param sortReview
	 * @param sortRowPrice
	 * @param sortHighPrice
	 */
	public MainSearchCondition(int product1, int product2, int minPrice, int maxPrice, String sortBest,
			String sortReview, String sortRowPrice, String sortHighPrice) {
		super();
		this.product1 = product1;
		this.product2 = product2;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.sortBest = sortBest;
		this.sortReview = sortReview;
		this.sortRowPrice = sortRowPrice;
		this.sortHighPrice = sortHighPrice;
	}
	/**
	 * @return the product1
	 */
	public int getProduct1() {
		return product1;
	}
	/**
	 * @param product1 the product1 to set
	 */
	public void setProduct1(int product1) {
		this.product1 = product1;
	}
	/**
	 * @return the product2
	 */
	public int getProduct2() {
		return product2;
	}
	/**
	 * @param product2 the product2 to set
	 */
	public void setProduct2(int product2) {
		this.product2 = product2;
	}
	/**
	 * @return the minPrice
	 */
	public int getMinPrice() {
		return minPrice;
	}
	/**
	 * @param minPrice the minPrice to set
	 */
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	/**
	 * @return the maxPrice
	 */
	public int getMaxPrice() {
		return maxPrice;
	}
	/**
	 * @param maxPrice the maxPrice to set
	 */
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	/**
	 * @return the sortBest
	 */
	public String getSortBest() {
		return sortBest;
	}
	/**
	 * @param sortBest the sortBest to set
	 */
	public void setSortBest(String sortBest) {
		this.sortBest = sortBest;
	}
	/**
	 * @return the sortReview
	 */
	public String getSortReview() {
		return sortReview;
	}
	/**
	 * @param sortReview the sortReview to set
	 */
	public void setSortReview(String sortReview) {
		this.sortReview = sortReview;
	}
	/**
	 * @return the sortRowPrice
	 */
	public String getSortRowPrice() {
		return sortRowPrice;
	}
	/**
	 * @param sortRowPrice the sortRowPrice to set
	 */
	public void setSortRowPrice(String sortRowPrice) {
		this.sortRowPrice = sortRowPrice;
	}
	/**
	 * @return the sortHighPrice
	 */
	public String getSortHighPrice() {
		return sortHighPrice;
	}
	/**
	 * @param sortHighPrice the sortHighPrice to set
	 */
	public void setSortHighPrice(String sortHighPrice) {
		this.sortHighPrice = sortHighPrice;
	}
	@Override
	public String toString() {
		return "MainSearchCondition [product1=" + product1 + ", product2=" + product2 + ", minPrice=" + minPrice
				+ ", maxPrice=" + maxPrice + ", sortBest=" + sortBest + ", sortReview=" + sortReview + ", sortRowPrice="
				+ sortRowPrice + ", sortHighPrice=" + sortHighPrice + "]";
	}
	
	
	
	
}
