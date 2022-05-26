import java.awt.Color;
import java.util.HashMap;

public class RectFactory {
  private static final HashMap<Color, Rect> rectsByColor = new HashMap<Color, Rect>();

  public static Rect getRect(Color color) {
    Rect rect = (Rect) rectsByColor.get(color);
    if (rect == null) {
      rect = new Rect(color);
      rectsByColor.put(color, rect);
    }
    return rect;
  }
}
