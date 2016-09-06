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

    @SerializedName("rank_attack_support")
    public String rankAttackSupport;

    public void setRankAttackSupport(String rankAttackSupport) {
        this.rankAttackSupport = rankAttackSupport;
    }

    public String getRankAttackSupport() {
        return rankAttackSupport;
    }

    @SerializedName("rank_best_attack_support_in_game")
    public String rankBestAttackSupportInGame;

    public void setRankBestAttackSupportInGame(String rankBestAttackSupportInGame) {
        this.rankBestAttackSupportInGame = rankBestAttackSupportInGame;
    }

    public String getRankBestAttackSupportInGame() {
        return rankBestAttackSupportInGame;
    }

    @SerializedName("rank_defence_support")
    public String rankDefenceSupport;

    public void setRankDefenceSupport(String rankDefenceSupport) {
        this.rankDefenceSupport = rankDefenceSupport;
    }

    public String getRankDefenceSupport() {
        return rankDefenceSupport;
    }

    @SerializedName("rank_best_defence_support_in_game")
    public String rankBestDefenceSupportInGame;

    public void setRankBestDefenceSupportInGame(String rankBestDefenceSupportInGame) {
        this.rankBestDefenceSupportInGame = rankBestDefenceSupportInGame;
    }

    public String getRankBestDefenceSupportInGame() {
        return rankBestDefenceSupportInGame;
    }

}