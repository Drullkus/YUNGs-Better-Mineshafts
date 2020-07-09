package com.yungnickyoung.minecraft.bettermineshafts.util;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ColumnPos;
import net.minecraft.world.chunk.IChunk;

public class SurfaceUtil {
    public static int getSurfaceHeight(IChunk chunkIn, ColumnPos pos) {
        BlockPos.Mutable blockPos = new BlockPos.Mutable(pos.x, 255, pos.z);

        // Edge case: blocks go all the way up to build height
        BlockPos topPos = new BlockPos(pos.x, 255, pos.z);
        if (chunkIn.getBlockState(topPos) != Blocks.AIR.getDefaultState())
            return 255;

        for (int y = 255; y >= 0; y--) {
            BlockState blockState = chunkIn.getBlockState(blockPos);
            if (blockState != Blocks.AIR.getDefaultState())
                return y;
            blockPos.move(Direction.DOWN);
        }

        return 1; // Surface somehow not found
    }
}
