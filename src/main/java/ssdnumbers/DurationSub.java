package ssdnumbers;

public class DurationSub extends Duration{

    private final int hours;

    public DurationSub(int h, int m, int s) {
        super(m, s);
        this.hours = h;
    }

    public DurationSub(int m, int s) {
        super(m, s);
        this.hours = 0;
    }

    @Override
    public long getLength() {
        return this.hours * 3600L + super.getLength();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DurationSub) {
            return this.getLength() == ((DurationSub) obj).getLength();
        }else if (obj instanceof Duration){
            return this.getLength() == ((Duration) obj).getLength();
        }else {
            return false;
        }
    }
}
