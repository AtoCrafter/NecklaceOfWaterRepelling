package ato.necklaceofwaterrepelling.item

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.Entity
import net.minecraft.item.{Item, ItemStack}
import net.minecraft.world.World

class ItemNecklaceOfWaterRepelling extends Item {
  setUnlocalizedName("NecklaceOfWaterRepelling")
  setCreativeTab(CreativeTabs.tabCombat)

  override def onUpdate(itemstack: ItemStack, world: World, entity: Entity, p_77663_4_ : Int, p_77663_5_ : Boolean): Unit = {
  }

}
