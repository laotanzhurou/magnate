package io.magnate.cache.core.server.storage;

public interface Store <RK, R extends Region> {

    void removeRegion(RK key);
    void addRegion(RK key, R region);
}
