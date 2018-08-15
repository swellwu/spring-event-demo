package com.swellwu;

import org.springframework.context.ApplicationEvent;

/**
 * <p>Description:</p>
 *
 * @author xinjian.wxj
 * @date 2018-08-15
 */
public class ContentEvent extends ApplicationEvent {

    public ContentEvent(final String content) {
        super(content);
    }
}
