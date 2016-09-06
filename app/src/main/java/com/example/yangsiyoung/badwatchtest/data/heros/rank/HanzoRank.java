package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class HanzoRank extends RankCharacter{

    @SerializedName("rank_dragonstrike_kill")
    public String rankDragonStrikeKill;

    public void setRankDragonStrikeKill(String rankDragonStrikeKill) {
        this.rankDragonStrikeKill = rankDragonStrikeKill;
    }

    public String getRankDragonStrikeKill() {
        return rankDragonStrikeKill;
    }

    @SerializedName("rank_best_dragonstrike_kill_in_game")
    public String rankBestDragonStrikeKillInGame;

    public void setRankBestDragonStrikeKillInGame(String rankBestDragonStrikeKillInGame) {
        this.rankBestDragonStrikeKillInGame = rankBestDragonStrikeKillInGame;
    }

    public String getRankBestDragonStrikeKillInGame() {
        return rankBestDragonStrikeKillInGame;
    }

    @SerializedName("rank_scatter_arrow_kill")
    public String rankScatterArrowKill;

    public void setRankScatterArrowKill(String rankScatterArrowKill) {
        this.rankScatterArrowKill = rankScatterArrowKill;
    }

    public String getRankScatterArrowKill() {
        return rankScatterArrowKill;
    }

    @SerializedName("rank_best_scatter_arrow_kill_in_game")
    public String rankBestScatterArrowKillInGame;

    public void setRankBestScatterArrowKillInGame(String rankBestScatterArrowKillInGame) {
        this.rankBestScatterArrowKillInGame = rankBestScatterArrowKillInGame;
    }

    public String getRankBestScatterArrowKillInGame() {
        return rankBestScatterArrowKillInGame;
    }

    @SerializedName("rank_best_view_support_in_game")
    public String rankBestViewSupportInGame;

    public void setRankBestViewSupportInGame(String rankBestViewSupportInGame) {
        this.rankBestViewSupportInGame = rankBestViewSupportInGame;
    }

    public String getRankBestViewSupportInGame() {
        return rankBestViewSupportInGame;
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