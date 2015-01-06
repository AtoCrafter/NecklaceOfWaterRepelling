package ato.necklaceofwaterrepelling

import ato.necklaceofwaterrepelling.item.ItemNecklaceOfWaterRepelling
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.registry.GameRegistry

@Mod(modid = "NecklaceOfWaterRepelling", modLanguage = "scala")
object NecklaceOfWaterRepelling {

  val itemNecklace = new ItemNecklaceOfWaterRepelling()

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    GameRegistry.registerItem(itemNecklace, "NecklaceOfWaterRepelling")
  }
}
