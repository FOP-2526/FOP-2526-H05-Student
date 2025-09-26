package h05.entity;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.RobotFamily;
import h05.Durable;
import h05.base.game.GameSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import java.awt.Point;

/**
 * A skeleton implementation of the {@link Durable} interface used to simplify the implementation of
 * repair bot in the world which only differ in the way they move to the repair location.
 *
 * @author Nhan Huynh, Nico Schnieders
 */
@DoNotTouch
public abstract class AbstractRepairBot extends Robot implements Repairer {

    /**
     * The game settings of this repair bot, which provides access to the world and other entities.
     */
    @DoNotTouch
    private final @NotNull GameSettings settings;

    /**
     * The radius of this repair bot, which determines how far it can scan for entities to repair.
     */
    @DoNotTouch
    private final int radius;

    /**
     * Constructs a new {@link AbstractRepairBot} instance with the specified position, game settings, and radius.
     *
     * @param x        the x-coordinate of the repair bot
     * @param y        the y-coordinate of the repair bot
     * @param settings the game settings of this repair bot, which provides access to the world and other entities
     * @param radius   the radius of this repair bot, which determines how far it can scan for entities to repair
     */
    @DoNotTouch
    public AbstractRepairBot(int x, int y, @NotNull GameSettings settings, int radius) {
        super(x, y, Direction.UP, 0, RobotFamily.SQUARE_RED);
        this.settings = settings;
        this.radius = radius;
    }

    @DoNotTouch
    @Override
    public @NotNull GameSettings getGameSettings() {
        return settings;
    }

    @DoNotTouch
    @Override
    public int getRadius() {
        return radius;
    }

    @StudentImplementationRequired("H5.5")
    @Override
    public @Nullable Point scan() {
        return org.tudalgo.algoutils.student.Student.crash(); // TODO: H5.5 - remove if implemented
    }

    @StudentImplementationRequired("H5.5")
    @Override
    public void repair(@NotNull Point point) {
        org.tudalgo.algoutils.student.Student.crash(); // TODO: H5.5 - remove if implemented
    }

    /**
     * Moves this repair bot to the specified point in the world.
     *
     * @param point the point to move to
     */
    @DoNotTouch
    protected abstract void move(@NotNull Point point);
}
