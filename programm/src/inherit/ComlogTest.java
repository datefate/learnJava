package inherit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author datefate0
 * @site create 2020-10-02-上午9:39
 */
public class ComlogTest {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(ComlogTest.class);
        log.info("start...");
        log.warn("end.");
    }
}
