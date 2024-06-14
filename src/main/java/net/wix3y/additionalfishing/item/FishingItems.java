package net.wix3y.additionalfishing.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.EntityBucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.wix3y.additionalfishing.AdditionalFishing;
import net.wix3y.additionalfishing.entity.FishEntities;

public class FishingItems {
    public static final Item ANGLERFISH = registerItem("anglerfish", new Item(new FabricItemSettings().food(FishingFoodComponents.ANGLERFISH)));
    public static final Item ARCTIC_CHAR = registerItem("arctic_char", new Item(new FabricItemSettings().food(FishingFoodComponents.ARCTIC_CHAR)));
    public static final Item BASS = registerItem("bass", new Item(new FabricItemSettings().food(FishingFoodComponents.BASS)));
    public static final Item CATFISH = registerItem("catfish", new Item(new FabricItemSettings().food(FishingFoodComponents.CATFISH)));
    public static final Item CLAM = registerItem("clam", new Item(new FabricItemSettings().food(FishingFoodComponents.CLAM)));
    public static final Item RAW_CRAB_CLAW = registerItem("raw_crab_claw", new Item(new FabricItemSettings().food(FishingFoodComponents.RAW_CRAB_CLAW)));
    public static final Item FLOUNDER = registerItem("flounder", new Item(new FabricItemSettings().food(FishingFoodComponents.FLOUNDER)));
    public static final Item GOLDFISH = registerItem("goldfish", new Item(new FabricItemSettings().food(FishingFoodComponents.GOLDFISH)));
    public static final Item HERRING = registerItem("herring", new Item(new FabricItemSettings().food(FishingFoodComponents.HERRING)));
    public static final Item KOI = registerItem("koi", new Item(new FabricItemSettings().food(FishingFoodComponents.KOI)));
    public static final Item PIRANHA = registerItem("piranha", new Item(new FabricItemSettings().food(FishingFoodComponents.PIRANHA)));
    public static final Item RAINBOWFISH = registerItem("rainbowfish", new Item(new FabricItemSettings().food(FishingFoodComponents.RAINBOWFISH)));
    public static final Item RAW_SHRIMP = registerItem("raw_shrimp", new Item(new FabricItemSettings().food(FishingFoodComponents.RAW_SHRIMP)));
    public static final Item STARFISH = registerItem("starfish", new Item(new FabricItemSettings().food(FishingFoodComponents.STARFISH)));
    public static final Item TUNA = registerItem("tuna", new Item(new FabricItemSettings().food(FishingFoodComponents.TUNA)));

    public static final Item PIRANHA_BUCKET = registerItem("piranha_bucket", new EntityBucketItem(FishEntities.PIRANHA, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new FabricItemSettings().maxCount(1)));
    public static final Item SHRIMP_BUCKET = registerItem("shrimp_bucket", new EntityBucketItem(FishEntities.SHRIMP, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new FabricItemSettings().maxCount(1)));

    public static final Item PIRANHA_SPAWN_EGG = registerItem("piranha_spawn_egg", new SpawnEggItem(FishEntities.PIRANHA, 0x779977, 0xbb5577, new FabricItemSettings()));
    public static final Item SHRIMP_SPAWN_EGG = registerItem("shrimp_spawn_egg", new SpawnEggItem(FishEntities.SHRIMP, 0xee8877, 0xffccbb, new FabricItemSettings()));
    public static final Item CRAB_SPAWN_EGG = registerItem("crab_spawn_egg", new SpawnEggItem(FishEntities.CRAB, 0xee8844, 0xffddbb, new FabricItemSettings()));

    public static final Item COOKED_PIRANHA = registerItem("cooked_piranha", new Item(new FabricItemSettings().food(FishingFoodComponents.COOKED_PIRANHA)));
    public static final Item COOKED_FLOUNDER = registerItem("cooked_flounder", new Item(new FabricItemSettings().food(FishingFoodComponents.COOKED_FLOUNDER)));
    public static final Item COOKED_BASS = registerItem("cooked_bass", new Item(new FabricItemSettings().food(FishingFoodComponents.COOKED_BASS)));
    public static final Item COOKED_HERRING = registerItem("cooked_herring", new Item(new FabricItemSettings().food(FishingFoodComponents.COOKED_HERRING)));
    public static final Item COOKED_TUNA = registerItem("cooked_tuna", new Item(new FabricItemSettings().food(FishingFoodComponents.COOKED_TUNA)));
    public static final Item COOKED_CATFISH = registerItem("cooked_catfish", new Item(new FabricItemSettings().food(FishingFoodComponents.COOKED_CATFISH)));
    public static final Item COOKED_ARCTIC_CHAR = registerItem("cooked_arctic_char", new Item(new FabricItemSettings().food(FishingFoodComponents.COOKED_ARCTIC_CHAR)));
    public static final Item CRAB_CLAW = registerItem("crab_claw", new Item(new FabricItemSettings().food(FishingFoodComponents.CRAB_CLAW)));
    public static final Item GOLDFISH_CRACKER = registerItem("goldfish_cracker", new Item(new FabricItemSettings().food(FishingFoodComponents.GOLDFISH_CRACKER)));
    public static final Item SHRIMP = registerItem("shrimp", new Item(new FabricItemSettings().food(FishingFoodComponents.SHRIMP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdditionalFishing.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AdditionalFishing.LOGGER.info("Register mod items for " + AdditionalFishing.MOD_ID);
    }
}
