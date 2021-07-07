package com.github.hotire.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.status.Status;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LayoutDecorator implements Layout<ILoggingEvent> {

    @Getter
    private final Layout<ILoggingEvent> delegate;

    @Override
    public String doLayout(ILoggingEvent event) {
        return getDelegate().doLayout(event);
    }

    @Override
    public String getFileHeader() {
        return getDelegate().getFileHeader();
    }

    @Override
    public String getPresentationHeader() {
        return getDelegate().getPresentationHeader();
    }

    @Override
    public String getPresentationFooter() {
        return getDelegate().getPresentationFooter();
    }

    @Override
    public String getFileFooter() {
        return getDelegate().getFileFooter();
    }

    @Override
    public String getContentType() {
        return getDelegate().getContentType();
    }

    @Override
    public void setContext(Context context) {
        getDelegate().setContext(context);
    }

    @Override
    public Context getContext() {
        return getDelegate().getContext();
    }

    @Override
    public void addStatus(Status status) {
        getDelegate().addStatus(status);
    }

    @Override
    public void addInfo(String msg) {
        getDelegate().addInfo(msg);
    }

    @Override
    public void addInfo(String msg, Throwable ex) {
        getDelegate().addInfo(msg, ex);
    }

    @Override
    public void addWarn(String msg) {
        getDelegate().addWarn(msg);
    }

    @Override
    public void addWarn(String msg, Throwable ex) {
        getDelegate().addWarn(msg, ex);
    }

    @Override
    public void addError(String msg) {
        getDelegate().addWarn(msg);
    }

    @Override
    public void addError(String msg, Throwable ex) {
        getDelegate().addError(msg, ex);
    }

    @Override
    public void start() {
        getDelegate().start();
    }

    @Override
    public void stop() {
        getDelegate().stop();
    }

    @Override
    public boolean isStarted() {
        return getDelegate().isStarted();
    }
}
