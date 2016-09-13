import org.junit.*;
import static org.junit.Assert.*;

public class TuneTest {
  private Tune mTune;

  @Before
  public void initialize() {
    mTune = new Tune();
  }

  @Test
  public void Tune_instantiatesTune_true() {
    assertEquals(true, mTune instanceof Tune);
  }
}
