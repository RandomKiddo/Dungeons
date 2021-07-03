/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

public class MetaData {
    private int enemies, gold, obstacles;
    private boolean loot;
    private Node node;
    public MetaData(Node n) {
        this.node = n;
    }
}
