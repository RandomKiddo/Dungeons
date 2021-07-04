/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

public class Dimension {
    public int length, width;
    private Dimension(int l, int w) {
        this.length = l;
        this.width = w;
    }
    public static Dimension MapSize(int[] size) {
        return new Dimension(size[0], size[1]);
    }
}
