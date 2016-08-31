package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Bastion extends QuickCharacter{

    @SerializedName("quick_recon_kill")
    public String quickReconKill;

    public void setQuickReconKill(String quickReconKill) {
        this.quickReconKill = quickReconKill;
    }

    public String getQuickReconKill() {
        return quickReconKill;
    }

    @SerializedName("quick_sentry_kill")
    public String quickSentryKill;

    public void setQuickSentryKill(String quickSentryKill) {
        this.quickSentryKill = quickSentryKill;
    }

    public String getQuickSentryKill() {
        return quickSentryKill;
    }

    @SerializedName("quick_tank_kill")
    public String quickTankKill;

    public void setQuickTankKill(String quickTankKill) {
        this.quickTankKill = quickTankKill;
    }

    public String getQuickTankKill() {
        return quickTankKill;
    }

    @SerializedName("quick_best_sentry_kill_in_game")
    public String quickBestSentryKillInGame;

    public void setQuickBestSentryKillInGame(String quickBestSentryKillInGame) {
        this.quickBestSentryKillInGame = quickBestSentryKillInGame;
    }

    public String getQuickBestSentryKillInGame() {
        return quickBestSentryKillInGame;
    }

    @SerializedName("quick_best_tank_kill_in_game")
    public String quickBestTankKillInGame;

    public void setQuickBestTankKillInGame(String quickBestTankKillInGame) {
        this.quickBestTankKillInGame = quickBestTankKillInGame;
    }

    public String getQuickBestTankKillInGame() {
        return quickBestTankKillInGame;
    }

    @SerializedName("quick_best_recon_kill_in_game")
    public String quickBestReconKillInGame;

    public void setQuickBestReconKillInGame(String quickBestReconKillInGame) {
        this.quickBestReconKillInGame = quickBestReconKillInGame;
    }

    public String getQuickBestReconKillInGame() {
        return quickBestReconKillInGame;
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

