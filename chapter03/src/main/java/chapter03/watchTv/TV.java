package chapter03.watchTv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	private static final int MAX_CHANNEL = 255;
	private static final int MIN_CHANNEL = 1;
	private static final int MAX_VOLUME = 100;
	private static final int MIN_VOLUME = 0;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void setPower(boolean on) {
		this.power = on;
	}

	// 채널 설정 (1 ~ 255 )
	// 1 미만 -> 255, 255 초과 -> 1
	public void setChannel(int channel) {
		if (!power)
			return;

		if (channel < MIN_CHANNEL) {
			this.channel = MAX_CHANNEL;
		} else if (channel > MAX_CHANNEL) {
			this.channel = MIN_CHANNEL;
		} else {
			this.channel = channel;
		}
	}

	// 채널 증감 (1씩 증가/감소)
	public void setChannel(boolean up) {
		if (!power)
			return;

//		if (up) {
//			setChannel(channel + 1);
//		} else {
//			setChannel(channel - 1);
//		}

		setChannel(up ? channel + 1 : channel - 1);
	}

	// 볼륨 증감 ( 0 ~ 100 )
	public void setVolume(boolean up) {
		if (!power)
			return;

		volume += (up ? +1 : -1);

		// volume 이 범위를 벗어나는 경우
		if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
	}

	public void status() {
		System.out.println("TV[channel=" + channel + ", volume=" + volume + ", power=" + (power ? "on" : "off") + "]");
	}
}
