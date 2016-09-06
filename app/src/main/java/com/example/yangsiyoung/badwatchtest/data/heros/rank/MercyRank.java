package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class MercyRank extends RankCharacter{

    @SerializedName("rank_resurrected")
    public String rankResurrected;

    public void setRankResurrected(String rankResurrected) {
        this.rankResurrected = rankResurrected;
    }

    public String getRankResurrected() {
        return rankResurrected;
    }

    @SerializedName("rank_best_resurrected_in_game")
    public String rankBestResurrectedInGame;

    public void setRankBestResurrectedInGame(String rankBestResurrectedInGame) {
        this.rankBestResurrectedInGame = rankBestResurrectedInGame;
    }

    public String getRankBestResurrectedInGame() {
        return rankBestResurrectedInGame;
    }

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame) {
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame() {
        return rankBestMeleeLastShotInGame;
    }

    @SerializedName("rank_blaster_kill")
    public String rankBlasterKill;

    public void setRankBlasterKill(String rankBlasterKill) {
        this.rankBlasterKill = rankBlasterKill;
    }

    public String getRankBlasterKill() {
        return rankBlasterKill;
    }

    @SerializedName("rank_best_blaster_kill_in_game")
    public String rankBestBlasterKillInGame;

    public void setRankBestBlasterKillInGame(String rankBestBlasterKillInGame) {
        this.rankBestBlasterKillInGame = rankBestBlasterKillInGame;
    }

    public String getRankBestBlasterKillInGame() {
        return rankBestBlasterKillInGame;
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