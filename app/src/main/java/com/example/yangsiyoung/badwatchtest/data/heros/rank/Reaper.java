package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Reaper extends RankCharacter{

    @SerializedName("rank_soul_consumed")
    public String rankSoulConsumed;

    public void setRankSoulConsumed(String rankSoulConsumed) {
        this.rankSoulConsumed = rankSoulConsumed;
    }

    public String getRankSoulConsumed() {
        return rankSoulConsumed;
    }

    @SerializedName("rank_death_blossom_kill")
    public String rankDeathBlossomKill;

    public void setRankDeathBlossomKill(String rankDeathBlossomKill) {
        this.rankDeathBlossomKill = rankDeathBlossomKill;
    }

    public String getRankDeathBlossomKill() {
        return rankDeathBlossomKill;
    }
    @SerializedName("rank_most_soul_consumed")
    public String rankMostSoulComsumed;

    public void setRankMostSoulComsumed(String rankMostSoulComsumed) {
        this.rankMostSoulComsumed = rankMostSoulComsumed;
    }

    public String getRankMostSoulComsumed() {
        return rankMostSoulComsumed;
    }

    @SerializedName("rank_most_death_blossom_kill")
    public String rankMostDeathBlossomKill;

    public void setRankMostDeathBlossomKill(String rankMostDeathBlossomKill) {
        this.rankMostDeathBlossomKill = rankMostDeathBlossomKill;
    }

    public String getRankMostDeathBlossomKill() {
        return rankMostDeathBlossomKill;
    }

    @SerializedName("rank_most_melee_lastshot")
    public String rankMostMeleeLastShot;

    public void setRankMostMeleeLastShot(String rankMostMeleeLastShot) {
        this.rankMostMeleeLastShot = rankMostMeleeLastShot;
    }

    public String getRankMostMeleeLastShot() {
        return rankMostMeleeLastShot;
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