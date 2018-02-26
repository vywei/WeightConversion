import static org.junit.Assert.*;
import org.junit.Test;

public class TestWeightConversion {

  @Test
  public void testKilosToPounds() {
    WeightConversion converter = new WeightConversion();
    double result = converter.KilosToPounds(0.454);
    assertEquals(result, 1, 0);
  }
  
  @Test
  public void testPoundsToKilos() {
    WeightConversion converter = new WeightConversion();
    double result = converter.PoundsToKilos(1);
    assertEquals(result, 0.454, 0);
  }

}
