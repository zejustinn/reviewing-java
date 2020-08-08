package com.fundamentals;

public class PrimitivesWrapper {
    // byte = 1 byte
    public Byte getByteWrapper(byte primitiveByte){
        Byte wrapper = primitiveByte;
        return wrapper;
    }

    // short = 2 bytes
    public Short getShortWrapper(short primitiveShort){
        Short wrapper = primitiveShort;
        return wrapper;
    }

    // int = 4 bytes
    public Integer getIntWrapper(int primitiveInt){
        Integer wrapper = primitiveInt;
        return wrapper;
    }

    // long = 8 bytes
    public Long getLongWrapper(long primitiveLong){
        Long wrapper = primitiveLong;
        return wrapper;
    }

    // float = 4 bytes - 6 to 7 decimal digits
    public Float getFloatWrapper(float primitiveFloat){
        Float wrapper = primitiveFloat;
        return wrapper;
    }

    // double = 8 bytes - 15 decimal digits
    public Double getDoubleWrapper(double primitiveDouble){
        Double wrapper = primitiveDouble;
        return wrapper;
    }

    // boolean = 1 bit
    public Boolean getBooleanWrapper(boolean primitiveBoolean){
        Boolean wrapper = primitiveBoolean;
        return wrapper;
    }

    // char = 2 bytes
    public Character getCharWrapper(char primitiveCharacter){
        Character wrapper = primitiveCharacter;
        return wrapper;
    }
}
