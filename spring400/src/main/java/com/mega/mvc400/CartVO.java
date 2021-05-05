package com.mega.mvc400;

public class CartVO {

	private String mid;
	private String pid;
	private int price;
	private int pcount;
	
	public String getmid() {
		return mid;
	}
	public void setmId(String mid) {
		this.mid = mid;
	}
	public String getpid() {
		return pid;
	}
	public void setpId(String pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPcount() {
		return pcount;
	}
	public void setPcount(int pcount) {
		this.pcount = pcount;
	}

}