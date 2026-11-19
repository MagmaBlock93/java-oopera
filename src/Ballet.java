public class Ballet extends MusicalShow{
    Person choreographer;

    public Ballet(String title, Director director, int duration, String librettoText, Person musicAuthor, Person choreographer) {
        super(title, director, duration, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
