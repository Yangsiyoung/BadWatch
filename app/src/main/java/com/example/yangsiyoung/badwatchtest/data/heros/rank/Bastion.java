package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Bastion extends RankCharacter{

    @SerializedName("rank_recon_kill")
    public String rankReconKill;

    public void setRankReconKill(String rankReconKill) {
        this.rankReconKill = rankReconKill;
    }

    public String getRankReconKill() {
        return rankReconKill;
    }

    @SerializedName("rank_sentry_kill")
    public String rankSentryKill;

    public void setRankSentryKill(String rankSentryKill) {
        this.rankSentryKill = rankSentryKill;
    }

    public String getRankSentryKill() {
        return rankSentryKill;
    }

    @SerializedName("rank_tank_kill")
    public String rankTankKill;

    public void setRankTankKill(String rankTankKill) {
        this.rankTankKill = rankTankKill;
    }

    public String getRankTankKill() {
        return rankTankKill;
    }

    @SerializedName("rank_best_sentry_kill_in_game")
    public String rankBestSentryKillInGame;

    public void setRankBestSentryKillInGame(String rankBestSentryKillInGame) {
        this.rankBestSentryKillInGame = rankBestSentryKillInGame;
    }

    public String getRankBestSentryKillInGame() {
        return rankBestSentryKillInGame;
    }

    @SerializedName("rank_best_tank_kill_in_game")
    public String rankBestTankKillInGame;

    public void setRankBestTankKillInGame(String rankBestTankKillInGame) {
        this.rankBestTankKillInGame = rankBestTankKillInGame;
    }

    public String getRankBestTankKillInGame() {
        return rankBestTankKillInGame;
    }

    @SerializedName("rank_best_recon_kill_in_game")
    public String rankBestReconKillInGame;

    public void setRankBestReconKillInGame(String rankBestReconKillInGame) {
        this.rankBestReconKillInGame = rankBestReconKillInGame;
    }

    public String getRankBestReconKillInGame() {
        return rankBestReconKillInGame;
    }

    @SerializedName("rank_environment_death")
    public String rankEnvironmentDeath;

    public void setRankEnvironmentDeath(String rankEnvironmentDeath) {
        this.rankEnvironmentDeath = rankEnvironmentDeath;
    }

    public String getRankEnvironmentDeath() {
        return rankEnvironmentDeath;
    }

    @SerializedName("rank_best_onecombo")
    public String rankBestOneCombo;

    public void setRankBestOneCombo(String rankBestOneCombo) {
        this.rankBestOneCombo = rankBestOneCombo;
    }

    public String getRankBestOneCombo() {
        return rankBestOneCombo;
    }

}

