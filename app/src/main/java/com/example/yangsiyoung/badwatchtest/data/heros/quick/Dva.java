package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Dva extends QuickCharacter{

    @SerializedName("quick_mech_called")
    public String quickMechCalled;

    public void setQuickMechCalled(String quickMechCalled) {
        this.quickMechCalled = quickMechCalled;
    }

    public String getQuickMechCalled() {
        return quickMechCalled;
    }

    @SerializedName("quick_best_mech_called_in_game")
    public String quickBestMechCalledInGame;

    public void setQuickBestMechCalledInGame(String quickBestMechCalledInGame) {
        this.quickBestMechCalledInGame = quickBestMechCalledInGame;
    }

    public String getQuickBestMechCalledInGame() {
        return quickBestMechCalledInGame;
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
    public String quickDamageBlocked;

    public void setQuickDamageBlocked(String quickDamageBlocked) {
        this.quickDamageBlocked = quickDamageBlocked;
    }

    public String getQuickDamageBlocked() {
        return quickDamageBlocked;
    }

    @SerializedName("quick_mech_destroyed")
    public String quickMechDestroyed;

    public void setQuickMechDestroyed(String quickMechDestroyed) {
        this.quickMechDestroyed = quickMechDestroyed;
    }

    public String getQuickMechDestroyed() {
        return quickMechDestroyed;
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

    @SerializedName("quick_self_destruct_kill")
    public String quickSelfDestructKill;

    public void setQuickSelfDestructKill(String quickSelfDestructKill) {
        this.quickSelfDestructKill = quickSelfDestructKill;
    }

    public String getQuickSelfDestructKill() {
        return quickSelfDestructKill;
    }

    @SerializedName("quick_best_self_destruct_kill")
    public String quickBestSelfDestructKill;

    public void setQuickBestSelfDestructKill(String quickBestSelfDestructKill) {
        this.quickBestSelfDestructKill = quickBestSelfDestructKill;
    }

    public String getQuickBestSelfDestructKill() {
        return quickBestSelfDestructKill;
    }
}