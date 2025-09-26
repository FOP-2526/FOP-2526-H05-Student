package h05.equipment;

import org.jetbrains.annotations.NotNull;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * A camera is a type of equipment that defines the vision of an entity.
 *
 * @author Nhan Huynh, Nico Schnieders
 */
public class Camera implements Equipment {

    /**
     * The default visibility range of the camera.
     */
    @DoNotTouch
    public static final int DEFAULT_VISIBILITY_RANGE = 1;

    @DoNotTouch
    private int visibilityRange;

    /**
     * Constructs a new {@link Camera} instance with the specified visibility range.
     *
     * @param visibilityRange the visibility range of the camera, must be at least 1
     */
    @DoNotTouch
    public Camera(int visibilityRange) {
        this.visibilityRange = visibilityRange;
    }

    /**
     * Constructs a new {@link Camera} instance with the default visibility range of {@value DEFAULT_VISIBILITY_RANGE}.
     */
    @DoNotTouch
    public Camera() {
        this(DEFAULT_VISIBILITY_RANGE);
    }

    /**
     * Returns the visibility range of this camera, which defines how far an entity attached to this camera can see.
     *
     * @return the visibility range of this camera
     */
    @StudentImplementationRequired("H5.2.2")
    public int getVisibilityRange() {
        return org.tudalgo.algoutils.student.Student.crash(); // TODO: H5.2.2 - remove if implemented
    }

    /**
     * Sets the visibility range of this camera, which defines how far an entity attached to this camera can see.
     *
     * <p>The visibility range must be at least 1. If a value less than 1 is provided, it will be set to 1.
     *
     * @param visibilityRange the new visibility range for this camera
     */
    @StudentImplementationRequired("H5.2.2")
    public void setVisibilityRange(int visibilityRange) {
        org.tudalgo.algoutils.student.Student.crash(); // TODO: H5.2.2 - remove if implemented
    }

    @Override
    @StudentImplementationRequired("H5.2")
    public @NotNull String getName() {
        return org.tudalgo.algoutils.student.Student.crash(); // TODO: H5.2 - remove if implemented
    }

    @StudentImplementationRequired("H5.2.1")
    @Override
    public @NotNull EquipmentCondition getCondition() {
        return org.tudalgo.algoutils.student.Student.crash(); // TODO: H5.2.1 - remove if implemented;
    }

    @Override
    @DoNotTouch
    public boolean isUsable() {
        return false;
    }

    @Override
    @DoNotTouch
    public boolean isTool() {
        return false;
    }

    @Override
    @StudentImplementationRequired("H5.1")
    public double getDurability() {
        return org.tudalgo.algoutils.student.Student.crash(); // TODO: H5.3 - remove if implemented
    }

    @Override
    @StudentImplementationRequired("H5.1")
    public void setDurability(double durability) {
        org.tudalgo.algoutils.student.Student.crash(); // TODO: H5.3 - remove if implemented
    }

    @Override
    @StudentImplementationRequired("H5.1")
    public void reduceDurability(double amount) {
        org.tudalgo.algoutils.student.Student.crash(); // TODO: H5.3 - remove if implemented
    }
}
