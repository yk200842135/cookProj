package com.yhh.commonlib.util;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * @Author YangKai
 * @Email yk_200842135@163.com
 * @Date 2016-12-21
 * @Description
 */
public class RxUtils {

    public static void unsubscribeIfNotNull(Subscription subscription) {
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    public static CompositeSubscription getNewCompositeSubIfUnsubscribed(CompositeSubscription subscription) {
        if (subscription == null || subscription.isUnsubscribed()) {
            return new CompositeSubscription();
        }

        return subscription;
    }
}