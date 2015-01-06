package ato.necklaceofwaterrepelling

import ato.necklaceofwaterrepelling.block.BlockTempWater
import ato.necklaceofwaterrepelling.item.ItemNecklaceOfWaterRepelling
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.registry.GameRegistry

@Mod(modid = "NecklaceOfWaterRepelling", modLanguage = "scala")
object NecklaceOfWaterRepelling {

  val blockTemp = new BlockTempWater()
  val itemNecklace = new ItemNecklaceOfWaterRepelling()

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    GameRegistry.registerBlock(blockTemp, "TempWater")
    GameRegistry.registerItem(itemNecklace, "NecklaceOfWaterRepelling")
  }
}
