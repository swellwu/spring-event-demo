package com.swellwu;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * <p>Description:</p>
 *
 * @author xinjian.wxj
 * @date 2018-08-15
 */
public class EmailEvent extends ApplicationEvent {

    public EmailEvent(final String content) {
        super(content);
    }

}
