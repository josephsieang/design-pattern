public class Disc {
  SongComponent songList;

  public Disc(SongComponent songList) {
    this.songList = songList;
  }

  public void getSongList() {
    this.songList.displaySongInfo();
  }
}
