
package com.klodskateam.ktmod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import com.klodskateam.ktmod.init.KtmodModFluids;

public class FuelBlock extends LiquidBlock {
	public FuelBlock() {
		super(() -> (FlowingFluid) KtmodModFluids.FUEL.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
