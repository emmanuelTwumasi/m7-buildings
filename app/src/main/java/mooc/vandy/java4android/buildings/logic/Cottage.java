package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
       extends House {
    private boolean mSecondFloor;

    // TODO - Put your code here.

    //where dimension represents length as well as width
    public Cottage(int dimension, int lotLength, int lotWidth){
        super(dimension,dimension,lotLength,lotWidth);
    }
    public Cottage(int dimension,int lotLength, int lotWidth,String owner, boolean SecondFloor){
        super(dimension,dimension,lotLength,lotWidth,owner);
        this.mSecondFloor = SecondFloor;
    }

    public boolean hasSecondFloor(){
        return mSecondFloor;
    }

    @Override
    public String toString(){
        String pass;
        if (super.getOwner()!=null){
            pass = getOwner();
        }else
            pass = "n/a";
        if (hasPool()) {
            //checks if the building area is larger than the lot area
            if (calcBuildingArea() >= calcLotArea()) {
                pass += "; has a pool.";
            } else
                pass += "; has a pool; has a big open space.";
            if (this.hasSecondFloor())
                pass +=";is a two story cottage";
            else
                pass += "; is a cottage.";
        }//end of if

        return pass;
    }

}

