package com.teamresourceful.resourcefulconfig.client.screens.base;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;

public abstract class OverlayScreen extends Screen {

    private final Screen background;

    protected OverlayScreen(Screen background) {
        super(CommonComponents.EMPTY);
        this.background = background;
    }

    @Override
    public void added() {
        super.added();
        this.background.clearFocus();
    }

    @Override
    protected void repositionElements() {
        this.background.resize(Minecraft.getInstance(), this.width, this.height);
    }

    @Override
    public void renderBackground(GuiGraphics guiGraphics, int i, int j, float f) {
        this.background.render(guiGraphics, -1, -1, f);
        guiGraphics.flush();
        RenderSystem.clear(256, Minecraft.ON_OSX);
    }

    @Override
    public void onClose() {
        Minecraft.getInstance().setScreen(this.background);
    }
}
