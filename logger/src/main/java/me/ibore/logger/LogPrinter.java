package me.ibore.logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/13.
 */

public class LogPrinter implements Printer {

    List<LogAdapter> logAdapters = new ArrayList<>();

    @Override
    public void addAdapter(LogAdapter adapter) {
        logAdapters.add(adapter);
    }

    @Override
    public Printer t(String tag) {
        return null;
    }

    @Override
    public void d(String message, Object... args) {

    }

    @Override
    public void d(Object object) {

    }

    @Override
    public void e(String message, Object... args) {

    }

    @Override
    public void e(Throwable throwable, String message, Object... args) {

    }

    @Override
    public void w(String message, Object... args) {

    }

    @Override
    public void i(String message, Object... args) {

    }

    @Override
    public void v(String message, Object... args) {

    }

    @Override
    public void wtf(String message, Object... args) {

    }

    @Override
    public void json(String json) {

    }

    @Override
    public void xml(String xml) {

    }

    @Override
    public void log(int priority, String tag, String message, Throwable throwable) {

    }

    @Override
    public void clearLogAdapters() {

    }
}
