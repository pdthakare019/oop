class VideoTape {
    protected String title;
    protected int length;
    protected boolean available;

    public VideoTape(String title, int length, boolean available) {
        this.title = title;
        this.length = length;
        this.available = available;
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}

class Movie extends VideoTape {
    private String director;
    private String rating;

    public Movie(String title, int length, boolean available, String director, String rating) {
        super(title, length, available);
        this.director = director;
        this.rating = rating;
    }

    public void show() {
        super.show();
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }
}

class MusicVideo extends VideoTape {
    private String artist;
    private String category;

    public MusicVideo(String title, int length, boolean available, String artist, String category) {
        super(title, length, available);
        this.artist = artist;
        this.category = category;
    }

    public void show() {
        super.show();
        System.out.println("Artist: " + artist);
        System.out.println("Category: " + category);
    }
}

public class music {
    public static void main(String[] args) {
        Movie movie = new Movie("The Shawshank Redemption", 142, true, "Frank Darabont", "9.3/10");
        System.out.println("Movie Details:");
        movie.show();

        System.out.println();

        MusicVideo musicVideo = new MusicVideo("Thriller", 14, true, "Michael Jackson", "Pop");
        System.out.println("Music Video Details:");
        musicVideo.show();
    }
}
