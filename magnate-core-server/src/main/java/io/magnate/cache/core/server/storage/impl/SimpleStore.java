package io.magnate.cache.core.server.storage.impl;

import io.magnate.cache.core.server.storage.Region;
import io.magnate.cache.core.server.storage.Store;

import java.util.concurrent.ConcurrentHashMap;

public class SimpleStore implements Store<String, SimpleRegion> {

    ConcurrentHashMap<String, SimpleRegion> regions = new ConcurrentHashMap<String, SimpleRegion>(8, new Float(0.75), 16);

    public void removeRegion(String key){
        regions.remove(key);
    };

    public void addRegion(String key, SimpleRegion region){
        regions.put(key, region);
    };
}
