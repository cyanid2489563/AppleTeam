package com.ayrou.team.GUI;

import com.ayrou.team.GUI.Item.Enums.ButtonType;
import com.ayrou.team.GUI.Item.Type.Button;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import fr.minuskube.inv.content.Pagination;
import org.bukkit.entity.Player;

public class MenuView implements InventoryProvider {

    public static SmartInventory getInventory(Player player) {
        return SmartInventory.builder()
                .id(player.getName())
                .provider(new MenuView())
                .size(6, 9)
                .title("隊伍列表")
                .build();
    }

    @Override
    public void init(Player player, InventoryContents contents) {

        Pagination pagination = contents.pagination();

        ClickableItem[] items = new ClickableItem[36];

        Button button = new Button();

        items[0] = ClickableItem.of(button.createItemStack(ButtonType.All),
            e -> {
                if (e.isRightClick()) {

                }
                if (e.isLeftClick()) {

                }
        });

        contents.set(0, 5, ClickableItem.empty(new Button().createItemStack(ButtonType.GUI_BACKGROUND_UP)));
        contents.set(7, 5, ClickableItem.empty(new Button().createItemStack(ButtonType.GUI_BACKGROUND_DOWN)));
    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }
}