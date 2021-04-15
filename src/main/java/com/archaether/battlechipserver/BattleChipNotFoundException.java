package com.archaether.battlechipserver;

class BattleChipNotFoundException extends RuntimeException {
    
    BattleChipNotFoundException(Long id) {
        super("Could not find BattleChip " + id);
    }
}
