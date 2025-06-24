package api;

import java.util.List;

/**
 * 道具服务接口
 * 用于插件间通信，允许其他插件给玩家添加道具
 */
public interface PropService {
    /**
     * 给玩家添加道具
     * @param playerId 玩家QQ号
     * @param propCode 道具代码
     * @param amount 道具数量
     * @return 是否添加成功
     */
    boolean addPropToPlayer(Long groupId, long playerId, String propCode, int amount);

    /**
     * 给多个玩家添加道具
     * @param playerIds 玩家QQ号列表
     * @param propCode 道具代码
     * @param amount 道具数量
     * @return 成功添加的玩家数量
     */
    int addPropToPlayers(Long groupId, List<Long> playerIds, String propCode, int amount);
}
