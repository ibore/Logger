package me.ibore.logger;

/**
 * Created by Administrator on 2017/7/13.
 */

public interface LogAdapter {

    boolean isLoggable(int priority, String tag);

    void log(int priority, String tag, String message);

}
