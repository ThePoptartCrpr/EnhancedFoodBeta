package thepoptartcrpr.ef.proxy;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import thepoptartcrpr.ef.EnhancedFood;
import thepoptartcrpr.ef.gui.GuiHandler;
import thepoptartcrpr.ef.init.EFBlocks;
import thepoptartcrpr.ef.init.EFItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit() {
		super.preInit();
	}
	
	@Override
	public void init() {
		super.init();
	}
	
	@Override
	public void registerRenders() {
		EFItems.registerRenders();
		EFBlocks.registerRenders();
	}

}
