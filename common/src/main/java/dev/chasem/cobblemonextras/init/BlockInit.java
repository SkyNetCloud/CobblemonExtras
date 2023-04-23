package dev.chasem.cobblemonextras.init;



import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.chasem.cobblemonextras.block.TradeMachineBlock;
import net.minecraft.block.Block;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

import static dev.chasem.cobblemonextras.CobblemonExtras.MODID;
import static net.minecraft.util.registry.BuiltinRegistries.REGISTRIES;


public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MODID, Registry.BLOCK_KEY);


    public static final RegistrySupplier<Block> TRADING_BLOCK = BLOCKS.register("trade_block", TradeMachineBlock::new);
}
