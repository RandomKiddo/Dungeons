/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

public class StaticRoomSize {
    private int maxLength, minLength;
    private int maxWidth, minWidth;
    public StaticRoomSize(Dimension max, Dimension min) {
        this.maxLength = max.getLength();
        this.minLength = min.getLength();
        this.maxWidth = max.getWidth();
        this.minWidth = min.getWidth();
    }
    public Dimension getMaxDimension() { return new Dimension(this.maxLength, this.minLength); }
    public Dimension getMinDimension() { return new Dimension(this.maxWidth, this.minWidth); }
}
