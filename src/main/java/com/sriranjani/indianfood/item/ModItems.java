package com.sriranjani.indianfood.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import com.sriranjani.indianfood.IndianFood;

public class ModItems {

    // Base poison component to allow always edible behavior
    public static final FoodComponent POISON_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .build();

    // 🍛 Paneer: Strength + Resistance
    public static final ConsumableComponent PANEER_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60 * 20, 1), 1.0f))
            .build();

    // 🍬 Gulabjamun: Speed + Regeneration
    public static final ConsumableComponent GULABJAMUN_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 30 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 30 * 20, 1), 1.0f))
            .build();

    public static final ConsumableComponent SAMOSA_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 50 * 20, 0), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 50 * 20, 1), 1.0f))
            .build();

    // 🥤 Lassi: Fire Resistance + Slow Falling
    public static final ConsumableComponent LASSI_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 45 * 20, 0), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 20 * 20, 0), 1.0f))
            .build();


    // 🥞 Dosa: Jump Boost + Speed
    public static final ConsumableComponent DOSA_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 45 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 45 * 20, 1), 1.0f))
            .build();

    // 🍞 Roti: Resistance + Saturation
    public static final ConsumableComponent ROTI_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 30 * 20, 0), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION, 10 * 20, 1), 1.0f))
            .build();

    // 🍘 Idli: Regeneration + Night Vision
    public static final ConsumableComponent IDLI_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 60 * 20, 0), 1.0f))
            .build();

    // 🔧 Registration helper
    public static Item register(Item item, RegistryKey<Item> registryKey) {
        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
    }

    // 🪪 Registry keys and items
    public static final RegistryKey<Item> PANEER_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IndianFood.MOD_ID, "paneer"));
    public static final Item PANEER = register(new Item(new Item.Settings().registryKey(PANEER_KEY).food(POISON_FOOD_COMPONENT, PANEER_COMPONENT)), PANEER_KEY);

    public static final RegistryKey<Item> GULABJAMUN_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IndianFood.MOD_ID, "gulabjamun"));
    public static final Item GULABJAMUN = register(new Item(new Item.Settings().registryKey(GULABJAMUN_KEY).food(POISON_FOOD_COMPONENT, GULABJAMUN_COMPONENT)), GULABJAMUN_KEY);

    public static final RegistryKey<Item> SAMOSA_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IndianFood.MOD_ID, "samosa"));
    public static final Item SAMOSA = register(new Item(new Item.Settings().registryKey(SAMOSA_KEY).food(POISON_FOOD_COMPONENT, SAMOSA_COMPONENT)), SAMOSA_KEY);

    public static final RegistryKey<Item> LASSI_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IndianFood.MOD_ID, "lassi"));
    public static final Item LASSI = register(new Item(new Item.Settings().registryKey(LASSI_KEY).food(POISON_FOOD_COMPONENT, LASSI_COMPONENT)), LASSI_KEY);

    public static final RegistryKey<Item> DOSA_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IndianFood.MOD_ID, "dosa"));
    public static final Item DOSA = register(new Item(new Item.Settings().registryKey(DOSA_KEY).food(POISON_FOOD_COMPONENT, DOSA_COMPONENT)), DOSA_KEY);

    public static final RegistryKey<Item> ROTI_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IndianFood.MOD_ID, "roti"));
    public static final Item ROTI = register(new Item(new Item.Settings().registryKey(ROTI_KEY).food(POISON_FOOD_COMPONENT, ROTI_COMPONENT)), ROTI_KEY);

    public static final RegistryKey<Item> IDLI_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IndianFood.MOD_ID, "idli"));
    public static final Item IDLI = register(new Item(new Item.Settings().registryKey(IDLI_KEY).food(POISON_FOOD_COMPONENT, IDLI_COMPONENT)), IDLI_KEY);


    // 🍴 Add all items to item group
    public static void registerModItems() {
        IndianFood.LOGGER.info("Registering Mod Items for " + IndianFood.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(PANEER);
            entries.add(GULABJAMUN);
            entries.add(LASSI);
            entries.add(DOSA);
            entries.add(SAMOSA);
            entries.add(ROTI);
            entries.add(IDLI);

        });
    }
}
