package show;

import person.Director;
import person.Person;

public class MusicalShow extends Show{
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, Director director, int duration, String librettoText, Person musicAuthor) {
        super(title, director, duration);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }


    public void printLibretto(){
        System.out.println(librettoText);
    }
}
