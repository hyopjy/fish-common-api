package event;

import java.util.List;
import java.util.Objects;

public class UserWinEvent {

    Long groupId;

    List<Long> userIds;

    String propCode;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }

    public String getPropCode() {
        return propCode;
    }

    public void setPropCode(String propCode) {
        this.propCode = propCode;
    }

    public UserWinEvent(Long groupId, List<Long> userIds, String propCode) {
        this.groupId = groupId;
        this.userIds = userIds;
        this.propCode = propCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserWinEvent that = (UserWinEvent) o;
        return Objects.equals(groupId, that.groupId) && Objects.equals(userIds, that.userIds) && Objects.equals(propCode, that.propCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, userIds, propCode);
    }
}
