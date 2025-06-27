package event;

import api.PropService;

import java.util.List;
import java.util.Objects;

public class PropSendEvent {

    public static PropService PROP_SERVICE;

    public static void setPropSendEvent(PropService prop){
        PROP_SERVICE = prop;
    }


    public static void sendMessage(Long groupId, List<Long> playerIds, String propCode){
        if(Objects.nonNull(PROP_SERVICE)){
            System.out.println("=================");
            PROP_SERVICE.addPropToPlayers(groupId, playerIds, propCode);
        }
        System.out.println("----------------------");
    }
}
