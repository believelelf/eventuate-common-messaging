package io.eventuate.messaging.partitionmanagement;

import java.util.Set;

/**
 * 订阅生命同期回调
 */
public interface SubscriptionLifecycleHook {
  void partitionsUpdated(String channel, String subscriptionId, Set<Integer> currentPartitions);
}
