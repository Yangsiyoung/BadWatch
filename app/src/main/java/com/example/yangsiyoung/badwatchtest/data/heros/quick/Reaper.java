package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Reaper extends QuickCharacter{

    @SerializedName("quick_soul_consumed")
    public String quickSoulConsumed;

    public void setQuickSoulConsumed(String quickSoulConsumed) {
        this.quickSoulConsumed = quickSoulConsumed;
    }

    public String getQuickSoulConsumed() {
        return quickSoulConsumed;
    }

    @SerializedName("quick_death_blossom_kill")
    public String quickDeathBlossomKill;

    public void setQuickDeathBlossomKill(String quickDeathBlossomKill) {
        this.quickDeathBlossomKill = quickDeathBlossomKill;
    }

    public String getQuickDeathBlossomKill() {
        return quickDeathBlossomKill;
    }
    @SerializedName("quick_most_soul_consumed")
    public String quickMostSoulComsumed;

    public void setQuickMostSoulComsumed(String quickMostSoulComsumed) {
        this.quickMostSoulComsumed = quickMostSoulComsumed;
    }

    public String getQuickMostSoulComsumed() {
        return quickMostSoulComsumed;
    }

    @SerializedName("quick_most_death_blossom_kill")
    public String quickMostDeathBlossomKill;

    public void setQuickMostDeathBlossomKill(String quickMostDeathBlossomKill) {
        this.quickMostDeathBlossomKill = quickMostDeathBlossomKill;
    }

    public String getQuickMostDeathBlossomKill() {
        return quickMostDeathBlossomKill;
    }

    @SerializedName("quick_most_melee_lastshot")
    public String quickMostMeleeLastShot;

    public void setQuickMostMeleeLastShot(String quickMostMeleeLastShot) {
        this.quickMostMeleeLastShot = quickMostMeleeLastShot;
    }

    public String getQuickMostMeleeLastShot() {
        return quickMostMeleeLastShot;
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