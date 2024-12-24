package com.stemcraft;

import com.stemcraft.common.STEMCraftPlugin;
import com.stemcraft.listeners.PlayerDeathListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.jetbrains.annotations.NotNull;

public class PlayerHeads extends STEMCraftPlugin {
    private static PlayerHeads instance;

    @Override
    public void onEnable() {
        super.onEnable();

        instance = this;
        registerEvents(new PlayerDeathListener(instance));
    }

    public PlayerHeads getInstance() {
        return instance;
    }

    /**
     * Create a players head item stack based on a player.
     *
     * @param player The player to base the head on.
     * @return The item stack containing the players head.
     */
    public ItemStack getPlayerHead(Player player) {
        if(player == null) {
            return null;
        }

        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta skullMeta = (SkullMeta) playerHead.getItemMeta();
        skullMeta.setOwningPlayer(player);
        playerHead.setItemMeta(skullMeta);

        return playerHead;
    }

    public ItemStack getPlayerHead(String playerName) {
        Player player = getServer().getPlayer(playerName);
        if(player != null) {
            return getPlayerHead(player);
        }

        return null;
    }
}
