package com.archaether.battlechipserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = 
        LoggerFactory.getLogger(LoadDatabase.class);
        String[] a = {"A", "B", "C", "*"};
        String[] b = {"L", "M", "N", "*"};

    @Bean
    CommandLineRunner initDatabase(BattleChipRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new BattleChip("Cannon",
                "Cannon attack to 1 enemy", "Null", "Standard", 40, 
                a, 6, 
                "../assets/Images/BattleChips/Cannon.png")));
                log.info("Preloading" + repository.save(new BattleChip(
                    "HiCannon", "Cannon attack to 1 enemy", "Null",
                    "Standard", 100, b, 24,
                    "../assets/Images/Battlechips/HiCannon.png"
                )));
        };
    }
}
