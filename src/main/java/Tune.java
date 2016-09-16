import java.io.Serializable;

public class Tune implements Comparable, Serializable {
  private String mTitle;
  private String mAlbum;
  private String mArtist;
  private String mGenre;
  private String mYear;
  private String mMedia;
  private String mDuration;
  private String mFilename;

  public Tune(String title, String album, String artist, String genre, String year, String media, String duration, String filename) {
    mTitle = title;
    mArtist = artist;
    mAlbum = album;
    mGenre = genre;
    mYear = year;
    mMedia = media;
    mDuration = duration;
    mFilename = filename;
  }

  @Override
  public String toString() {
    return mTitle + " by " mArtist;
  }

  @Override
  public int compareTo(Object obj) {
    Tune otherTune = (Tune) obj;
    if(equals(otherTune)) {
      return 0;
    }
    int titleComp = mTitle.compareTo(otherTune.mTitle);
    if(titleComp==0) {
      int artistComp = mArtist.compareTo(otherTune.mArtist);
      if(artistComp==0) {
        return mAlbum.compareTo(otherTune.mAlbum);
      }
    }
  }

  public String getTitle() {
    return mTitle;
  }

  public String getAlbum() {
    return mAlbum;
  }

  public String getArtist() {
    return mArtist;
  }

  public String getGenre() {
    return mGenre;
  }

  public String getYear() {
    return mYear;
  }

  public String getMedia() {
    return mMedia;
  }

  public String getDuration() {
    return mDuration;
  }

  public String getFilename() {
    return mFilename;
  }
}
