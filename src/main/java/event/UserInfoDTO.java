package event;

import java.util.List;

public class UserInfoDTO {

    String action;

    Long groupId;

    List<Long> userIds;

    String propCode;


    public void setAction(String action) {
        this.action = action;
    }

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


    public String getAction() {
        return action;
    }
}
