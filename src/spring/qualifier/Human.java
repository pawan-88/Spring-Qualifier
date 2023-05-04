package spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	
	private Heart heart;
	@Autowired
	@Qualifier("heartObj")
	public void setHeart(Heart heart) {
		this.heart=heart;
	}
	
	public void startPumping() {
		heart.pump();
	}

}
