package com.adamrybicki.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.logging.Logger;

@Component
public class KafkaReceiver {

  Logger logger = Logger.getLogger(getClass().getName());

  @KafkaListener(groupId = "5", topics = "HelloTopic")
  public void receiveMessage(String msg) {
    logger.info("received message: " + msg);
  }
}
