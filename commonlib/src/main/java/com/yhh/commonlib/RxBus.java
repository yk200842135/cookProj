package com.yhh.commonlib;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * @Author YangKai
 * @Email yk_200842135@163.com
 * @Date 2016-12-21
 * @Description
 */
public class RxBus {

    private final PublishSubject<BusEvent> publishSubject =  PublishSubject.create();
    private final Subject<BusEvent, BusEvent> mBus = new SerializedSubject<BusEvent, BusEvent>(publishSubject);

    private static class RxBusHolder {
        private static final RxBus INSTANCE = new RxBus();
    }

    private RxBus() {}

    public static final RxBus getInstance() {
        return RxBusHolder.INSTANCE;
    }

    public void send(BusEvent event) {
        mBus.onNext(event);
    }

    public Observable<BusEvent> toObserverable() {
        return mBus;
    }

    public boolean hasObservers() {
        return mBus.hasObservers();
    }

    public static class BusEvent {}
}
