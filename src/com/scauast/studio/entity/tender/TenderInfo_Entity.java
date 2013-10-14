package com.scauast.studio.entity.tender;

import java.util.ArrayList;
import java.util.Date;

public class TenderInfo_Entity {
	
	private int tendersid;
	private String theme;
	private String unit;
	private Date deadline;
	private int situation;
	private ArrayList<BiddersInfo_Entity> tenderer_id;
	private int bidders;
	private int win_bidding;
	private Date win_time;
	private Date sub_time;
	
	public int getTendersid() {
		return tendersid;
	}
	public void setTendersid(int tendersid) {
		this.tendersid = tendersid;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public int getSituation() {
		return situation;
	}
	public void setSituation(int situation) {
		this.situation = situation;
	}
	public ArrayList<BiddersInfo_Entity> getTenderer_id() {
		return tenderer_id;
	}
	public void setTenderer_id(ArrayList<BiddersInfo_Entity> tenderer_id) {
		this.tenderer_id = tenderer_id;
	}
	public int getBidders() {
		return bidders;
	}
	public void setBidders(int bidders) {
		this.bidders = bidders;
	}
	public int getWin_bidding() {
		return win_bidding;
	}
	public void setWin_bidding(int win_bidding) {
		this.win_bidding = win_bidding;
	}
	public Date getWin_time() {
		return win_time;
	}
	public void setWin_time(Date win_time) {
		this.win_time = win_time;
	}
	public Date getSub_time() {
		return sub_time;
	}
	public void setSub_time(Date sub_time) {
		this.sub_time = sub_time;
	}
	
}

class BiddersInfo_Entity {
	
	private int id;
	private int bidders_id;
	private Date subtime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBidders_id() {
		return bidders_id;
	}
	public void setBidders_id(int bidders_id) {
		this.bidders_id = bidders_id;
	}
	public Date getSubtime() {
		return subtime;
	}
	public void setSubtime(Date subtime) {
		this.subtime = subtime;
	}
	
	
}