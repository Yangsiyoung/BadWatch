package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class DvaRank extends RankCharacter{

    @SerializedName("rank_mech_called")
    public String rankMechCalled;

    public void setRankMechCalled(String rankMechCalled) {
        this.rankMechCalled = rankMechCalled;
    }

    public String getRankMechCalled() {
        return rankMechCalled;
    }

    @SerializedName("rank_best_mech_called_in_game")
    public String rankBestMechCalledInGame;

    public void setRankBestMechCalledInGame(String rankBestMechCalledInGame) {
        this.rankBestMechCalledInGame = rankBestMechCalledInGame;
    }

    public String getRankBestMechCalledInGame() {
        return rankBestMechCalledInGame;
    }

    @SerializedName("rank_best_damage_blocked_in_game")
    public String rankBestDamageBlockedInGame;

    public void setRankBestDamageBlockedInGame(String rankBestDamageBlockedInGame) {
        this.rankBestDamageBlockedInGame = rankBestDamageBlockedInGame;
    }

    public String getRankBestDamageBlockedInGame() {
        return rankBestDamageBlockedInGame;
    }

    @SerializedName("rank_damage_blocked")
    public String rankDamageBlocked;

    public void setRankDamageBlocked(String rankDamageBlocked) {
        this.rankDamageBlocked = rankDamageBlocked;
    }

    public String getRankDamageBlocked() {
        return rankDamageBlocked;
    }

    @SerializedName("rank_mech_destroyed")
    public String rankMechDestroyed;

    public void setRankMechDestroyed(String rankMechDestroyed) {
        this.rankMechDestroyed = rankMechDestroyed;
    }

    public String getRankMechDestroyed() {
        return rankMechDestroyed;
    }

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame) {
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame() {
        return rankBestMeleeLastShotInGame;
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

    @SerializedName("rank_self_destruct_kill")
    public String rankSelfDestructKill;

    public void setRankSelfDestructKill(String rankSelfDestructKill) {
        this.rankSelfDestructKill = rankSelfDestructKill;
    }

    public String getRankSelfDestructKill() {
        return rankSelfDestructKill;
    }

    @SerializedName("rank_best_self_destruct_kill")
    public String rankBestSelfDestructKill;

    public void setRankBestSelfDestructKill(String rankBestSelfDestructKill) {
        this.rankBestSelfDestructKill = rankBestSelfDestructKill;
    }

    public String getRankBestSelfDestructKill() {
        return rankBestSelfDestructKill;
    }
}