package com.ewolff.microservice.order.logic;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

public class OrderLine {

	private int count;

	private long itemId;

	private long id;

	public void setCount(int count) {
		this.count = count;
	}

	public void setItemId(long item) {
		this.itemId = item;
	}

	public OrderLine() {
	}

	public OrderLine(int count, long item) {
		this.count = count;
		this.itemId = item;
	}

	public int getCount() {
		return count;
	}

	public long getItemId() {
		return itemId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);

	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

}
