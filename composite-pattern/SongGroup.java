import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
  ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();

  private String groupName;
  private String groupDesc;

  public SongGroup(String groupName, String groupDesc) {
    this.groupName = groupName;
    this.groupDesc = groupDesc;
  }

  public String getGroupName() {
    return this.groupName;
  }

  public String getGroupDesc() {
    return this.groupDesc;
  }

  public void add(SongComponent songComponent) {
    this.songComponents.add(songComponent);
  }

  public void remove(SongComponent songComponent) {
    this.songComponents.remove(songComponent);
  }

  public SongComponent getSongComponent(int idx) {
    return this.songComponents.get(idx);
  }

  public void displaySongInfo() {
    System.out.println(this.getGroupName() + " " + this.getGroupDesc());

    Iterator<SongComponent> songIter = this.songComponents.iterator();

    while (songIter.hasNext()) {
      SongComponent songInfo = songIter.next();
      songInfo.displaySongInfo();
    }
  }
}
