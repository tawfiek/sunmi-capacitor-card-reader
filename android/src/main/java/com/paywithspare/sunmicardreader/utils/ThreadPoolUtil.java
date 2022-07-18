package com.paywithspare.sunmicardreader.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public final class ThreadPoolUtil {
    private final ExecutorService cachePool = Executors.newCachedThreadPool();
    private final ExecutorService singlePool = Executors.newSingleThreadExecutor();

    private static final class SingletonHolder {
        private static final ThreadPoolUtil INSTANCE = new ThreadPoolUtil();
    }

    private ThreadPoolUtil() {
    }

    public static void executeInSinglePool(Runnable r) {
        if (r != null) {
            SingletonHolder.INSTANCE.singlePool.execute(r);
        }
    }

    public static void executeInCachePool(Runnable r) {
        if (r != null) {
            SingletonHolder.INSTANCE.cachePool.execute(r);
        }
    }

    public static <V> Future<V> submitInCachePool(Callable<V> callable) {
        if (callable != null) {
            return SingletonHolder.INSTANCE.cachePool.submit(callable);
        }
        return null;
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
