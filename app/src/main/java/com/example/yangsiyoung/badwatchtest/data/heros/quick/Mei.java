package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Mei extends QuickCharacter{

    @SerializedName("quick_enemy_frozen")
    public String quickEnemyFrozen;

    public void setQuickEnemyFrozen(String quickEnemyFrozen) {
        this.quickEnemyFrozen = quickEnemyFrozen;
    }

    public String getQuickEnemyFrozen() {
        return quickEnemyFrozen;
    }

    @SerializedName("quick_best_enemy_frozen_in_game")
    public String quickBestEnemyFrozenIngame;

    public void setQuickBestEnemyFrozenIngame(String quickBestEnemyFrozenIngame) {
        this.quickBestEnemyFrozenIngame = quickBestEnemyFrozenIngame;
    }

    public String getQuickBestEnemyFrozenIngame() {
        return quickBestEnemyFrozenIngame;
    }

    @SerializedName("quick_best_blizzard_kill_in_game")
    public String quickBestBlizzardKillInGame;

    public void setQuickBestBlizzardKillInGame(String quickBestBlizzardKillInGame) {
        this.quickBestBlizzardKillInGame = quickBestBlizzardKillInGame;
    }

    public String getQuickBestBlizzardKillInGame() {
        return quickBestBlizzardKillInGame;
    }

    @SerializedName("quick_blizzard_kill")
    public String quickBlizzardKill;

    public void setQuickBlizzardKill(String quickBlizzardKill) {
        this.quickBlizzardKill = quickBlizzardKill;
    }

    public String getQuickBlizzardKill() {
        return quickBlizzardKill;
    }

    @SerializedName("quick_best_damage_blocked_in_game")
    public String quickBestDamageBlockedInGame;

    public void setQuickBestDamageBlockedInGame(String quickBestDamageBlockedInGame) {
        this.quickBestDamageBlockedInGame = quickBestDamageBlockedInGame;
    }

    public String getQuickBestDamageBlockedInGame() {
        return quickBestDamageBlockedInGame;
    }

    @SerializedName("quick_damage_blocked")
    public String quickDamageBloked;

    public void setQuickDamageBloked(String quickDamageBloked) {
        this.quickDamageBloked = quickDamageBloked;
    }

    public String getQuickDamageBloked() {
        return quickDamageBloked;
    }

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame) {
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame() {
        return quickBestMeleeLastShotInGame;
    }

    @SerializedName("quick_best_onecombo")
    public String quickBestOneCombo;

    public void setQuickBestOneCombo(String quickBestOneCombo) {
        this.quickBestOneCombo = quickBestOneCombo;
    }

    public String getQuickBestOneCombo() {
        return quickBestOneCombo;
    }

}