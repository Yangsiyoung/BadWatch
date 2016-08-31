package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Ana extends RankCharacter{

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame){
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame(){
        return rankBestMeleeLastShotInGame;
    }

    @SerializedName("rank_nano_boosts_applied")
    public String rankNanoBoostsApplied;

    public void setRankNanoBoostsApplied(String rankNanoBoostsApplied){
        this.rankNanoBoostsApplied = rankNanoBoostsApplied;
    }

    public String getRankNanoBoostsApplied(){
        return rankNanoBoostsApplied;
    }

    @SerializedName("rank_nano_boosts_support")
    public String rankNanoBoostsSupport;

    public void setRankNanoBoostsSupport(String rankNanoBoostsSupport){
        this.rankNanoBoostsSupport = rankNanoBoostsSupport;
    }

    public String getRankNanoBoostsSupport(){
        return rankNanoBoostsSupport;
    }

    @SerializedName("rank_best_nano_boosts_support_in_game")
    public String rankBestNanoBoostsSupportInGame;

    public void setRankBestNanoBoostsSupportInGame(String rankBestNanoBoostsSupportInGame){
        this.rankBestNanoBoostsSupportInGame = rankBestNanoBoostsSupportInGame;
    }

    public String getRankBestNanoBoostsSupportInGame(){
        return rankBestNanoBoostsSupportInGame;
    }

    @SerializedName("rank_unscoped_accuracy")
    public String rankUnscopedAccuracy;

    public void setRankUnscopedAccuracy(String rankUnscopedAccuracy){
        this.rankUnscopedAccuracy = rankUnscopedAccuracy;
    }

    public String getRankUnscopedAccuracy(){
        return rankUnscopedAccuracy;
    }

    @SerializedName("rank_scoped_accuracy")
    public String rankScopedAccuracy;

    public void setQuicScopedAccuracy(String rankScopedAccuracy){
        this.rankScopedAccuracy = rankScopedAccuracy;
    }

    public String getRankScopedAccuracy(){
        return rankScopedAccuracy;
    }

    @SerializedName("rank_best_onecombo")
    public String rankBestOneCombo;

    public void setRankBestOneCombo(String rankBestOneCombo){
        this.rankBestOneCombo = rankBestOneCombo;
    }

    public String getRankBestOneCombo(){
        return rankBestOneCombo;
    }

    @SerializedName("rank_defence_support")
    public String rankDefenceSupport;

    public void setRankDefenceSupport(String rankDefenceSupport){
        this.rankDefenceSupport = rankDefenceSupport;
    }

    public String getRankDefenceSupport(){
        return rankDefenceSupport;
    }

    @SerializedName("rank_enemy_slept")
    public String rankEnemySlept;

    public void setRankEnemySlept(String rankEnemySlept){
        this.rankEnemySlept = rankEnemySlept;
    }

    public String getRankEnemySlept(){
        return rankEnemySlept;
    }

    @SerializedName("rank_best_enemy_slept_in_game")
    public String rankBestEnemySleptInGame;

    public void setRankBestEnemySleptInGame(String rankBestEnemySleptInGame){
        this.rankBestEnemySleptInGame = rankBestEnemySleptInGame;
    }

    public String getRankBestEnemySleptInGame(){
        return rankBestEnemySleptInGame;
    }

}
