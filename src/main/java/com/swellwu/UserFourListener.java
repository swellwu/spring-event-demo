package com.swellwu;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <p>Description:</p>
 *
 * @author xinjian.wxj
 * @date 2018-08-15
 */
@Component
public class UserFourListener implements SmartApplicationListener {


    public boolean supportsEventType(final Class<? extends ApplicationEvent> eventType) {
        return eventType == ContentEvent.class;
    }

    public boolean supportsSourceType(final Class<?> sourceType) {
        return sourceType == String.class;
    }

    public void onApplicationEvent(final ApplicationEvent event) {
        System.out.println("[UserFourListener]msg：" + event.getSource());
    }

    public int getOrder() {
        return 4;
    }
}
