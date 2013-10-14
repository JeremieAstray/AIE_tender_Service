package com.scauast.studio.action.tender;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Tender_Action extends ActionSupport {

	private int tendersid;
	private String theme;
	private String unit;
	private Date deadline;
	private int situation;
	private int have_tenderer;
	private int tenderer_id;
	private int win_bidding;
	private Date win_time;
	private Date sub_time;
	private String introduce_file;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

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

	public int getHave_tenderer() {
		return have_tenderer;
	}

	public void setHave_tenderer(int have_tenderer) {
		this.have_tenderer = have_tenderer;
	}

	public int getTenderer_id() {
		return tenderer_id;
	}

	public void setTenderer_id(int tenderer_id) {
		this.tenderer_id = tenderer_id;
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

	public String getIntroduce_file() {
		return introduce_file;
	}

	public void setIntroduce_file(String introduce_file) {
		this.introduce_file = introduce_file;
	}

	

}
