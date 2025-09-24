package de.blue_gamer48.bluesCitybuildPlugin

import org.bukkit.plugin.java.JavaPlugin

class BluesCitybuildPlugin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("""
        ####################################
        Plugin Blues Citybuild Core Starting
        Developer: Blue_Gamer48
        Plugin Version 0.1-Alpha
        ####################################
        """.trimIndent())

    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("""
        ####################################
        Plugin Blues Citybuild Plugin Stopping
        ####################################
        """.trimIndent())
    }
}
