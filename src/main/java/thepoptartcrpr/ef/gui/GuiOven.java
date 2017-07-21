package thepoptartcrpr.ef.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import thepoptartcrpr.ef.Variables;
import thepoptartcrpr.ef.container.ContainerOven;
import thepoptartcrpr.ef.tileentity.TileEntityOven;

public class GuiOven extends GuiContainer {
	
	public static final ResourceLocation TEXTURE = new ResourceLocation(Variables.MODID, "textures/gui/container/oven.png");
	
	private TileEntityOven te;
	private IInventory playerInv;
	
	public GuiOven(IInventory playerInv, TileEntityOven te) {
		super(new ContainerOven(playerInv, te));
		
		this.xSize = 176;
		this.ySize = 166;
		
		this.te = te;
		this.playerInv = playerInv;
	}
	
	@Override
	public void initGui() {
		super.initGui();
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(new ResourceLocation(Variables.MODID, "textures/gui/container/oven.png"));
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String string = I18n.format("container.oven");
		this.mc.fontRendererObj.drawString(string, this.xSize / 2 - this.mc.fontRendererObj.getStringWidth(string) / 2, 6, 4210752);
		this.mc.fontRendererObj.drawString(this.playerInv.getDisplayName().getFormattedText(), 8, 73, 4210752);
	}

}
