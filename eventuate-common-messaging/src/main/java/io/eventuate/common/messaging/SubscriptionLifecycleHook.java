package io.eventuate.common.messaging;

import java.util.Set;

public interface SubscriptionLifecycleHook {
  void partitionsUpdated(String channel, String subscriptionId, Set<Integer> currentPartitions);
}
