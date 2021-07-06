/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

import java.util.HashMap;
import java.util.Map;

public class GenerationLogger {
    private HashMap<String, LogSection<? extends Object>> log;
    private GenerationLogger() {
        this.log = new HashMap<>();
    }
    public static GenerationLogger Init() { return new GenerationLogger(); }
    public void log(String message, Object object) {
        this.log.put(message, new LogSection(object));
    }
    public Object locate(String message) {
        for (Map.Entry<String, LogSection<? extends Object>> entry : this.log.entrySet()) {
            if (entry.getKey().contains(message)) {
                return entry.getValue().getObject();
            }
        }
        return new Object();
    }
}
