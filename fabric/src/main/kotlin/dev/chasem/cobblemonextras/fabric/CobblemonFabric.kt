package dev.chasem.cobblemonextras.fabric

import com.cobblemon.mod.common.api.permission.CobblemonPermission
import com.cobblemon.mod.common.api.permission.CobblemonPermissions
import dev.chasem.cobblemonextras.CobblemonExtras
import dev.chasem.cobblemonextras.init.BlockInit
import dev.chasem.cobblemonextras.init.ItemInit
import net.fabricmc.api.ModInitializer

class CobblemonFabric : ModInitializer {
    override fun onInitialize() {
        System.out.println("Fabric Mod init")
        CobblemonExtras.initialize();



    }
}