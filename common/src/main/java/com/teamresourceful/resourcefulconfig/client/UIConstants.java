package com.teamresourceful.resourcefulconfig.client;

import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;

public class UIConstants {

    public static final int BACKGROUND = 0xFF131517;
    public static final int TEXT_TITLE = 0xFFFAF9F6;
    public static final int TEXT_PARAGRAPH = 0xFF727478;

    public static final int PAGE_PADDING = 10;
    public static final int SPACING = 4;

    public static final Component BACK = CommonComponents.GUI_BACK;
    public static final Component CLOSE = Component.literal("Close");
    public static final Component RESET = Component.literal("Reset");
    public static final Component EDIT = Component.literal("Edit");
    public static final Component EDIT_STRING = Component.literal("Edit String");
    public static final Component EDIT_LIST = Component.literal("Edit List");
    public static final Component CHOOSE_ITEM = Component.literal("Choose Item: ");
    public static final Component ADD_ITEM = Component.literal("Add Item");
    public static final Component EDIT_OBJECT = Component.literal("Edit Object");
    public static final Component MOD_CONFIGS = Component.literal("Mod Configs").withColor(UIConstants.TEXT_TITLE);
    public static final Component MOD_CONFIGS_DESCRIPTION = Component.literal("Select a config to view or edit.").withColor(UIConstants.TEXT_PARAGRAPH);
}
