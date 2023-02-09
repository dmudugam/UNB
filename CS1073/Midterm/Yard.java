
public class Yard {
 private int length;
 private int width;
 private LandscapeMaterial covering;
 public Yard (int lengthIn, int widthIn,
 LandscapeMaterial coveringIn) {
 length = lengthIn;
 width = widthIn;
 covering = coveringIn;
 }
 public LandscapeMaterial getCovering () {
 return covering;
 }
 public int getArea () {
 return length * width;
 }
 public int getPrice () {
 return (getArea() * covering.getPrice());
 }
 public void increaseLength (int amount) {
 length = length + amount;
 }
 public void increaseWidth (int amount) {
 width = width + amount;
 }
}