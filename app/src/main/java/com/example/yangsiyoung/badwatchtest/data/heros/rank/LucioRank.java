package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class LucioRank extends RankCharacter{

    @SerializedName("rank_sound_barrier")
    public String rankSoundBarrier;

    public void setRankSoundBarrier(String rankSoundBarrier) {
        this.rankSoundBarrier = rankSoundBarrier;
    }

    public String getRankSoundBarrier() {
        return rankSoundBarrier;
    }

    @SerializedName("rank_best_sound_barrier_in_game")
    public String rankBestSoundBarrierInGame;

    public void setRankBestSoundBarrierInGame(String rankBestSoundBarrierInGame) {
        this.rankBestSoundBarrierInGame = rankBestSoundBarrierInGame;
    }

    public String getRankBestSoundBarrierInGame() {
        return rankBestSoundBarrierInGame;
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