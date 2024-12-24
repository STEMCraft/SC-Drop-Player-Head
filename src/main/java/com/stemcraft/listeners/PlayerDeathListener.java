package com.stemcraft.listeners;

import com.stemcraft.PlayerHeads;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerDeathListener implements Listener {
    private PlayerHeads plugin;

    public PlayerDeathListener(PlayerHeads instance) {
        plugin = instance;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Player killer = player.getKiller();

        if (killer != null) {
            if (killer.getUniqueId().equals(player.getUniqueId())) {
                return;
            }

            if (killer.getGameMode() != GameMode.SURVIVAL) {
                return;
            }

            if (player.getGameMode() == GameMode.SURVIVAL) {
                ItemStack playerHead = plugin.getPlayerHead(player);
                event.getDrops().add(playerHead);
            }
        }
    }
}
