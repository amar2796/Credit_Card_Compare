package com.cdac.dto;

public class CardDTO {
 int bankid;
 String card_type;
public int getBankid() {
	return bankid;
}
public void setBankid(int bankid) {
	this.bankid = bankid;
}
public String getCard_type() {
	return card_type;
}
public void setCard_type(String card_type) {
	this.card_type = card_type;
}
public CardDTO(int bankid, String card_type) {
	super();
	this.bankid = bankid;
	this.card_type = card_type;
}
public CardDTO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "CardDTO [bankid=" + bankid + ", card_type=" + card_type + "]";
}
 
}
