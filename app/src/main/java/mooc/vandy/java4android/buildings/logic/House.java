package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building {
  private String mOwner;
  private boolean mPool;

  public House(int length, int width, int lotLength, int lotWidth) {
    super(length, width, lotLength, lotWidth);
  }

  public House(int length, int width, int lotLength, int lotWidth, String owner) {
    this(length, width, lotLength, lotWidth);
    mOwner = owner;
  }

  public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
    this(length, width, lotLength, lotWidth, owner);
    mPool = pool;
  }

  public String getOwner() {
    return mOwner;
  }

  public boolean hasPool() {
    return mPool;
  }

  public void setOwner(String owner) {
    mOwner = owner;
  }

  public void setPool(boolean pool) {
    mPool = pool;
  }

  @Override
  public String toString() {
    String result = "Owner: ";

    //checks for ownership name
    if (mOwner != null)
      result += getOwner();
    else
      result += "n/a";

    //checks for pool
    if (hasPool())
      result += "; has a pool";

    //compares size of house and compound
    if(this.calcLotArea() > this.calcBuildingArea())
      result += "; has a big open space";
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof House) {
      House otherHouse = (House) obj;
      if (otherHouse.calcBuildingArea() == this.calcBuildingArea() && otherHouse.hasPool() == this.hasPool())
        return true;
    }
    return false;
  }
}
