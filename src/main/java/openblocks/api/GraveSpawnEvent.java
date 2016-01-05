package openblocks.api;

import java.util.List;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.Cancelable;

@Cancelable
public class GraveSpawnEvent extends PlayerEvent {

	public List<EntityItem> loot;

	public IChatComponent clickText;

	public String gravestoneText;

	public BlockPos location;

	public GraveSpawnEvent(EntityPlayer player, BlockPos pos, List<EntityItem> loot, String gravestoneText, IChatComponent clickText) {
		super(player);
		this.loot = loot;
		this.gravestoneText = gravestoneText;
		this.clickText = clickText;
		this.location = pos;
	}
}
