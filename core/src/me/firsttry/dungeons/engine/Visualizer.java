/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

public class Visualizer {
    private Node[][] map;
    private StaticRoomSize reference;
    private Visualizer(StaticRoomSize reference) {
        this.reference = reference;
        this.map = new Node[generateLength()][generateWidth()];
    }
    public static Visualizer Generate(StaticRoomSize reference) {
        return new Visualizer(reference);
    }
    private int generateLength() {
        int difference = this.reference.getMaxDimension().getLength() - this.reference.getMinDimension().getLength();
        int rand = (int)(Math.random() * ++difference) + this.reference.getMinDimension().getLength();
        return rand;
    }
    private int generateWidth() {
        int difference = this.reference.getMaxDimension().getWidth() - this.reference.getMinDimension().getWidth();
        int rand = (int)(Math.random() * ++difference) + this.reference.getMinDimension().getWidth();
        return rand;
    }
}
