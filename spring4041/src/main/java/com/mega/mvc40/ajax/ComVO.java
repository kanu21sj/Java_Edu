package com.mega.mvc40.ajax;

public class ComVO {
	
	private String comtype;
	private int comprice;
	private String mousetype;
	private int mouseprice;
	private int sum;
	
	public String getComtype() {
		return comtype;
	}
	public void setComtype(String comtype) {
		this.comtype = comtype;
	}
	public int getComprice() {
		return comprice;
	}
	public void setComprice(int comprice) {
		this.comprice = comprice;
	}
	public String getMousetype() {
		return mousetype;
	}
	public void setMousetype(String mousetype) {
		this.mousetype = mousetype;
	}
	public int getMouseprice() {
		return mouseprice;
	}
	public void setMouseprice(int mouseprice) {
		this.mouseprice = mouseprice;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "ComVO [comtype=" + comtype + ", comprice=" + comprice + ", mousetype=" + mousetype + ", mouseprice="
				+ mouseprice + ", sum=" + sum + "]";
	}	
	

}
