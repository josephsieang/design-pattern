public class Song extends SongComponent {
  private String songName;
  private String bandName;
  private int yearReleased;

  public Song(String songName, String bandName, int yearReleased) {
    this.songName = songName;
    this.bandName = bandName;
    this.yearReleased = yearReleased;
  }

  public String getSongName() {
    return this.songName;
  }

  public String getBandName() {
    return this.bandName;
  }

  public int getYearReleased() {
    return this.yearReleased;
  }

  public void displaySongInfo() {
    System.out.println(this.getSongName() + " was recorded by " + this.getBandName() + " in " + this.getYearReleased());
  }
}
