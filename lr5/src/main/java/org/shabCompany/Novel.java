package org.shabCompany;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Жанр= " + genre);
    }
}
