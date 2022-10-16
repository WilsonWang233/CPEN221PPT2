package ssdnumbers;

public class DurationSame extends Duration{

    public DurationSame(int m, int s) {
        super(m, s);
    }

    public long getLength() {
        return 999L + super.getLength();
    }
}
