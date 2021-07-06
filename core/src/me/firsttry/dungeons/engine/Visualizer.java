/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

import java.util.List;
import java.util.ArrayList;

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
        return ((int)(Math.random() * ++difference) + this.reference.getMinDimension().getLength());
    }
    private int generateWidth() {
        int difference = this.reference.getMaxDimension().getWidth() - this.reference.getMinDimension().getWidth();
        return ((int)(Math.random() * ++difference) + this.reference.getMinDimension().getWidth());
    }
    private void queueGeneration() {
        //Initialize GenerationLogger
        GenerationLogger logger = GenerationLogger.Init();
        //Locate the starting pos
        int startX = this.map.length - 1;
        int startY = this.map[0].length / 2;
        this.map[startX][startY] = new Node(Room.STARTING_ROOM);
        //Generate nearby treasure
        CardinalDirection direction = ((int)(Math.random() * 2)) == 0 ? CardinalDirection.EAST : CardinalDirection.WEST;
        if (direction == CardinalDirection.EAST) {
            this.map[startX][startY + 1] = new Node(Room.CORRIDOR);
            this.map[startX][startY + 2] = new Node(Room.TREASURE_ROOM);
        } else {
            this.map[startX][startY - 1] = new Node(Room.CORRIDOR);
            this.map[startX][startY - 2] = new Node(Room.TREASURE_ROOM);
        }
        logger.log("Cardinal direction is: " + direction.toString(), direction);
        int currentX = startX, currentY = 0;
        //Create new stems from other directions
        if (direction == CardinalDirection.EAST) {
            this.map[startX][startY - 1] = new Node(Room.CORRIDOR);
            direction = CardinalDirection.WEST;
            currentY = startY - 1;
        } else {
            this.map[startX][startY + 1] = new Node(Room.CORRIDOR);
            direction = CardinalDirection.EAST;
            currentY = startY + 1;
        }
        this.map[startX - 1][startY] = new Node(Room.CORRIDOR);
        logger.log("Continuous cardinal direction is: " + direction.toString(), direction);
        //Start randomized generation
        //Start at non-northern section
        final Room[] availableRooms = {
                Room.TREASURE_ROOM,
                Room.BOSS_ROOM,
                Room.ENEMY_ROOM,
                Room.PUZZLE_ROOM,
                Room.CORRIDOR,
                Room.TRAP_SECTION,
                Room.ARENA_ROOM,
                Room.CONNECTOR_ROOM
        };
        final CardinalDirection[] availableDirections = {
                CardinalDirection.NORTH,
                CardinalDirection.SOUTH,
                CardinalDirection.EAST,
                CardinalDirection.WEST
        };
        List<Room> usedRooms = new ArrayList<Room>(25);
        boolean doneWithNorth = false;
        //continue with gen
    }
    private Object choose(Object[] arr) {
        int rand = (int)(Math.random() * arr.length);
        return arr[rand];
    }
}
