package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // TODO - Put your code here.


    private int mLength;
    private int mWidth;
    private int mLotLength;
    private  int mLotWidth;

    //constructor


    public Building(int length, int width, int lotLength, int lotWidth) {
       this.mLength = length;
        this.mWidth = width;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }

    //getters and setter methods
    public int getLength() {
        return mLength;
    }

    public void setLength(int length) {
        mLength = length;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int width) {
        mWidth = width;
    }

    public int getLotLength() {
        return mLotLength;
    }

    public void setLotLength(int lotLength) {
        mLotLength = lotLength;
    }

    public int getLotWidth() {
        return mLotWidth;
    }

    public void setLotWidth(int lotWidth) {
        mLotWidth = lotWidth;
    }



    //methods
    public int calcBuildingArea(){
        return getLength()*getWidth();
    }
    public int calcLotArea(){

        return getLotLength()*getLotWidth();

    }

    @Override
    public String toString(){
        return ("a "+getLength()+" x "+getWidth()+" building.");

    }
}
