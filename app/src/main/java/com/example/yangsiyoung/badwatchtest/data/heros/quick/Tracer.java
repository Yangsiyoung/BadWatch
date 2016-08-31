package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Tracer extends QuickCharacter{

    @SerializedName("quick_pulse_bomb_kill")
    public String quickPulseBombKill;

    public void setQuickPulseBombKill(String quickPulseBombKill) {
        this.quickPulseBombKill = quickPulseBombKill;
    }

    public String getQuickPulseBombKill() {
        return quickPulseBombKill;
    }

    @SerializedName("quick_best_pulse_bomb_kill_in_game")
    public String quickBestPulseBombKillInGame;

    public void setQuickBestPulseBombKillInGame(String quickBestPulseBombKillInGame) {
        this.quickBestPulseBombKillInGame = quickBestPulseBombKillInGame;
    }

    public String getQuickBestPulseBombKillInGame() {
        return quickBestPulseBombKillInGame;
    }

    @SerializedName("quick_best_puls_bomb_attached_in_game")
    public String quickBestPulsBombAttachedInGame;

    public void setQuickBestPulsBombAttachedInGame(String quickBestPulsBombAttachedInGame) {
        this.quickBestPulsBombAttachedInGame = quickBestPulsBombAttachedInGame;
    }

    public String getQuickBestPulsBombAttachedInGame() {
        return quickBestPulsBombAttachedInGame;
    }

    @SerializedName("quick_pulse_bomb_attached")
    public String quickPulseBombAttached;

    public void setQuickPulseBombAttached(String quickPulseBombAttached) {
        this.quickPulseBombAttached = quickPulseBombAttached;
    }

    public String getQuickPulseBombAttached() {
        return quickPulseBombAttached;
    }

    @SerializedName("quick_melee_lastshot_in_game")
    public String quickMeleeLastShotInGame;

    public void setQuickMeleeLastShotInGame(String quickMeleeLastShotInGame) {
        this.quickMeleeLastShotInGame = quickMeleeLastShotInGame;
    }

    public String getQuickMeleeLastShotInGame() {
        return quickMeleeLastShotInGame;
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