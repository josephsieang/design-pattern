public class SongListGenerator {
  public static void main(String[] args) {
    SongComponent industrialMusic = new SongGroup("Industrial", "is industrial");

    SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "is heavy metal");

    SongComponent dubStepMusic = new SongGroup("Dub Step", "is dub step");

    SongComponent allSong = new SongGroup("Song List", "every song is here");

    allSong.add(industrialMusic);

    industrialMusic.add(new Song("Head", "NIN", 1997));
    industrialMusic.add(new Song("Head2", "NIN2", 1998));
    industrialMusic.add(dubStepMusic);

    dubStepMusic.add(new Song("dubStep1", "dubStep1", 1999));
    dubStepMusic.add(new Song("dubStep2", "dubStep2", 2000));

    allSong.add(heavyMetalMusic);

    heavyMetalMusic.add(new Song("heavyMetalMusic1", "heavyMetalMusic1", 2001));
    heavyMetalMusic.add(new Song("heavyMetalMusic2", "heavyMetalMusic2", 2002));

    Disc disc = new Disc(allSong);
    disc.getSongList();
  }
}
