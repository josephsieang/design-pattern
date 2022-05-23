import java.util.Hashtable;
import java.util.Iterator;

public class SongOfThe90s implements SongIterator {
  Hashtable<Integer, SongInfo> bestSongs;

  int hashKey = 0;

  public SongOfThe90s() {
    this.bestSongs = new Hashtable<Integer, SongInfo>();

    addSong("Losing My Religion", "REM", 1991);
    addSong("Creep", "Radiohead", 1993);
    addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
  }

  public void addSong(String songName, String bandName, int yearReleased) {
    SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
    this.bestSongs.put(this.hashKey++, songInfo);
  }

  @Override
  public Iterator<SongInfo> createIterator() {
    return this.bestSongs.values().iterator();
  }
}
