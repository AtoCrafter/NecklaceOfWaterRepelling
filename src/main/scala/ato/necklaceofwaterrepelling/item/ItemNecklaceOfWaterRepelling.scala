package ato.necklaceofwaterrepelling.item

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.Entity
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.init.Blocks
import net.minecraft.item.{Item, ItemStack}
import net.minecraft.world.World

import scala.math._

class ItemNecklaceOfWaterRepelling extends Item {
  setHasSubtypes(true)
  setUnlocalizedName("NecklaceOfWaterRepelling")
  setTextureName("nether_star")
  setCreativeTab(CreativeTabs.tabCombat)

  override def onUpdate(itemstack: ItemStack, world: World, entity: Entity, p_77663_4_ : Int, p_77663_5_ : Boolean): Unit =
    if (isActive(itemstack)) {
      val (x, y, z) = (floor(entity.posX).toInt, floor(entity.posY).toInt, floor(entity.posZ).toInt)
      val d = 5
      for (dx <- x - d to x + d; dy <- y - d to y + d; dz <- z - d to z + d
           if (dx - x) * (dx - x) + (dy - y) * (dy - y) + (dz - z) * (dz - z) < d * d) {
        world.getBlock(dx, dy, dz) match {
          case Blocks.flowing_water => world.setBlockToAir(dx, dy, dz)
          case Blocks.water => world.setBlockToAir(dx, dy, dz)
          case _ =>
        }
      }
    }

  override def hasEffect(itemstack: ItemStack, pass: Int): Boolean = isActive(itemstack)

  override def onItemRightClick(itemstack: ItemStack, world: World, player: EntityPlayer): ItemStack = {
    itemstack.setItemDamage(1 - itemstack.getItemDamage)
    itemstack
  }

  def isActive(itemstack: ItemStack): Boolean = itemstack.getItemDamage == 1
}
