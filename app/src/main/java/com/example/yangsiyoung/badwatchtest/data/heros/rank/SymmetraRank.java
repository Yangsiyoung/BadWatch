package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class SymmetraRank extends RankCharacter{

    @SerializedName("rank_turret_kill")
    public String rankTurretKill;

    public void setRankTurretKill(String rankTurretKill) {
        this.rankTurretKill = rankTurretKill;
    }

    public String getRankTurretKill() {
        return rankTurretKill;
    }

    @SerializedName("rank_best_turret_kill_in_game")
    public String rankBestTurretKillInGame;

    public void setRankBestTurretKillInGame(String rankBestTurretKillInGame) {
        this.rankBestTurretKillInGame = rankBestTurretKillInGame;
    }

    public String getRankBestTurretKillInGame() {
        return rankBestTurretKillInGame;
    }

    @SerializedName("rank_player_teleported")
    public String rankPlayerTeleported;

    public void setRankPlayerTeleported(String rankPlayerTeleported) {
        this.rankPlayerTeleported = rankPlayerTeleported;
    }

    public String getRankPlayerTeleported() {
        return rankPlayerTeleported;
    }

    @SerializedName("rank_best_player_teleported_in_game")
    public String rankBestPlayerTeleportedInGame;

    public void setRankBestPlayerTeleportedInGame(String rankBestPlayerTeleportedInGame) {
        this.rankBestPlayerTeleportedInGame = rankBestPlayerTeleportedInGame;
    }

    public String getRankBestPlayerTeleportedInGame() {
        return rankBestPlayerTeleportedInGame;
    }

    @SerializedName("rank_shield_provided")
    public String rankShieldProvided;

    public void setRankShieldProvided(String rankShieldProvided) {
        this.rankShieldProvided = rankShieldProvided;
    }

    public String getRankShieldProvided() {
        return rankShieldProvided;
    }

    @SerializedName("rank_best_shield_provided_in_game")
    public String rankBestShieldProvidedInGame;

    public void setRankBestShieldProvidedInGame(String rankBestShieldProvidedInGame) {
        this.rankBestShieldProvidedInGame = rankBestShieldProvidedInGame;
    }

    public String getRankBestShieldProvidedInGame() {
        return rankBestShieldProvidedInGame;
    }

    @SerializedName("rank_teleport_uptime")
    public String rankTeleportUpTime;

    public void setRankTeleportUpTime(String rankTeleportUpTime) {
        this.rankTeleportUpTime = rankTeleportUpTime;
    }

    public String getRankTeleportUpTime() {
        return rankTeleportUpTime;
    }

    @SerializedName("rank_best_teleport_uptime_in_game")
    public String rankBestTeleportUpTimeInGame;

    public void setRankBestTeleportUpTimeInGame(String rankBestTeleportUpTimeInGame) {
        this.rankBestTeleportUpTimeInGame = rankBestTeleportUpTimeInGame;
    }

    public String getRankBestTeleportUpTimeInGame() {
        return rankBestTeleportUpTimeInGame;
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