package fr.milekat.cite_box.obj;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class Crate {
    private final int id;
    private final String name;
    private final String description;
    private final float totalLuck;
    private final HashMap<ItemStack, Float> itemsLucks;
    private final int minItems;
    private final int maxItems;
    private final Material displayItem;
    private final int displaySlot;

    public Crate(int id, String name, String description, float totalLuck, HashMap<ItemStack, Float> itemsLucks, int minItems, int maxItems, Material displayItem, int displaySlot) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.totalLuck = totalLuck;
        this.itemsLucks = itemsLucks;
        this.minItems = minItems;
        this.maxItems = maxItems;
        this.displayItem = displayItem;
        this.displaySlot = displaySlot;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getTotalLuck() {
        return totalLuck;
    }

    public HashMap<ItemStack, Float> getItemsLucks() {
        return itemsLucks;
    }

    public int getMinItems() {
        return minItems;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public Material getDisplayItem() {
        return displayItem;
    }

    public int getDisplaySlot() {
        return displaySlot;
    }
}