package io.eventuate.messaging.partitionmanagement;

/**
 * 分组成员工厂
 */
public interface GroupMemberFactory {
  GroupMember create(String groupId, String memberId);
}
