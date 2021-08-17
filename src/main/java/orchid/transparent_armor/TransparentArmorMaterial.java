package orchid.transparent_armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class TransparentArmorMaterial implements ArmorMaterial {
	private final static int[] durability = new int[]{10, 10, 10, 10};
	private final static int[] protection = new int[]{0, 0, 0, 0};

	@Override
	public int getDurability(EquipmentSlot slot){ return durability[slot.getEntitySlotId()]; }

	@Override
	public Ingredient getRepairIngredient(){ return Ingredient.ofItems(Items.GLASS); }

	@Override
	public int getProtectionAmount(EquipmentSlot slot){ return protection[slot.getEntitySlotId()]; }

	@Override
	public String getName(){ return "transparent"; }

	@Override
	public int getEnchantability(){ return 0; }

	@Override
	public SoundEvent getEquipSound(){ return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND; }

	@Override
	public float getToughness(){ return 0; }

	@Override
	public float getKnockbackResistance(){ return 0; }
}
