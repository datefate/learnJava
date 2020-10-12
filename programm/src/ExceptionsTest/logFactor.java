package ExceptionsTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author datefate
 * @site create 2020-09-23-上午9:29
 */
public class logFactor {
    public static void main(String[] args) {

        Log log = LogFactory.getLog(logFactor.class);
        log.info("Start");
        log.warn("end");

    }
}
