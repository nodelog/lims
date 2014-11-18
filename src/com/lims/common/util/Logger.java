package com.lims.common.util;


/**
 * 类名称：Logger
 * 类描述：日志接口
 */
public interface Logger{
	/**
	 * debug级别日志
	 * @param paramString
	 */
    void debug(String paramString);
    /**
     * info级别日志
     * @param paramString
     */
    void info(String paramString);
    /**
     * warn级别日志
     * @param paramString
     */
    void warn(String paramString);
    /**
     * error级别日志
     * @param paramString
     */
    void error(String paramString);
    /**
     * fatal级别日志 很少用
     * @param paramString
     */
    void fatal(String paramString);
}
