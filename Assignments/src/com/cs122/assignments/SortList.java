package com.cs122.assignments;

public class SortList implements Comparable<SortList> {
	private int num;
	
	public SortList(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "" + num;
	}

	@Override
	public int compareTo(SortList number) {
		if(this.num == number.getNum())
			return 0;
		else if(this.num > number.getNum())
			return 1;
		else
			return -1;
	}
	
	public int getNum() {
		return this.num;
	}
}
