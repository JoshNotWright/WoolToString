package me.joshwright.wooltostring;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class WoolToString extends JavaPlugin {

    @Override
    public void onEnable() {
        // This is going to be the result of our new recipe. We're creating a new
        // ItemStack with 4 strings
        ItemStack string = new ItemStack(Material.STRING);
        string.setAmount(4);

        ShapelessRecipe woolString = new ShapelessRecipe(NamespacedKey.minecraft("stringfromwool"), string);

        woolString.addIngredient(1, Material.WHITE_WOOL);

        Bukkit.addRecipe(woolString);
    }
}
