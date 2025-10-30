package org.shabCompany;

public class Encyclopedia extends Book{
    private int volume;

    public Encyclopedia(String title, String author, int year, int volume) {
        super(title, author, year);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Том= " + volume);
    }
}
