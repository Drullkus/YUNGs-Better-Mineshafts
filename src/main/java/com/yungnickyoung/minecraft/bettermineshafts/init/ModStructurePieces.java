package com.yungnickyoung.minecraft.bettermineshafts.init;

import com.yungnickyoung.minecraft.bettermineshafts.config.BMSettings;
import com.yungnickyoung.minecraft.bettermineshafts.world.generator.BetterMineshaftStructurePieceType;
import com.yungnickyoung.minecraft.bettermineshafts.world.generator.pieces.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public class ModStructurePieces {
    public static void init() {
        BetterMineshaftStructurePieceType.VERTICAL_ENTRANCE = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSVerticalEntrance".toLowerCase(Locale.ROOT)), VerticalEntrance::new);
        BetterMineshaftStructurePieceType.BIG_TUNNEL = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSBigTunnel".toLowerCase(Locale.ROOT)), BigTunnel::new);
        BetterMineshaftStructurePieceType.SMALL_TUNNEL = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSSmallTunnel".toLowerCase(Locale.ROOT)), SmallTunnel::new);
        BetterMineshaftStructurePieceType.SMALL_TUNNEL_TURN = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSSmallTunnelTurn".toLowerCase(Locale.ROOT)), SmallTunnelTurn::new);
        BetterMineshaftStructurePieceType.SMALL_TUNNEL_STAIRS = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSSmallTunnelStairs".toLowerCase(Locale.ROOT)), SmallTunnelStairs::new);
        BetterMineshaftStructurePieceType.SIDE_ROOM = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSSideRoom".toLowerCase(Locale.ROOT)), SideRoom::new);
        BetterMineshaftStructurePieceType.SIDE_ROOM_DUNGEON = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSSideRoomDungeon".toLowerCase(Locale.ROOT)), SideRoomDungeon::new);
        BetterMineshaftStructurePieceType.ORE_DEPOSIT = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSOreDeposit".toLowerCase(Locale.ROOT)), OreDeposit::new);
        BetterMineshaftStructurePieceType.LAYERED_INTERSECTION_4 = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSLayeredIntersection4".toLowerCase(Locale.ROOT)), LayeredIntersection4::new);
        BetterMineshaftStructurePieceType.LAYERED_INTERSECTION_5 = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSLayeredIntersection5".toLowerCase(Locale.ROOT)), LayeredIntersection5::new);
        BetterMineshaftStructurePieceType.ZOMBIE_VILLAGER_ROOM = Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(BMSettings.MOD_ID, "BMSZombieVillagerRoom".toLowerCase(Locale.ROOT)), ZombieVillagerRoom::new);
    }
}
