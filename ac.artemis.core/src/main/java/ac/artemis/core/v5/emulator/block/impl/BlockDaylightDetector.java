package ac.artemis.core.v5.emulator.block.impl;

import ac.artemis.anticheat.api.material.NMSMaterial;
import ac.artemis.core.v5.emulator.block.Block;
import ac.artemis.core.v5.emulator.world.ArtemisWorld;
import ac.artemis.core.v5.utils.bounding.BoundingBox;
import ac.artemis.core.v5.utils.bounding.EnumFacing;
import ac.artemis.core.v5.utils.raytrace.NaivePoint;

import java.util.Collections;
import java.util.List;

public class BlockDaylightDetector extends Block {
    public BlockDaylightDetector(final NaivePoint location, final EnumFacing direction) {
        super(NMSMaterial.DAYLIGHT_DETECTOR, location, direction);
    }

    @Override
    public List<BoundingBox> getBoundingBox(final ArtemisWorld world) {
        return Collections.singletonList(getFromPoint(location, 0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F));
    }
}
