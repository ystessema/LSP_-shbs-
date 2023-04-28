package howard.edu.lsp.finals.problem;


import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> songs = db.getSongs("Rap");
        System.out.println(songs); // Prints [Savage, Gin and Juice]

        System.out.println(db.getGenreOfSong("Savage")); // Prints "Rap"
        System.out.println(db.getGenreOfSong("Always There")); // Prints "Jazz"
    }
}
