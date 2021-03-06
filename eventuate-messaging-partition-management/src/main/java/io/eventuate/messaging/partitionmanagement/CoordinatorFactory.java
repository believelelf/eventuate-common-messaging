package io.eventuate.messaging.partitionmanagement;

import io.eventuate.coordination.leadership.LeaderSelectedCallback;

import java.util.Set;
import java.util.function.Consumer;

/**
 * 协调者工厂
 */
public interface CoordinatorFactory {
  Coordinator makeCoordinator(String subscriberId,
                              Set<String> channels,
                              String subscriptionId,
                              Consumer<Assignment> assignmentUpdatedCallback,
                              String lockId,
                              LeaderSelectedCallback leaderSelected,
                              Runnable leaderRemoved);
}
