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
        queueGeneration();
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
    private void queueGeneration() {
        //Initialize GenerationLogger
        GenerationLogger log = GenerationLogger.Init();
        //Locate the starting pos
        int startX = this.map.length - 1;
        int startY = this.map[0].length / 2;
        this.map[startX][startY] = new Node(Room.STARTING_ROOM);
        //Generate Nearby Treasure
        CardinalDirection direction = ((int)(Math.random() * 2)) == 0 ? CardinalDirection.EAST : CardinalDirection.WEST;
        if (direction == CardinalDirection.EAST) {
            this.map[startX][startY + 1] = new Node(Room.CORRIDOR);
            this.map[startX][startY + 2] = new Node(Room.TREASURE_ROOM);
        } else {
            this.map[startX][startY - 1] = new Node(Room.CORRIDOR);
            this.map[startX][startY - 2] = new Node(Room.TREASURE_ROOM);
        }
        log.log("Cardinal direction is: " + direction.toString(), direction);
    }
}
