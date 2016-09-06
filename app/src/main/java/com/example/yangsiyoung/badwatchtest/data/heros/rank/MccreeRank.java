package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class MccreeRank extends RankCharacter{

    @SerializedName("rank_deadeye_kill")
    public String rankDeadEyeKill;

    public void setRankDeadEyeKill(String rankDeadEyeKill) {
        this.rankDeadEyeKill = rankDeadEyeKill;
    }

    public String getRankDeadEyeKill() {
        return rankDeadEyeKill;
    }

    @SerializedName("rank_best_deadeye_kill_in_game")
    public String rankBestDeadEyeKillInGame;

    public void setRankBestDeadEyeKillInGame(String rankBestDeadEyeKillInGame) {
        this.rankBestDeadEyeKillInGame = rankBestDeadEyeKillInGame;
    }

    public String getRankBestDeadEyeKillInGame() {
        return rankBestDeadEyeKillInGame;
    }

    @SerializedName("rank_fan_the_hammer_kill")
    public String rankFanTheHammerKill;

    public void setRankFanTheHammerKill(String rankFanTheHammerKill) {
        this.rankFanTheHammerKill = rankFanTheHammerKill;
    }

    public String getRankFanTheHammerKill() {
        return rankFanTheHammerKill;
    }

    @SerializedName("rank_ccbest_melee_lastshot_in_game")
    public String rankCcBestMeleeLastShotInGame;

    public void setRankCcBestMeleeLastShotInGame(String rankCcBestMeleeLastShotInGame) {
        this.rankCcBestMeleeLastShotInGame = rankCcBestMeleeLastShotInGame;
    }

    public String getRankCcBestMeleeLastShotInGame() {
        return rankCcBestMeleeLastShotInGame;
    }

    @SerializedName("rank_best_onecombo")
    public String rankBestOneCombo;

    public void setRankBestOneCombo(String rankBestOneCombo) {
        this.rankBestOneCombo = rankBestOneCombo;
    }

    public String getRankBestOneCombo() {
        return rankBestOneCombo;
    }

    @SerializedName("rank_best_fan_the_hammer_kill_in_game")
    public String rankBestFanTheHammerKillInGame;

    public void setRankBestFanTheHammerKillInGame(String rankBestFanTheHammerKillInGame) {
        this.rankBestFanTheHammerKillInGame = rankBestFanTheHammerKillInGame;
    }

    public String getRankBestFanTheHammerKillInGame() {
        return rankBestFanTheHammerKillInGame;
    }
}