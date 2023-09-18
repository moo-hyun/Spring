package sub;

public class SamsungTV {
	
	
	private Speaker spk;

	public void powerOn() {
		System.out.println("SamsungTV power On...");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV power off...");
	}
	
	public void soundUp() {
		spk.soundUp();
	}
	
	public void soudnDonw() {
		spk.soundDown();
	}
}
