package me.firsttry.dungeons.engine;

public interface ReferenceSize {
    StaticRoomSize SMALL = new StaticRoomSize(
            new Dimension(20, 13),
            new Dimension(16, 13)
    );
    StaticRoomSize MEDIUM = new StaticRoomSize(
            new Dimension(24, 17),
            new Dimension(20, 13)
    );
    StaticRoomSize LARGE = new StaticRoomSize(
            new Dimension(28, 21),
            new Dimension(24, 17)
    );
    StaticRoomSize GIANT = new StaticRoomSize(
            new Dimension(34, 27),
            new Dimension(30, 23)
    );
}
