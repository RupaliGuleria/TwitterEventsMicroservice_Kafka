package com.microservices.demo.kafka.producer.config.service;

import org.apache.avro.specific.SpecificRecordBase;

import java.io.Serializable;

public interface KafkaProducer<k extends Serializable, V extends SpecificRecordBase> {
        void send(String topicName,k Key, V message);

}
