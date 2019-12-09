package com.emitter.test;

import com.google.inject.AbstractModule;

public class TestConfiguration extends AbstractModule {

    @Override
    protected void configure() {
        final var to = bind(TestFlowableEmit.class)
                .annotatedWith(Configuration.class)
                .to((Class<? extends TestFlowableEmit>) TestFlowableEmitter.class);
    }

    public class TestConditions {


        public TestFlowableEmitter testEmit(){

            return new TestFlowableEmitter();
        }
    }

    public static interface TestFlowableEmit {
    }

    static class TestFlowableEmitter{

        public boolean apply(){
            return true;
        }

    }
}
