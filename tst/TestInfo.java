/*------------------------------------------------------------------------------*
 * An implementation of CritterInfo to support unit testing.                    *
 *                                                                              *
 * Really just a data wrapper.                                                  *
 *                                                                              *
 * Directional information is not needed for testing the "default" critters,    *
 * and is therefore not implemented.                                            *
 *------------------------------------------------------------------------------*/

import critter.Critter;
import critter.CritterInfo;

public class TestInfo implements CritterInfo {

    private Critter.Neighbor front, left, back, right;

    @SuppressWarnings("WeakerAccess")
    public TestInfo(Critter.Neighbor front, Critter.Neighbor left, Critter.Neighbor back, Critter.Neighbor right) {
        this.front = front;
        this.left = left;
        this.back = back;
        this.right = right;
    }

    @Override
    public Critter.Neighbor getFront() {
        return front;
    }

    @Override
    public Critter.Neighbor getLeft() {
        return left;
    }

    @Override
    public Critter.Neighbor getBack() {
        return back;
    }

    @Override
    public Critter.Neighbor getRight() {
        return right;
    }

    @Override
    public Critter.Direction getDirection() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Critter.Direction getFrontDirection() {
        throw new UnsupportedOperationException();

    }

    @Override
    public Critter.Direction getBackDirection() {
        throw new UnsupportedOperationException();

    }

    @Override
    public Critter.Direction getLeftDirection() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Critter.Direction getRightDirection() {
        throw new UnsupportedOperationException();
    }
}