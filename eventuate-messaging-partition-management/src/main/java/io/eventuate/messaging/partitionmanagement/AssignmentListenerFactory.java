package io.eventuate.messaging.partitionmanagement;

import java.util.function.Consumer;

/**
 * 作业监听器创建者
 */
public interface AssignmentListenerFactory {
  AssignmentListener create(String groupId, String memberId, Consumer<Assignment> assignmentUpdatedCallback);
}
