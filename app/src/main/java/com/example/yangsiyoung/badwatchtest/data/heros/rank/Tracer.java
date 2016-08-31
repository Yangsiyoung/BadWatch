package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Tracer extends RankCharacter{

    @SerializedName("rank_pulse_bomb_kill")
    public String rankPulseBombKill;

    public void setRankPulseBombKill(String rankPulseBombKill) {
        this.rankPulseBombKill = rankPulseBombKill;
    }

    public String getRankPulseBombKill() {
        return rankPulseBombKill;
    }

    @SerializedName("rank_best_pulse_bomb_kill_in_game")
    public String rankBestPulseBombKillInGame;

    public void setRankBestPulseBombKillInGame(String rankBestPulseBombKillInGame) {
        this.rankBestPulseBombKillInGame = rankBestPulseBombKillInGame;
    }

    public String getRankBestPulseBombKillInGame() {
        return rankBestPulseBombKillInGame;
    }

    @SerializedName("rank_best_puls_bomb_attached_in_game")
    public String rankBestPulsBombAttachedInGame;

    public void setRankBestPulsBombAttachedInGame(String rankBestPulsBombAttachedInGame) {
        this.rankBestPulsBombAttachedInGame = rankBestPulsBombAttachedInGame;
    }

    public String getRankBestPulsBombAttachedInGame() {
        return rankBestPulsBombAttachedInGame;
    }

    @SerializedName("rank_pulse_bomb_attached")
    public String rankPulseBombAttached;

    public void setRankPulseBombAttached(String rankPulseBombAttached) {
        this.rankPulseBombAttached = rankPulseBombAttached;
    }

    public String getRankPulseBombAttached() {
        return rankPulseBombAttached;
    }

    @SerializedName("rank_melee_lastshot_in_game")
    public String rankMeleeLastShotInGame;

    public void setRankMeleeLastShotInGame(String rankMeleeLastShotInGame) {
        this.rankMeleeLastShotInGame = rankMeleeLastShotInGame;
    }

    public String getRankMeleeLastShotInGame() {
        return rankMeleeLastShotInGame;
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