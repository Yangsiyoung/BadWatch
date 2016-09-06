package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class MeiRank extends RankCharacter{

    @SerializedName("rank_enemy_frozen")
    public String rankEnemyFrozen;

    public void setRankEnemyFrozen(String rankEnemyFrozen) {
        this.rankEnemyFrozen = rankEnemyFrozen;
    }

    public String getRankEnemyFrozen() {
        return rankEnemyFrozen;
    }

    @SerializedName("rank_best_enemy_frozen_in_game")
    public String rankBestEnemyFrozenIngame;

    public void setRankBestEnemyFrozenIngame(String rankBestEnemyFrozenIngame) {
        this.rankBestEnemyFrozenIngame = rankBestEnemyFrozenIngame;
    }

    public String getRankBestEnemyFrozenIngame() {
        return rankBestEnemyFrozenIngame;
    }

    @SerializedName("rank_best_blizzard_kill_in_game")
    public String rankBestBlizzardKillInGame;

    public void setRankBestBlizzardKillInGame(String rankBestBlizzardKillInGame) {
        this.rankBestBlizzardKillInGame = rankBestBlizzardKillInGame;
    }

    public String getRankBestBlizzardKillInGame() {
        return rankBestBlizzardKillInGame;
    }

    @SerializedName("rank_blizzard_kill")
    public String rankBlizzardKill;

    public void setRankBlizzardKill(String rankBlizzardKill) {
        this.rankBlizzardKill = rankBlizzardKill;
    }

    public String getRankBlizzardKill() {
        return rankBlizzardKill;
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
    public String rankDamageBloked;

    public void setRankDamageBloked(String rankDamageBloked) {
        this.rankDamageBloked = rankDamageBloked;
    }

    public String getRankDamageBloked() {
        return rankDamageBloked;
    }

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame) {
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame() {
        return rankBestMeleeLastShotInGame;
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