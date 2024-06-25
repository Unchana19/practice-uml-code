package models;

public class Die {
    private int faceValue;

    public void roll() {
        setFaceValue((int) (Math.random() * 6) + 1);
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}

// 6510405865 Oanchana Changcharoen