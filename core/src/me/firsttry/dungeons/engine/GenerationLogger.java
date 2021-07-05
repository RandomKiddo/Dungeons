/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

import java.util.HashMap;

public class GenerationLogger {
    private HashMap<String, LogSection<? extends Object>> log;
    private GenerationLogger() {
        this.log = new HashMap<>();
    }
    public static GenerationLogger Init() { return new GenerationLogger(); }
    public void log(String message, Object object) {
        this.log.put(message, new LogSection(object));
    }
}
