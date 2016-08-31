package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Reinhardt extends QuickCharacter{

    @SerializedName("quick_damage_blocked")
    public String quickDamageBlocked;

    public void setQuickDamageBlocked(String quickDamageBlocked) {
        this.quickDamageBlocked = quickDamageBlocked;
    }

    public String getQuickDamageBlocked() {
        return quickDamageBlocked;
    }

    @SerializedName("quick_best_damage_blocked_in_game")
    public String quickBestDamageBlockedInGame;

    public void setQuickBestDamageBlockedInGame(String quickBestDamageBlockedInGame) {
        this.quickBestDamageBlockedInGame = quickBestDamageBlockedInGame;
    }

    public String getQuickBestDamageBlockedInGame() {
        return quickBestDamageBlockedInGame;
    }

    @SerializedName("quick_charge_kill")
    public String quickChargeKill;

    public void setQuickChargeKill(String quickChargeKill) {
        this.quickChargeKill = quickChargeKill;
    }

    public String getQuickChargeKill() {
        return quickChargeKill;
    }
    @SerializedName("quick_best_charge_kill_in_game")
    public String quickBestChargeKillInGame;

    public void setQuickBestChargeKillInGame(String quickBestChargeKillInGame) {
        this.quickBestChargeKillInGame = quickBestChargeKillInGame;
    }

    public String getQuickBestChargeKillInGame() {
        return quickBestChargeKillInGame;
    }

    @SerializedName("quick_fire_strike_kill")
    public String quickFireStrikeKill;

    public void setQuickFireStrikeKill(String quickFireStrikeKill) {
        this.quickFireStrikeKill = quickFireStrikeKill;
    }

    public String getQuickFireStrikeKill() {
        return quickFireStrikeKill;
    }

    @SerializedName("quick_best_fire_strike_kill_in_game")
    public String quickBestFireStrikeKillInGame;

    public void setQuickBestFireStrikeKillInGame(String quickBestFireStrikeKillInGame) {
        this.quickBestFireStrikeKillInGame = quickBestFireStrikeKillInGame;
    }

    public String getQuickBestFireStrikeKillInGame() {
        return quickBestFireStrikeKillInGame;
    }

    @SerializedName("quick_earthshatter_kill")
    public String quickEarthShatterKill;

    public void setQuickEarthShatterKill(String quickEarthShatterKill) {
        this.quickEarthShatterKill = quickEarthShatterKill;
    }

    public String getQuickEarthShatterKill() {
        return quickEarthShatterKill;
    }

    @SerializedName("quick_best_earthshatter_kill_in_game")
    public String quickBestEarthShatterKillInGame;

    public void setQuickBestEarthShatterKillInGame(String quickBestEarthShatterKillInGame) {
        this.quickBestEarthShatterKillInGame = quickBestEarthShatterKillInGame;
    }

    public String getQuickBestEarthShatterKillInGame() {
        return quickBestEarthShatterKillInGame;
    }
}