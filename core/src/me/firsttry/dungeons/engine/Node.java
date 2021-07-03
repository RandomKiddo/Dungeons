/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

import me.firsttry.dungeons.engine.Room;
import me.firsttry.dungeons.engine.MetaData;

public class Node {
    private Room room;
    public Node(Room r) {
        this.room = r;
    }
    public MetaData getData() {
        return null; //impl
    }
}
