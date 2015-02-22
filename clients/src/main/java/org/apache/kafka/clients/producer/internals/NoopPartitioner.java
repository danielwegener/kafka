package org.apache.kafka.clients.producer.internals;


import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

public class NoopPartitioner implements Partitioner<Object,Object> {

    @Override
    public Integer partition(String topic, Object key, Object payload, Cluster cluster) {
        return null;
    }

    @Override
    public void configure(Map<String, ?> configs) {
        // nothing to configure
    }
}
