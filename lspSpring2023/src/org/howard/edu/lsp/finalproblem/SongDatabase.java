package org.howard.edu.lsp.finalproblem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Miles Adedjouma

public class SongDatabase {
    /* Key is the genre, HashSet contains associated songs */
    private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        map.computeIfAbsent(genre, k -> new HashSet<>()).add(songTitle);
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<>());
    }

    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
