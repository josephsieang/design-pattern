public class DiscPlayer {
  public static void main(String[] args) {
    SongOfThe70s songOfThe70s = new SongOfThe70s();
    SongOfThe80s songOfThe80s = new SongOfThe80s();
    SongOfThe90s songOfThe90s = new SongOfThe90s();

    Disc disc = new Disc(songOfThe70s, songOfThe80s, songOfThe90s);

    disc.showSongs();
  }
}
