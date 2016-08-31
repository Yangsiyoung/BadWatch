package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Reinhardt extends RankCharacter{

    @SerializedName("rank_damage_blocked")
    public String rankDamageBlocked;

    public void setRankDamageBlocked(String rankDamageBlocked) {
        this.rankDamageBlocked = rankDamageBlocked;
    }

    public String getRankDamageBlocked() {
        return rankDamageBlocked;
    }

    @SerializedName("rank_best_damage_blocked_in_game")
    public String rankBestDamageBlockedInGame;

    public void setRankBestDamageBlockedInGame(String rankBestDamageBlockedInGame) {
        this.rankBestDamageBlockedInGame = rankBestDamageBlockedInGame;
    }

    public String getRankBestDamageBlockedInGame() {
        return rankBestDamageBlockedInGame;
    }

    @SerializedName("rank_charge_kill")
    public String rankChargeKill;

    public void setRankChargeKill(String rankChargeKill) {
        this.rankChargeKill = rankChargeKill;
    }

    public String getRankChargeKill() {
        return rankChargeKill;
    }
    @SerializedName("rank_best_charge_kill_in_game")
    public String rankBestChargeKillInGame;

    public void setRankBestChargeKillInGame(String rankBestChargeKillInGame) {
        this.rankBestChargeKillInGame = rankBestChargeKillInGame;
    }

    public String getRankBestChargeKillInGame() {
        return rankBestChargeKillInGame;
    }

    @SerializedName("rank_fire_strike_kill")
    public String rankFireStrikeKill;

    public void setRankFireStrikeKill(String rankFireStrikeKill) {
        this.rankFireStrikeKill = rankFireStrikeKill;
    }

    public String getRankFireStrikeKill() {
        return rankFireStrikeKill;
    }

    @SerializedName("rank_best_fire_strike_kill_in_game")
    public String rankBestFireStrikeKillInGame;

    public void setRankBestFireStrikeKillInGame(String rankBestFireStrikeKillInGame) {
        this.rankBestFireStrikeKillInGame = rankBestFireStrikeKillInGame;
    }

    public String getRankBestFireStrikeKillInGame() {
        return rankBestFireStrikeKillInGame;
    }

    @SerializedName("rank_earthshatter_kill")
    public String rankEarthShatterKill;

    public void setRankEarthShatterKill(String rankEarthShatterKill) {
        this.rankEarthShatterKill = rankEarthShatterKill;
    }

    public String getRankEarthShatterKill() {
        return rankEarthShatterKill;
    }

    @SerializedName("rank_best_earthshatter_kill_in_game")
    public String rankBestEarthShatterKillInGame;

    public void setRankBestEarthShatterKillInGame(String rankBestEarthShatterKillInGame) {
        this.rankBestEarthShatterKillInGame = rankBestEarthShatterKillInGame;
    }

    public String getRankBestEarthShatterKillInGame() {
        return rankBestEarthShatterKillInGame;
    }
}