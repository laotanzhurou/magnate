package io.magnate.cache.core.server.storage;

public interface Region <K, V>{

    void putEntry(K key, V value);
    void removeEntry(K key);

}
