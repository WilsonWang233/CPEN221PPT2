package ssdnumbers;

public class Duration {
    private final int mins;
    private final int secs;

    public Duration(int m, int s) {
        mins = m; secs = s;
    }

    public long getLength() {
        return mins* 60L + secs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Duration) {
            return this.getLength() ==((Duration) obj).getLength();
        }
        return false;
    }
}
