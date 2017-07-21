package thepoptartcrpr.ef.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import thepoptartcrpr.ef.Variables;
import thepoptartcrpr.ef.tileentity.TileEntityOven;

public class CommonProxy {
	
	public void registerRenders() {
		
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityOven.class, Variables.MODID + ":oven");
	}

}
