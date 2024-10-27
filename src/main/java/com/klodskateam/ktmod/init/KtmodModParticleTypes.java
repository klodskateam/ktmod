
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.klodskateam.ktmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import com.klodskateam.ktmod.KtmodMod;

public class KtmodModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, KtmodMod.MODID);
	public static final RegistryObject<ParticleType<?>> RADIATION = REGISTRY.register("radiation", () -> new SimpleParticleType(false));
}
