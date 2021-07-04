/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

public class Node {
    public Room ROOM;
    private MetaData metaData;
    public Node(Room r) {
        this.ROOM = r;
        this.metaData = new MetaData(this);
    }
}
