package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class WidowmakerRank extends RankCharacter{

    @SerializedName("rank_venom_mine_kill")
    public String rankVenomMineKill;

    public void setRankVenomMineKill(String rankVenomMineKill) {
        this.rankVenomMineKill = rankVenomMineKill;
    }

    public String getRankVenomMineKill() {
        return rankVenomMineKill;
    }

    @SerializedName("rank_scoped_critical")
    public String rankScopedCritical;

    public void setRankScopedCritical(String rankScopedCritical) {
        this.rankScopedCritical = rankScopedCritical;
    }

    public String getRankScopedCritical() {
        return rankScopedCritical;
    }

    @SerializedName("rank_best_scoped_critical_in_game")
    public String rankBestScopedCriticalInGame;

    public void setRankBestScopedCriticalInGame(String rankBestScopedCriticalInGame) {
        this.rankBestScopedCriticalInGame = rankBestScopedCriticalInGame;
    }

    public String getRankBestScopedCriticalInGame() {
        return rankBestScopedCriticalInGame;
    }

    @SerializedName("rank_best_venom_mine_kill_in_game")
    public String rankBestVenomMineKillInGame;

    public void setRankBestVenomMineKillInGame(String rankBestVenomMineKillInGame) {
        this.rankBestVenomMineKillInGame = rankBestVenomMineKillInGame;
    }

    public String getRankBestVenomMineKillInGame() {
        return rankBestVenomMineKillInGame;
    }

    @SerializedName("rank_best_view_support_in_game")
    public String rankBestViewSupportInGame;

    public void setRankBestViewSupportInGame(String rankBestViewSupportInGame) {
        this.rankBestViewSupportInGame = rankBestViewSupportInGame;
    }

    public String getRankBestViewSupportInGame() {
        return rankBestViewSupportInGame;
    }

    @SerializedName("rank_best_scoped_accuracy_in_game")
    public String rankBestScopedAccuracyInGame;

    public void setRankBestScopedAccuracyInGame(String rankBestScopedAccuracyInGame) {
        this.rankBestScopedAccuracyInGame = rankBestScopedAccuracyInGame;
    }

    public String getRankBestScopedAccuracyInGame() {
        return rankBestScopedAccuracyInGame;
    }

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame) {
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame() {
        return rankBestMeleeLastShotInGame;
    }

    @SerializedName("rank_scoped_accuracy")
    public String rankScopedAccuracy;

    public void setRankScopedAccuracy(String rankScopedAccuracy) {
        this.rankScopedAccuracy = rankScopedAccuracy;
    }

    public String getRankScopedAccuracy() {
        return rankScopedAccuracy;
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