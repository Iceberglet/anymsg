package com.github.iceberglet.anymsg.defs;

import com.github.iceberglet.anymsg.codec.LongCodec;

public class LongDef extends FieldDef<Long> {

    public LongDef(String name, int fieldTag, boolean isOptional) {
        super(name, fieldTag, isOptional, new LongCodec());
    }

}
