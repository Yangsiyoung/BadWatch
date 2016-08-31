package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Zenyatta extends RankCharacter{

    @SerializedName("rank_best_transcendence_heal")
    public String rankBestTranscendenceHeal;

    public void setRankBestTranscendenceHeal(String rankBestTranscendenceHeal) {
        this.rankBestTranscendenceHeal = rankBestTranscendenceHeal;
    }

    public String getRankBestTranscendenceHeal() {
        return rankBestTranscendenceHeal;
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

    @SerializedName("rank_transcendence_heal")
    public String rankTranscendenceHeal;

    public void setRankTranscendenceHeal(String rankTranscendenceHeal) {
        this.rankTranscendenceHeal = rankTranscendenceHeal;
    }

    public String getRankTranscendenceHeal() {
        return rankTranscendenceHeal;
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