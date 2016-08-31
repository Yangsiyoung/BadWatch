package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Roadhog extends RankCharacter{

    @SerializedName("rank_best_hook_in_game")
    public String rankBestHookInGame;

    public void setRankBestHookInGame(String rankBestHookInGame) {
        this.rankBestHookInGame = rankBestHookInGame;
    }

    public String getRankBestHookInGame() {
        return rankBestHookInGame;
    }

    @SerializedName("rank_hook")
    public String rankHook;

    public void setRankHook(String rankHook) {
        this.rankHook = rankHook;
    }

    public String getRankHook() {
        return rankHook;
    }

    @SerializedName("rank_hook_attempted")
    public String rankHookAttempted;

    public void setRankHookAttempted(String rankHookAttempted) {
        this.rankHookAttempted = rankHookAttempted;
    }

    public String getRankHookAttempted() {
        return rankHookAttempted;
    }

    @SerializedName("rank_best_wholehog_kill_in_game")
    public String rankBestWholeHogKillInGame;

    public void setRankBestWholeHogKillInGame(String rankBestWholeHogKillInGame) {
        this.rankBestWholeHogKillInGame = rankBestWholeHogKillInGame;
    }

    public String getRankBestWholeHogKillInGame() {
        return rankBestWholeHogKillInGame;
    }

    @SerializedName("rank_wholehog_kill")
    public String rankWholeHogKill;

    public void setRankWholeHogKill(String rankWholeHogKill) {
        this.rankWholeHogKill = rankWholeHogKill;
    }

    public String getRankWholeHogKill() {
        return rankWholeHogKill;
    }

    @SerializedName("rank_best_hook_accuracy_in_game")
    public String rankBestHookAccuracyInGame;

    public void setRankBestHookAccuracyInGame(String rankBestHookAccuracyInGame) {
        this.rankBestHookAccuracyInGame = rankBestHookAccuracyInGame;
    }

    public String getRankBestHookAccuracyInGame() {
        return rankBestHookAccuracyInGame;
    }

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame) {
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame() {
        return rankBestMeleeLastShotInGame;
    }

    @SerializedName("rank_hook_accuracy")
    public String rankHookAccuracy;

    public void setRankHookAccuracy(String rankHookAccuracy) {
        this.rankHookAccuracy = rankHookAccuracy;
    }

    public String getRankHookAccuracy() {
        return rankHookAccuracy;
    }

    @SerializedName("rank_best_onecombo")
    public String rankBestOneCombo;

    public void setRankBestOneCombo(String rankBestOneCombo){
        this.rankBestOneCombo = rankBestOneCombo;
    }

    public String getRankBestOneCombo(){
        return  rankBestOneCombo;
    }
}