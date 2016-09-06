class Triangle {
  public int mSideOne;
  public int mSideTwo;
  public int mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree){
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public boolean testingTriangle() {
    return ((mSideOne + mSideTwo > mSideThree) && (mSideTwo + mSideThree > mSideOne) && (mSideOne + mSideThree > mSideTwo));
  }
  public boolean testingEquilateral() {
    return ((mSideOne == mSideTwo) && (mSideTwo == mSideThree));
  }

  public boolean testingScalene(){
    return ((mSideOne != mSideTwo) && (mSideOne != mSideThree) && (mSideTwo != mSideThree));
  }
}
