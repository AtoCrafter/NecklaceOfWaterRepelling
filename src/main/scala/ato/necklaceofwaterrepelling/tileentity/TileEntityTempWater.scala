package ato.necklaceofwaterrepelling.tileentity

import net.minecraft.init.Blocks
import net.minecraft.tileentity.TileEntity

class TileEntityTempWater extends TileEntity {

  var life = 20

  override def updateEntity(): Unit = {
    life -= 1
    if (life <= 0) {
      getWorldObj.setBlock(xCoord, yCoord, zCoord, Blocks.water)
      getWorldObj.notifyBlockOfNeighborChange(xCoord, yCoord, zCoord, Blocks.water)
    }
  }
}
