/**
 * Dungeons
 * © 2021 RandomKiddo
 * Licensed under the GNU GPLv3
 */

package me.firsttry.dungeons.engine;

public class LogSection<T> {
    private T object;
    private Class<? extends Object> classData;
    public LogSection(T obj) {
        this.object = obj;
        this.classData = this.object.getClass();
    }
    public T getObject() { return this.object; }
    public Class<? extends Object> getClassCaptureData() { return this.classData; }
}
