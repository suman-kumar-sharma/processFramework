package com.scoreme.processframework.core;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Context.
 */
public class Context {

    private Map<String,Object> data;

    /**
     * Instantiates a new Context.
     */
    public Context(){
        this.data= new HashMap<>();
    }

    /**
     * Set.
     *
     * @param <T>   the type parameter
     * @param key   the key
     * @param value the value
     */
    public <T> void set(String key,T value){
        data.put(key,value);
    }

    /**
     * Get t.
     *
     * @param <T>  the type parameter
     * @param key  the key
     * @param type the type
     * @return the t
     */
    public <T> T get(String key,Class<T> type){
        return type.cast(data.get(key));
    }

}
