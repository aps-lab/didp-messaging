package com.plooh.adssi.didp.messaging.app;

import com.plooh.adssi.store.api.StringStore;
import com.plooh.adssi.store.map.MapStringStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapStoreConfig {
    
    @Bean
    StringStore store(){
        return new MapStringStore();
    }
}