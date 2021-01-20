package io.eventuate.messaging.partitionmanagement;

/**
 * 作业管理器：初始化、读取、保存
 */
public interface AssignmentManager {
  void initializeAssignment(String groupId, String memberId, Assignment assignment);
  Assignment readAssignment(String groupId, String memberId);
  void saveAssignment(String groupId, String memberId, Assignment assignment);
}
