package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Genji extends QuickCharacter{

    @SerializedName("quick_dragonblade_kill")
    public String quickDragonBladeKill;

    public void setQuickDragonBladeKill(String quickDragonBladeKill) {
        this.quickDragonBladeKill = quickDragonBladeKill;
    }

    public String getQuickDragonBladeKill() {
        return quickDragonBladeKill;
    }

    @SerializedName("quick_best_dragonblade_kill_in_game")
    public String quickBestDragonBladeKillInGame;

    public void setQuickBestDragonBladeKillInGame(String quickBestDragonBladeKillInGame) {
        this.quickBestDragonBladeKillInGame = quickBestDragonBladeKillInGame;
    }

    public String getQuickBestDragonBladeKillInGame() {
        return quickBestDragonBladeKillInGame;
    }

    @SerializedName("quick_damage_reflected")
    public String quickDamageReflected;

    public void setQuickDamageReflected(String quickDamageReflected) {
        this.quickDamageReflected = quickDamageReflected;
    }

    public String getQuickDamageReflected() {
        return quickDamageReflected;
    }

    @SerializedName("quick_best_damage_reflected_in_game")
    public String quickBestDamageReflectedInGame;

    public void setQuickBestDamageReflectedInGame(String quickBestDamageReflectedInGame) {
        this.quickBestDamageReflectedInGame = quickBestDamageReflectedInGame;
    }

    public String getQuickBestDamageReflectedInGame() {
        return quickBestDamageReflectedInGame;
    }

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame) {
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame() {
        return quickBestMeleeLastShotInGame;
    }

    @SerializedName("quick_environment_death")
    public String quickEnvironmentDeath;

    public void setQuickEnvironmentDeath(String quickEnvironmentDeath) {
        this.quickEnvironmentDeath = quickEnvironmentDeath;
    }

    public String getQuickEnvironmentDeath() {
        return quickEnvironmentDeath;
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