package orchid.transparent_armor;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	private final static String MOD_ID = "transparent-armor";

	public final static TransparentArmorMaterial TRANSPARENT_ARMOR_MATERIAL = new TransparentArmorMaterial();

	public final static ArmorItem TRANSPARENT_HELMET = new ArmorItem(TRANSPARENT_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
	public final static ArmorItem TRANSPARENT_CHESTPLATE = new ArmorItem(TRANSPARENT_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
	public final static ArmorItem TRANSPARENT_LEGGINGS = new ArmorItem(TRANSPARENT_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
	public final static ArmorItem TRANSPARENT_BOOTS = new ArmorItem(TRANSPARENT_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));

	@Override
	public void onInitialize(){
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "helmet"), TRANSPARENT_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chestplate"), TRANSPARENT_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "leggings"), TRANSPARENT_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "boots"), TRANSPARENT_BOOTS);
	}
}
