package lach_01298.qmd.multiblock.container;

import lach_01298.qmd.particleChamber.ParticleChamber;
import lach_01298.qmd.particleChamber.tile.IParticleChamberController;
import nc.multiblock.container.ContainerMultiblockController;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerDecayChamberController extends ContainerMultiblockController<ParticleChamber, IParticleChamberController>
{
	public ContainerDecayChamberController(EntityPlayer player, IParticleChamberController controller)
	{
		super(player, controller);
		
	}
}
