package com.hivemc.chunker.conversion.encoding.java.v1_11.reader;

import com.hivemc.chunker.conversion.encoding.base.Converter;
import com.hivemc.chunker.conversion.encoding.java.base.reader.JavaChunkReader;
import com.hivemc.chunker.conversion.encoding.java.base.reader.JavaColumnReader;
import com.hivemc.chunker.conversion.encoding.java.base.resolver.JavaResolvers;
import com.hivemc.chunker.conversion.intermediate.column.ChunkerColumn;
import com.hivemc.chunker.conversion.intermediate.column.chunk.ChunkCoordPair;
import com.hivemc.chunker.conversion.intermediate.column.chunk.ChunkerChunk;
import com.hivemc.chunker.conversion.intermediate.world.Dimension;
import com.hivemc.chunker.nbt.tags.collection.CompoundTag;

public class ColumnReader extends JavaColumnReader {
    public ColumnReader(Converter converter, JavaResolvers resolvers, Dimension dimension, ChunkCoordPair columnCoords, CompoundTag columnNBT) {
        super(converter, resolvers, dimension, columnCoords, columnNBT);
    }

    @Override
    public JavaChunkReader createChunkReader(ChunkerColumn column, ChunkerChunk chunk) {
        return new ChunkReader(converter, resolvers, column, chunk);
    }
}
