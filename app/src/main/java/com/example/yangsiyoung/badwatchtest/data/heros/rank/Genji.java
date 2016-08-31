package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Genji extends RankCharacter{

    @SerializedName("rank_dragonblade_kill")
    public String rankDragonBladeKill;

    public void setRankDragonBladeKill(String rankDragonBladeKill) {
        this.rankDragonBladeKill = rankDragonBladeKill;
    }

    public String getRankDragonBladeKill() {
        return rankDragonBladeKill;
    }

    @SerializedName("rank_best_dragonblade_kill_in_game")
    public String rankBestDragonBladeKillInGame;

    public void setRankBestDragonBladeKillInGame(String rankBestDragonBladeKillInGame) {
        this.rankBestDragonBladeKillInGame = rankBestDragonBladeKillInGame;
    }

    public String getRankBestDragonBladeKillInGame() {
        return rankBestDragonBladeKillInGame;
    }

    @SerializedName("rank_damage_reflected")
    public String rankDamageReflected;

    public void setRankDamageReflected(String rankDamageReflected) {
        this.rankDamageReflected = rankDamageReflected;
    }

    public String getRankDamageReflected() {
        return rankDamageReflected;
    }

    @SerializedName("rank_best_damage_reflected_in_game")
    public String rankBestDamageReflectedInGame;

    public void setRankBestDamageReflectedInGame(String rankBestDamageReflectedInGame) {
        this.rankBestDamageReflectedInGame = rankBestDamageReflectedInGame;
    }

    public String getRankBestDamageReflectedInGame() {
        return rankBestDamageReflectedInGame;
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

}