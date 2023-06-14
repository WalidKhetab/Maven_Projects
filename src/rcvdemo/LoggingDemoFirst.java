package rcvdemo;

import org.apache.logging.log4j.*;

public class LoggingDemoFirst {
    
	private static Logger demologger = LogManager.getLogger(LoggingDemoFirst.class.getName());
			//LoggingDemoFirst.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("This is my first logger 4J app");
    demologger.info("Click Successfull");
    demologger.error("DB Connection failed");
    demologger.info("Click Successfull");
    demologger.error("DB Connection failed");
    //demologger.fatal("DB Connection failed");
	}
 
}
