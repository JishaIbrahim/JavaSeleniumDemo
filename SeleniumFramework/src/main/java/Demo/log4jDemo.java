package Demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class log4jDemo {

	static Logger logger = LogManager.getLogger(log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("\n Hello \n");
        logger.debug("This is debug");
        logger.trace("This is trace");
        logger.info("This is information");
        logger.error("This is error");
        logger.warn("This is warning");
        logger.fatal("This is fatal");
        logger.debug("This is debug");
        System.out.println("Completed");
        
	}

}

