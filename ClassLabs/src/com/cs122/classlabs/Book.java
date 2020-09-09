package com.cs122.classlabs;
//********************************************************************
//  Book.java       Author: Lewis/Loftus
//
//  Represents a book. Used as the parent of a derived class to
//  demonstrate inheritance.
//********************************************************************

public class Book
{
    protected int pages = 1500;
    public Book(){
        // 
    }
    //----------------------------------------------------------------
    //  Pages mutator.
    //----------------------------------------------------------------
    public void setPages(int numPages)
    {
        pages = numPages;
    }

    //----------------------------------------------------------------
    //  Pages accessor.
    //----------------------------------------------------------------
    public int getPages()
    {
        return pages;
    }
}
