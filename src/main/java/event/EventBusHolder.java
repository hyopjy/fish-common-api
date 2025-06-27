package event;

import org.greenrobot.eventbus.EventBus;

public final class EventBusHolder {
    public static final EventBus PLUGIN_EVENT_BUS = new EventBus(); // Guava EventBus 示例
    // 或者使用 AsyncEventBus: public static final EventBus PLUGIN_EVENT_BUS = new AsyncEventBus(Executors.newCachedThreadPool());
}
