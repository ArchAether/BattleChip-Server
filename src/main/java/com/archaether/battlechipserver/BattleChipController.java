package com.archaether.battlechipserver;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
class BattleChipController {

    private final BattleChipRepository repo;

    BattleChipController(BattleChipRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/BattleChips")
    List<BattleChip> all() {
        return repo.findAll();
    }

    @PostMapping("/BattleChips")
    BattleChip newBattleChip(@RequestBody BattleChip newBattleChip) {
        return repo.save(newBattleChip);
    }

    @GetMapping("/BattleChips/{id}")
    BattleChip one(@PathVariable Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new
            BattleChipNotFoundException(id));
    }
    @PutMapping("/BattleChips/{id}")
    BattleChip replaceBattleChip(@RequestBody BattleChip
    newBattleChip, @PathVariable Long id) {
        return repo.findById(id)
            .map(battlechip -> {
                battlechip.setName(newBattleChip.getName());
                battlechip.setDescription(newBattleChip.getDescription());
                battlechip.setElement(newBattleChip.getElement());
                battlechip.setChipClass(newBattleChip.getChipClass());
                battlechip.setDamage(newBattleChip.getDamage());
                battlechip.setChipCoide(newBattleChip.getChipCode());
                battlechip.setMegabytes(newBattleChip.getMegabytes());
                battlechip.setImage(newBattleChip.getImage());
                return repo.save(newBattleChip);
            })
            .orElseGet(() -> {
                newBattleChip.setId(id);
                return repo.save(newBattleChip);
            });
    }
    @DeleteMapping("/BattleChips/{id}")
    void deleteBattleChip(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
