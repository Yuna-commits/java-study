package chapter03.watchTv;

public class WatchTV {
    public static void main(String[] args) {
        TV tv = new TV(7, 20, false);

        tv.status();

        tv.setPower(true);
        tv.status();

        tv.setVolume(false);
        tv.status();

        tv.setChannel(0);
        tv.status();

        tv.setChannel(false);
        tv.setChannel(false);
        tv.setChannel(false);
        tv.status();

        tv.setPower(false);
        tv.status();
    }
}