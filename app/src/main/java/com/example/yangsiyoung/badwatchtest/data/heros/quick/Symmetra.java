package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Symmetra extends QuickCharacter{

    @SerializedName("quick_turret_kill")
    public String quickTurretKill;

    public void setQuickTurretKill(String quickTurretKill) {
        this.quickTurretKill = quickTurretKill;
    }

    public String getQuickTurretKill() {
        return quickTurretKill;
    }

    @SerializedName("quick_best_turret_kill_in_game")
    public String quickBestTurretKillInGame;

    public void setQuickBestTurretKillInGame(String quickBestTurretKillInGame) {
        this.quickBestTurretKillInGame = quickBestTurretKillInGame;
    }

    public String getQuickBestTurretKillInGame() {
        return quickBestTurretKillInGame;
    }

    @SerializedName("quick_player_teleported")
    public String quickPlayerTeleported;

    public void setQuickPlayerTeleported(String quickPlayerTeleported) {
        this.quickPlayerTeleported = quickPlayerTeleported;
    }

    public String getQuickPlayerTeleported() {
        return quickPlayerTeleported;
    }

    @SerializedName("quick_best_player_teleported_in_game")
    public String quickBestPlayerTeleportedInGame;

    public void setQuickBestPlayerTeleportedInGame(String quickBestPlayerTeleportedInGame) {
        this.quickBestPlayerTeleportedInGame = quickBestPlayerTeleportedInGame;
    }

    public String getQuickBestPlayerTeleportedInGame() {
        return quickBestPlayerTeleportedInGame;
    }

    @SerializedName("quick_shield_provided")
    public String quickShieldProvided;

    public void setQuickShieldProvided(String quickShieldProvided) {
        this.quickShieldProvided = quickShieldProvided;
    }

    public String getQuickShieldProvided() {
        return quickShieldProvided;
    }

    @SerializedName("quick_best_shield_provided_in_game")
    public String quickBestShieldProvidedInGame;

    public void setQuickBestShieldProvidedInGame(String quickBestShieldProvidedInGame) {
        this.quickBestShieldProvidedInGame = quickBestShieldProvidedInGame;
    }

    public String getQuickBestShieldProvidedInGame() {
        return quickBestShieldProvidedInGame;
    }

    @SerializedName("quick_teleport_uptime")
    public String quickTeleportUpTime;

    public void setQuickTeleportUpTime(String quickTeleportUpTime) {
        this.quickTeleportUpTime = quickTeleportUpTime;
    }

    public String getQuickTeleportUpTime() {
        return quickTeleportUpTime;
    }

    @SerializedName("quick_best_teleport_uptime_in_game")
    public String quickBestTeleportUpTimeInGame;

    public void setQuickBestTeleportUpTimeInGame(String quickBestTeleportUpTimeInGame) {
        this.quickBestTeleportUpTimeInGame = quickBestTeleportUpTimeInGame;
    }

    public String getQuickBestTeleportUpTimeInGame() {
        return quickBestTeleportUpTimeInGame;
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