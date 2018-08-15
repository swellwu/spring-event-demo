package com.swellwu;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * <p>Description:</p>
 *
 * @author xinjian.wxj
 * @date 2018-08-15
 */
@Component
@Order(1)
public class UserOneListener implements ApplicationListener<ContentEvent> {

    public void onApplicationEvent(ContentEvent event) {
        System.out.println("[UserOneListener]msg：" + event.getSource());
    }
}
