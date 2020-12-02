package com.cs122.assignments;

public class BinarySearch<T> {
	
	public int binarySearch(T[] list, Comparable<T> target, int l, int r){
		int mid = (l+r)/2;
		
		if(l>=0 && r<list.length) {
			if(target.equals(list[mid]))
				return mid;
			else if(target.compareTo((T)list[mid]) < 0){
				return binarySearch(list, target, l, mid-1);
			}
			else {
				return binarySearch(list, target, mid+1, r);
			}
		}
		return -1;
	}
}
