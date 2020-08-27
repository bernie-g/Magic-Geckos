package com.github.peculiarsana.magicgeckos.init;

import com.github.peculiarsana.magicgeckos.MagicGeckos;
import com.github.peculiarsana.magicgeckos.MagicGeckos.MagicGeckosItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MagicGeckos.MODID);

    public static final RegistryObject<Item> DEF_ITEM = ITEMS.register("def_item",
            () -> new Item(new Item.Properties().group(MagicGeckosItemGroup.instance)));
}
