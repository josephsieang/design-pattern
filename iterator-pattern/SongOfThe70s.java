import java.util.ArrayList;
import java.util.Iterator;

public class SongOfThe70s implements SongIterator {
  ArrayList<SongInfo> bestSongs;

  public SongOfThe70s() {
    this.bestSongs = new ArrayList<SongInfo>();

    addSong("Imagine", "John Lennon", 1971);
    addSong("American Pie", "Don McLean", 1971);
    addSong("I Will Survive", "Gloria Gaynor", 1979);
  }

  public void addSong(String songName, String bandName, int yearReleased) {
    SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
    this.bestSongs.add(songInfo);
  }

  @Override
  public Iterator<SongInfo> createIterator() {
    return this.bestSongs.iterator();
  }
}
