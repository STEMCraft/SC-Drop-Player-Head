<p align="center"><img src="https://github.com/STEMMechanics/.github/blob/main/stemcraft-sky-logo.jpg?raw=true" width="666" height="198" alt="STEMMechanics"></p>

# STEMCraft Player Heads

This plugin enables support for other plugins to create player heads as well as adds the feature of a players head being dropped in the world when both players are in the survival game mode.

## Methods

### getPlayerHead
Returns an `ItemStack` containing the head of the player requested, or null if it could not be created.

#### Arguments
player: The player to create a player head of in an ItemStack. Can be a `Player` object or `String` playerName.

#### Examples

```java
PlayerHeads playerHeadsPlugin = Bukkit.getServer().getPluginManager().getPlugin("SC-Player-Heads");
Player nomadjimbob = Bukkit.getServer().getPlayer("nomadjimbob");
ItemStack playerHead = playerHeadsPlugin.getPlayerHead(nomadjimbob);

-----

PlayerHeads playerHeadsPlugin = Bukkit.getServer().getPluginManager().getPlugin("SC-Player-Heads");
ItemStack playerHead = playerHeadsPlugin.getPlayerHead("nomadjimbob");
```

## Changes

### 1.0

-    Initial release

## Get in touch!

Learn more about what we're doing at [stemmechanics.com.au](https://stemmechanics.com.au).

👋 [@STEMMechanics](https://twitter.com/STEMMechanics)
