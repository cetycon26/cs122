package com.cs122.assignments;

public class ReverseSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortList[] a = new SortList[5];
		a[0] = new SortList(2);
		a[1] = new SortList(8);
		a[2] = new SortList(6);
		a[3] = new SortList(18);
		a[4] = new SortList(10);
		
		Sorting<SortList> select = new Sorting<SortList>();
		select.selectionSort(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
		Sorting<SortList> insert = new Sorting<SortList>();
		insert.insertionSort(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
