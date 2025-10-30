package org.shabCompany;

public class App 
{
    public static void main( String[] args )
    {
        Instrumentable guitar = new Guitar();
        Piano piano = new Piano();

        guitar.play();
        guitar.stop();
        System.out.println();

        piano.play();
        piano.stop();
    }
}
