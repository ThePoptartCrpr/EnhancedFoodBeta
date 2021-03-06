package thepoptartcrpr.ef.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import thepoptartcrpr.ef.Variables;
import thepoptartcrpr.ef.network.PacketHandler;
import thepoptartcrpr.ef.tileentity.TileEntityOven;

public class CommonProxy {
	
	public void preInit() {
		PacketHandler.registerMessages(Variables.MODID);
	}
	
	public void init() {
		
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityOven.class, Variables.MODID + ":oven");
	}
	
	public void registerRenders() {
		
	}

}
