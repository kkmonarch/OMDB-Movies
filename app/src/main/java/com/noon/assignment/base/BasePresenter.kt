package com.noon.assignment.base

import androidx.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BasePresenter {

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    open fun onCreate() {
    }

    @CallSuper
    open fun onDestroy() {
        compositeDisposable.clear()
    }

    protected fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }
}
