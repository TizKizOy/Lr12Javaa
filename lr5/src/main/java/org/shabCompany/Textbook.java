package org.shabCompany;

public class Textbook extends Book{
    private String subject;

    public Textbook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Предмет= " + subject);
    }
}
