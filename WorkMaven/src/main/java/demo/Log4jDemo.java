package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
			public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Hello world");
				
				logger.info("This is information msg");
				logger.error("This is a error msg");
				logger.warn("This is a warning msg");
				logger.fatal("This is a fatal msg");
				
				System.out.println("Completed---------------");
	
	}

}
