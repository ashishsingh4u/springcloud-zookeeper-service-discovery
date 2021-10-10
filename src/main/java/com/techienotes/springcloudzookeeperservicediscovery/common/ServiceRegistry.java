package com.techienotes.springcloudzookeeperservicediscovery.common;

public interface ServiceRegistry extends AutoCloseable {

    ServiceInstanceMapper getInstanceByName(String name);
}
