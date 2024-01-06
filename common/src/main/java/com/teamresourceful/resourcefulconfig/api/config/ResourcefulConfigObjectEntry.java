package com.teamresourceful.resourcefulconfig.api.config;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;

public interface ResourcefulConfigObjectEntry extends ResourcefulConfigEntry {

    @NotNull
    LinkedHashMap<String, ResourcefulConfigEntry> entries();

}
