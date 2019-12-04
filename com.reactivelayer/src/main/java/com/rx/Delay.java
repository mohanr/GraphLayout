package com.rx;

import io.reactivex.functions.Supplier;
import io.reactivex.observers.DisposableObserver;

/**
 * Delay for the observer separated for convenience.
 */
public interface Delay {

    public <V> V delayFor(Supplier<? super DisposableObserver> o );
}
