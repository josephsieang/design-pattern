import java.util.Iterator;

public class Disc {
  SongIterator song70s;
  SongIterator song80s;
  SongIterator song90s;

  public Disc(SongIterator song70s, SongIterator song80s, SongIterator song90s) {
    this.song70s = song70s;
    this.song80s = song80s;
    this.song90s = song90s;
  }

  public void showSongs() {
    Iterator<SongInfo> song70sIter = this.song70s.createIterator();
    Iterator<SongInfo> song80sIter = this.song80s.createIterator();
    Iterator<SongInfo> song90sIter = this.song90s.createIterator();

    System.out.println("Songs of the 70s:");
    this.printSongs(song70sIter);

    System.out.println("Songs of the 80s:");
    this.printSongs(song80sIter);

    System.out.println("Songs of the 90s:");
    this.printSongs(song90sIter);
  }

  public void printSongs(Iterator<SongInfo> iterator) {
    while (iterator.hasNext()) {
      SongInfo songInfo = (SongInfo) iterator.next();

      System.out.print(songInfo.getSongName() + " ");
      System.out.print(songInfo.getBandName() + " ");
      System.out.print(songInfo.getYearReleased());
      System.out.println();
    }
    System.out.println();
  }
}
