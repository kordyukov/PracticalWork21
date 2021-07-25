package com.alpha.work1;

public class Book {
    private int ID;
    private String name;
    private String autor;
    private String  publisher;
    private int yearPublisher;
    private int numberOfPages;
    private  double cost;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Book(int ID, String name, String autor, String publisher, int yearPublisher, int numberOfPages, double cost) {
        this.ID = ID;
        this.name = name;
        this.autor = autor;
        this.publisher = publisher;
        this.yearPublisher = yearPublisher;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
    }

    public void view(){

        System.out.println(this.ID+ " "+
                this.name+ " "+
                this.autor+ " "+
                this.publisher+ " "+
                this.yearPublisher+ " "+
                this.numberOfPages+ " "+
                this.cost);
    }


}
