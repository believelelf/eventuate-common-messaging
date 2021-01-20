package io.eventuate.messaging.partitionmanagement;

import java.util.Set;
import java.util.function.Consumer;

/**
 * 分组管理器工厂
 */
public interface MemberGroupManagerFactory {
  MemberGroupManager create(String groupId, String memberId, Consumer<Set<String>> groupMembersUpdatedCallback);
}
