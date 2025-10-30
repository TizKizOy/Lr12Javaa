package org.shabCompany;

public class App 
{
    public static void main( String[] args )
    {
        Guitar guitar = new Guitar("первая", "красный");
        Instrument piano = new Piano("второе", "синего");


        Instrument inst;
        guitar.play();
        piano.play();
    }
}
