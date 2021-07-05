/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

import java.util.HashMap;

//Functional Interface
public interface Data {
     HashMap<String, ? extends Object> getLinkedData();
}
