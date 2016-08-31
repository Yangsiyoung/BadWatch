package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Junkrat extends RankCharacter{

    @SerializedName("rank_best_trapped_enemy_in_game")
    public String rankBestTrappedEnemyInGame;

    public void setRankBestTrappedEnemyInGame(String rankBestTrappedEnemyInGame) {
        this.rankBestTrappedEnemyInGame = rankBestTrappedEnemyInGame;
    }

    public String getRankBestTrappedEnemyInGame() {
        return rankBestTrappedEnemyInGame;
    }

    @SerializedName("rank_trapped_enemy")
    public String rankTrappedEnemy;

    public void setRankTrappedEnemy(String rankTrappedEnemy) {
        this.rankTrappedEnemy = rankTrappedEnemy;
    }

    public String getRankTrappedEnemy() {
        return rankTrappedEnemy;
    }

    @SerializedName("rank_best_riptire_kill_in_game")
    public String rankBestRiptireKillInGame;

    public void setRankBestRiptireKillInGame(String rankBestRiptireKillInGame) {
        this.rankBestRiptireKillInGame = rankBestRiptireKillInGame;
    }

    public String getRankBestRiptireKillInGame() {
        return rankBestRiptireKillInGame;
    }

    @SerializedName("rank_riptire_kill")
    public String rankRiptireKill;

    public void setRankRiptireKill(String rankRiptireKill) {
        this.rankRiptireKill = rankRiptireKill;
    }

    public String getRankRiptireKill() {
        return rankRiptireKill;
    }

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame) {
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame() {
        return rankBestMeleeLastShotInGame;
    }

    @SerializedName("rank_trapped_enemy_per_minute")
    public String rankTrappedEnemyPerMinute;

    public void setRankTrappedEnemyPerMinute(String rankTrappedEnemyPerMinute) {
        this.rankTrappedEnemyPerMinute = rankTrappedEnemyPerMinute;
    }

    public String getRankTrappedEnemyPerMinute() {
        return rankTrappedEnemyPerMinute;
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