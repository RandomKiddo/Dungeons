/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

import java.util.HashMap;

public class MetaData implements Data {
    private int enemies, gold, obstacles, loot;
    private Node node;
    public MetaData(Node n) {
        this.node = n;
        switch (n.ROOM) {
            case STARTING_ROOM:
                this.enemies = 0;
                this.gold = 0;
                this.obstacles = 0;
                this.loot = 0;
                break;
            case TREASURE_ROOM:
                this.enemies = 0;
                this.gold = (int)(Math.random() * 1101) + 100;
                this.obstacles = 0;
                this.loot = (int)(Math.random() * 3);
                break;
            case BOSS_ROOM:
                this.enemies = 1;
                this.gold = 0;
                this.obstacles = 0;
                this.loot = 0;
                break;
            case ENEMY_ROOM:
                this.enemies = (int)(Math.random() * 6) + 1;
                this.gold = (int)(Math.random() * 115);
                this.obstacles = (int)(Math.random() * 5);
                this.loot = ((int)(Math.random() * 150)) == 0 ? 1 : 0;
                break;
            case PUZZLE_ROOM:
                this.enemies = 0;
                this.gold = (int)(Math.random() * 115);
                this.obstacles = 0;
                this.loot = 0;
                break;
            case CORRIDOR:
                this.enemies = (int)(Math.random() * 4);
                this.gold = (int)(Math.random() * 60);
                this.obstacles = ((int)(Math.random() * 150)) == 0 ? 1 : 0;
                this.loot = 0;
                break;
            case TRAP_SECTION:
                this.enemies = 0;
                this.gold = 0;
                this.obstacles = (int)(Math.random() * 3);
                this.loot = 0;
                break;
            case ARENA_ROOM:
                this.enemies = (int)(Math.random() * 14) + 1;
                this.gold = (int)(Math.random() * 450) + 50;
                this.obstacles = (int)(Math.random() * 3);
                this.loot = ((int)(Math.random() * 100)) < 20 ? 1 : 0;
                break;
            case CONNECTOR_ROOM:
                this.enemies = (int)(Math.random() * 8);
                this.gold = (int)(Math.random() * 50);
                this.obstacles = (int)(Math.random() * 3) + 1;
                this.loot = 0;
                break;
        }
    }
    public HashMap<String, Integer> getLinkedData() {
        HashMap<String, Integer> linked = new HashMap<String, Integer>();
        linked.put("enemies", this.enemies);
        linked.put("gold", this.gold);
        linked.put("obstacles", this.obstacles);
        linked.put("loot", this.loot);
        return linked;
    }
}
