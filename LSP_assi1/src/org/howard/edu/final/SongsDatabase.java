package howard.edu.lsp.finals.problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

    public void addSong(String genre, String songTitle) {
        if (map.containsKey(genre)) {
            HashSet<String> songs = map.get(genre);
            songs.add(songTitle);
        } else {
            HashSet<String> songs = new HashSet<String>();
            songs.add(songTitle);
            map.put(genre, songs);
        }
    }

    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<String>());
    }

    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
            String genre = entry.getKey();
            HashSet<String> songs = entry.getValue();
            if (songs.contains(songTitle)) {
                return genre;
            }
        }
        return songTitle;
		
    }
}
