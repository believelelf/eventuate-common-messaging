package io.eventuate.messaging.partitionmanagement;

/**
 * 订阅leader变更回调
 */
public interface SubscriptionLeaderHook {
  void leaderUpdated(Boolean leader, String subscriptionId);
}
