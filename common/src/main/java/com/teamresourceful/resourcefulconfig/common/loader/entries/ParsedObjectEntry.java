package com.teamresourceful.resourcefulconfig.common.loader.entries;

import com.teamresourceful.resourcefulconfig.api.types.entries.ResourcefulConfigEntry;
import com.teamresourceful.resourcefulconfig.api.types.entries.ResourcefulConfigObjectEntry;
import com.teamresourceful.resourcefulconfig.api.types.options.EntryData;
import com.teamresourceful.resourcefulconfig.api.types.options.EntryType;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

public record ParsedObjectEntry(
        EntryType type,
        Field field,
        EntryData options,
        LinkedHashMap<String, ResourcefulConfigEntry> entries
) implements ResourcefulConfigObjectEntry {

    public ParsedObjectEntry(EntryType type, Field field) {
        this(type, field, EntryData.of(field, field.getType()), new LinkedHashMap<>());
    }

    @Override
    public void reset() {
        entries.values().forEach(ResourcefulConfigEntry::reset);
    }
}
