/**
 * 
 */
package com.lims.common.util;


/**
 * 类名称：LoggerImpl
 * 类描述：日志实现类
 */
public class LoggerImpl implements Logger {
    private org.apache.log4j.Logger logger;
    
    public void init() {
        this.logger = org.apache.log4j.Logger.getRootLogger();
    }

    public void debug(String paramString) {
        logger.debug(paramString);
    }

    public void error(String paramString) {
        logger.error(paramString);

    }

    public void fatal(String paramString) {
        logger.fatal(paramString);

    }

    public void info(String paramString) {
        logger.info(paramString);

    }

    public void warn(String paramString) {
        logger.warn(paramString);

    }

}
