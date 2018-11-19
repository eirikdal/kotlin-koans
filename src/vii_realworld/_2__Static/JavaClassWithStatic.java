package vii_realworld._2__Static;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaClassWithStatic {

    public static Logger logger = LoggerFactory.getLogger(JavaClassWithStatic.class);

    public void doSomething() {
        logger.debug("foobar");
    }
}
