package com.github.hotire.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;

public class CustomLayout extends LayoutBase<ILoggingEvent> {
    @Override
    public String doLayout(ILoggingEvent event) {
        final StringBuilder sb = new StringBuilder();
        sb.append("-");
        sb.append(event.getFormattedMessage());
        sb.append("-");
        return sb.toString();
    }
}
