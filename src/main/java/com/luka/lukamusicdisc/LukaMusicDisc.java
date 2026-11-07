package com.luka.lukamusicdisc;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod(LukaMusicDisc.MOD_ID)
public final class LukaMusicDisc {
    public static final String MOD_ID = "lukamusicdisc";

    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, MOD_ID);

    private static final ResourceKey<JukeboxSong> TITANES_SONG =
            ResourceKey.create(Registries.JUKEBOX_SONG,
                    ResourceLocation.fromNamespaceAndPath(MOD_ID, "titanes"));

    public static final RegistryObject<Item> TITANES_DISC = ITEMS.register("titanes",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .jukeboxPlayable(TITANES_SONG)));

    public LukaMusicDisc() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modBus);
    }
}
