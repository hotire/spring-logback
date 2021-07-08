package com.github.hotire.logback;

import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LayoutWrappingEncoderDecorator extends LayoutWrappingEncoder<LayoutWrappingEncoderDecorator> {
    private final LayoutWrappingEncoder<LayoutWrappingEncoderDecorator> delegate;
}
