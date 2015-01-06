package ato.necklaceofwaterrepelling.block

import ato.necklaceofwaterrepelling.tileentity.TileEntityTempWater
import net.minecraft.block.material.Material
import net.minecraft.block.{Block, ITileEntityProvider}
import net.minecraft.tileentity.TileEntity
import net.minecraft.world.World

class BlockTempWater extends Block(Material.glass) with ITileEntityProvider {

  setBlockName("TempWater")
  setBlockBounds(0, 0, 0, 0, 0, 0)

  override def createNewTileEntity(world: World, meta: Int): TileEntity =
    new TileEntityTempWater()
}
