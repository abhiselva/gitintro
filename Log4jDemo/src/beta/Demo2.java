package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo2 {
	
	//public static Logger log = LogManager.getLogger(Demo1.class.getName());
//	public static Logger log = LogManager.getLogger(Demo1.class.getName());
	private static Logger log =LogManager.getLogger(Demo2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I am in debug");
		log.error("I am in error");
		log.info("I am in info");
		log.fatal("I am in fatal");

	}

}
