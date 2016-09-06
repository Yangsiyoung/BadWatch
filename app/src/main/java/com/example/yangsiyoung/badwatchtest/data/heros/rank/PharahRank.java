package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class PharahRank extends RankCharacter{

    @SerializedName("rank_rocket_hit")
    public String rankRocketHit;

    public void setRankRocketHit(String rankRocketHit) {
        this.rankRocketHit = rankRocketHit;
    }

    public String getRankRocketHit() {
        return rankRocketHit;
    }

    @SerializedName("rank_barrage_kill")
    public String rankBarrageKill;

    public void setRankBarrageKill(String rankBarrageKill) {
        this.rankBarrageKill = rankBarrageKill;
    }

    public String getRankBarrageKill() {
        return rankBarrageKill;
    }

    @SerializedName("rank_best_rocket_hit_in_game")
    public String rankBestRocketHitInGame;

    public void setRankBestRocketHitInGame(String rankBestRocketHitInGame) {
        this.rankBestRocketHitInGame = rankBestRocketHitInGame;
    }

    public String getRankBestRocketHitInGame() {
        return rankBestRocketHitInGame;
    }

    @SerializedName("rank_best_barrage_kill_in_game")
    public String rankBestBarrageKillInGame;

    public void setRankBestBarrageKillInGame(String rankBestBarrageKillInGame) {
        this.rankBestBarrageKillInGame = rankBestBarrageKillInGame;
    }

    public String getRankBestBarrageKillInGame() {
        return rankBestBarrageKillInGame;
    }

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame) {
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame() {
        return rankBestMeleeLastShotInGame;
    }
}