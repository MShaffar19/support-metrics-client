/*
 * Copyright 2017 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.support.metrics.tools;

import io.confluent.support.metrics.common.kafka.ZkUtilsProvider;
import kafka.server.KafkaServer;
import kafka.utils.ZkUtils;

public class KafkaServerZkUtilsProvider implements ZkUtilsProvider{

  public KafkaServerZkUtilsProvider(KafkaServer kafkaServer) {
    this.kafkaServer = kafkaServer;
  }

  private KafkaServer kafkaServer;

  @Override
  public ZkUtils zkUtils() {
    return kafkaServer != null ? kafkaServer.zkUtils() : null;
  }
}