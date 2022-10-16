package ssdnumbers;

import java.util.Objects;

public class DurationSubSub extends DurationSub{

    private final int d;
    public DurationSubSub(int d, int h, int m, int s) {
        super(h, m, s);
        this.d = d;
    }

    public DurationSubSub(int h, int m, int s) {
        super(h, m , s);
        this.d = 0;

    }
    public long getLength() {
        return d * 24L * 3600L+ super.getLength();
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof  DurationSubSub){
            return this.getLength() == ((DurationSubSub) o) .getLength();
        }if (o instanceof  DurationSub){
            return this.getLength() == ((DurationSub) o) .getLength();
        }
        return false;
    }

}
