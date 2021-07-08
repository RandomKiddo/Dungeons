/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

public enum Room {
    STARTING_ROOM, // The room the player will start in
    TREASURE_ROOM, // A room with valuables
    BOSS_ROOM, // A room with the final boss battle
    ENEMY_ROOM, // A standard room with enemies in it
    PUZZLE_ROOM, // A puzzle room
    CORRIDOR, // A corridor connecting rooms
    TRAP_SECTION, // A trap for the player with enemies and explosives
    ARENA_ROOM, // A dome room with many mobs with high value
    CONNECTOR_ROOM, // A building room that branches out with many corridors
    DEAD_END; // An end to a pathway
    public static boolean deadEnds(Room room) {
        if (room == STARTING_ROOM || room == TREASURE_ROOM || room == BOSS_ROOM ||
            room == DEAD_END) {
            return true;
        }
        return false;
    }
}
