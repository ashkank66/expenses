package com.ashkansoft.expenses.Models.DTO;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRecordDTO {
	
//	@Getter
//	@Setter
	private Long source;
//	@Getter
//	@Setter
	private Long currency;
//	@Getter
//	@Setter
	private String goods;
//	@Getter
//	@Setter
	private BigDecimal amount;
	
	public CreateRecordDTO() {}
	public CreateRecordDTO(Long source,Long currency,String goods,BigDecimal amount) {
		this.source=source;
		this.currency=currency;
		this.goods=goods;
		this.amount=amount;
	}
	
	
	
	public Long getSource() {
		return source;
	}
	public void setSource(Long source) {
		this.source = source;
	}
	public Long getCurrency() {
		return currency;
	}
	public void setCurrency(Long currency) {
		this.currency = currency;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("source: ");
		sb.append(source);
		sb.append(", currency: ");
		sb.append(currency);
		sb.append(", goods: ");
		sb.append(goods);
		sb.append(" , amount: ");
		sb.append(amount);
		return sb.toString();
	}
}
