public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, Director director, int duration, String librettoText, Person musicAuthor, int choirSize) {
        super(title, director, duration, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
