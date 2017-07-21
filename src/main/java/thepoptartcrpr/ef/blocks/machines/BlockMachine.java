package thepoptartcrpr.ef.blocks.machines;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import thepoptartcrpr.ef.Variables;

public abstract class BlockMachine extends BlockContainer implements ITileEntityProvider {
	
	public BlockMachine(String unlocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Variables.MODID, unlocalizedName));
		this.setHardness(3);
		this.setResistance(20);
		this.setDefaultState(this.blockState.getBaseState());
		this.isBlockContainer = true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return null;
	}
	
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return null;
	}

}
