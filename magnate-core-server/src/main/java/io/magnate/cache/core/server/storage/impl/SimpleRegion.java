package io.magnate.cache.core.server.storage.impl;

import io.magnate.cache.core.server.storage.Region;

import java.util.concurrent.ConcurrentHashMap;

public class SimpleRegion implements Region<String, Object>{

    private ConcurrentHashMap<String, Object>  data = new ConcurrentHashMap<String, Object>(200, new Float(0.75), 16);

    public void putEntry(String key, Object value){
        data.put(key, value);
    }

    public void removeEntry(String key){
        data.remove(key);
    }

}
