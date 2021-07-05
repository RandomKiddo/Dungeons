/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

public class Dimension {
    private int length, width;
    public Dimension(int l, int w) {
        this.length = l;
        this.width = w;
    }
    public int getLength() {
        return this.length;
    }
    public int getWidth() {
        return this.width;
    }
}
