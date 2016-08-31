package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Hanzo extends QuickCharacter{

    @SerializedName("quick_dragonstrike_kill")
    public String quickDragonStrikeKill;

    public void setQuickDragonStrikeKill(String quickDragonStrikeKill) {
        this.quickDragonStrikeKill = quickDragonStrikeKill;
    }

    public String getQuickDragonStrikeKill() {
        return quickDragonStrikeKill;
    }

    @SerializedName("quick_best_dragonstrike_kill_in_game")
    public String quickBestDragonStrikeKillInGame;

    public void setQuickBestDragonStrikeKillInGame(String quickBestDragonStrikeKillInGame) {
        this.quickBestDragonStrikeKillInGame = quickBestDragonStrikeKillInGame;
    }

    public String getQuickBestDragonStrikeKillInGame() {
        return quickBestDragonStrikeKillInGame;
    }

    @SerializedName("quick_scatter_arrow_kill")
    public String quickScatterArrowKill;

    public void setQuickScatterArrowKill(String quickScatterArrowKill) {
        this.quickScatterArrowKill = quickScatterArrowKill;
    }

    public String getQuickScatterArrowKill() {
        return quickScatterArrowKill;
    }

    @SerializedName("quick_best_scatter_arrow_kill_in_game")
    public String quickBestScatterArrowKillInGame;

    public void setQuickBestScatterArrowKillInGame(String quickBestScatterArrowKillInGame) {
        this.quickBestScatterArrowKillInGame = quickBestScatterArrowKillInGame;
    }

    public String getQuickBestScatterArrowKillInGame() {
        return quickBestScatterArrowKillInGame;
    }

    @SerializedName("quick_best_view_support_in_game")
    public String quickBestViewSupportInGame;

    public void setQuickBestViewSupportInGame(String quickBestViewSupportInGame) {
        this.quickBestViewSupportInGame = quickBestViewSupportInGame;
    }

    public String getQuickBestViewSupportInGame() {
        return quickBestViewSupportInGame;
    }

    @SerializedName("quick_best_onecombo")
    public String quickBestOneCombo;

    public void setQuickBestOneCombo(String quickBestOneCombo) {
        this.quickBestOneCombo = quickBestOneCombo;
    }

    public String getQuickBestOneCombo() {
        return quickBestOneCombo;
    }

}