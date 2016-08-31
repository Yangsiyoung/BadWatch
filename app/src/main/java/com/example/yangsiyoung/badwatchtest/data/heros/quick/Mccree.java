package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Mccree extends QuickCharacter{

    @SerializedName("quick_deadeye_kill")
    public String quickDeadEyeKill;

    public void setQuickDeadEyeKill(String quickDeadEyeKill) {
        this.quickDeadEyeKill = quickDeadEyeKill;
    }

    public String getQuickDeadEyeKill() {
        return quickDeadEyeKill;
    }

    @SerializedName("quick_best_deadeye_kill_in_game")
    public String quickBestDeadEyeKillInGame;

    public void setQuickBestDeadEyeKillInGame(String quickBestDeadEyeKillInGame) {
        this.quickBestDeadEyeKillInGame = quickBestDeadEyeKillInGame;
    }

    public String getQuickBestDeadEyeKillInGame() {
        return quickBestDeadEyeKillInGame;
    }

    @SerializedName("quick_fan_the_hammer_kill")
    public String quickFanTheHammerKill;

    public void setQuickFanTheHammerKill(String quickFanTheHammerKill) {
        this.quickFanTheHammerKill = quickFanTheHammerKill;
    }

    public String getQuickFanTheHammerKill() {
        return quickFanTheHammerKill;
    }

    @SerializedName("quick_ccbest_melee_lastshot_in_game")
    public String quickCcBestMeleeLastShotInGame;

    public void setQuickCcBestMeleeLastShotInGame(String quickCcBestMeleeLastShotInGame) {
        this.quickCcBestMeleeLastShotInGame = quickCcBestMeleeLastShotInGame;
    }

    public String getQuickCcBestMeleeLastShotInGame() {
        return quickCcBestMeleeLastShotInGame;
    }

    @SerializedName("quick_best_onecombo")
    public String quickBestOneCombo;

    public void setQuickBestOneCombo(String quickBestOneCombo) {
        this.quickBestOneCombo = quickBestOneCombo;
    }

    public String getQuickBestOneCombo() {
        return quickBestOneCombo;
    }

    @SerializedName("quick_best_fan_the_hammer_kill_in_game")
    public String quickBestFanTheHammerKillInGame;

    public void setQuickBestFanTheHammerKillInGame(String quickBestFanTheHammerKillInGame) {
        this.quickBestFanTheHammerKillInGame = quickBestFanTheHammerKillInGame;
    }

    public String getQuickBestFanTheHammerKillInGame() {
        return quickBestFanTheHammerKillInGame;
    }
}