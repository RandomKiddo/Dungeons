/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

public enum CardinalDirection {
    NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST;
    public static CardinalDirection not(CardinalDirection direction) {
        switch (direction) {
            case NORTH:
                return SOUTH;
            case NORTHEAST:
                return SOUTHWEST;
            case EAST:
                return WEST;
            case SOUTHEAST:
                return NORTHWEST;
            case SOUTH:
                return NORTH;
            case SOUTHWEST:
                return NORTHEAST;
            case WEST:
                return EAST;
            case NORTHWEST:
                return SOUTHEAST;
            default:
                //tilt: should not get here
                return NORTH;
        }
    }
    public static CardinalDirection[] disclude(CardinalDirection direction, boolean includeDiagonals) {
        if (includeDiagonals) {
            final CardinalDirection[] available = {
                    NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST };
            CardinalDirection[] directions = new CardinalDirection[7];
            int index = 0;
            for (CardinalDirection current : available) {
                if (current != direction) {
                    directions[index] = current;
                    ++index;
                }
            }
            return directions;
        } else {
            final CardinalDirection[] available = { NORTH, SOUTH, EAST, WEST };
            CardinalDirection[] directions = new CardinalDirection[3];
            int index = 0;
            for (CardinalDirection current : available) {
                if (current != direction) {
                    directions[index] = current;
                    ++index;
                }
            }
            return directions;
        }
    }
}
