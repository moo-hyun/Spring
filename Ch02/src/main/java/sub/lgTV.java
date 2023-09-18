package sub;

import org.springframework.beans.factory.annotation.Autowired;

public class lgTV {
	
	@Autowired
	private Speaker spk;

	public void powerOn() {
		System.out.println("LgTv power On...");
	}
	
	public void powerOff() {
		System.out.println("LgTv power off...");
	}
	
	public void soundUp() {
		spk.soundUp();
	}
	
	public void soudnDonw() {
		spk.soundDown();
	}
}
