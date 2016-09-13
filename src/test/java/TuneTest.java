import org.junit.*;
import static org.junit.Assert.*;

public class TuneTest {
  private Tune mTune;

  @Before
  public void initialize() {
    mTune = new Tune("Never Goin' Back Again", "Rumours", "Fleetwood Mac", "Folk/Rock", "1976", "Vinyl", "3:46", "never.mp3");
  }

  @Test
  public void Tune_instantiatesTune_true() {
    assertEquals(true, mTune instanceof Tune);
  }

  @Test
  public void getTitle_returnTitle_String() {
    assertEquals("Never Goin' Back Again", mTune.getTitle());
  }

  @Test
  public void getAlbum_returnAlbum_String() {
    assertEquals("Rumours", mTune.getAlbum());
  }

  @Test
  public void getArtist_returnArtist_String() {
    assertEquals("Fleetwood Mac", mTune.getArtist());
  }

  @Test
  public void getGenre_returnGenre_String() {
    assertEquals("Folk/Rock", mTune.getGenre());
  }

  @Test
  public void getYear_returnYear_String() {
    assertEquals("1976", mTune.getYear());
  }

  @Test
  public void getMedia_returnMedia_String() {
    assertEquals("Vinyl", mTune.getMedia());
  }

  @Test
  public void getDuration_returnDuration_String() {
    assertEquals("3:46", mTune.getDuration());
  }

  @Test
  public void getFilename_returnFilename_String() {
    assertEquals("never.mp3", mTune.getFilename());
  }
}
