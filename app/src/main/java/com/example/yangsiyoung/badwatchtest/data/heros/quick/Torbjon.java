package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Torbjon extends QuickCharacter{

    @SerializedName("quick_armor_pack_created")
    public String quickArmorPackCreated;

    public void setQuickArmorPackCreated(String quickArmorPackCreated) {
        this.quickArmorPackCreated = quickArmorPackCreated;
    }

    public String getQuickArmorPackCreated() {
        return quickArmorPackCreated;
    }

    @SerializedName("quick_torbjon_kill")
    public String quickTorbjonKill;

    public void setQuickTorbjonKill(String quickTorbjonKill) {
        this.quickTorbjonKill = quickTorbjonKill;
    }

    public String getQuickTorbjonKill() {
        return quickTorbjonKill;
    }

    @SerializedName("quick_turret_kill")
    public String quickTurretKill;

    public void setQuickTurretKill(String quickTurretKill) {
        this.quickTurretKill = quickTurretKill;
    }

    public String getQuickTurretKill() {
        return quickTurretKill;
    }

    @SerializedName("quick_best_torbjon_kill_in_game")
    public String quickBestTorbjonKillInGame;

    public void setQuickBestTorbjonKillInGame(String quickBestTorbjonKillInGame) {
        this.quickBestTorbjonKillInGame = quickBestTorbjonKillInGame;
    }

    public String getQuickBestTorbjonKillInGame() {
        return quickBestTorbjonKillInGame;
    }

    @SerializedName("quick_molten_core_kill")
    public String quickMoltenCoreKill;

    public void setQuickMoltenCoreKill(String quickMoltenCoreKill) {
        this.quickMoltenCoreKill = quickMoltenCoreKill;
    }

    public String getQuickMoltenCoreKill() {
        return quickMoltenCoreKill;
    }

    @SerializedName("quick_best_molten_core_kill_in_game")
    public String quickBestMoltenCoreKillInGame;

    public void setQuickBestMoltenCoreKillInGame(String quickBestMoltenCoreKillInGame) {
        this.quickBestMoltenCoreKillInGame = quickBestMoltenCoreKillInGame;
    }

    public String getQuickBestMoltenCoreKillInGame() {
        return quickBestMoltenCoreKillInGame;
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