package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class WinstonRank extends RankCharacter{

    @SerializedName("rank_knocked_back")
    public String rankKnockedBack;

    public void setRankKnockedBack(String rankKnockedBack) {
        this.rankKnockedBack = rankKnockedBack;
    }

    public String getRankKnockedBack() {
        return rankKnockedBack;
    }

    @SerializedName("rank_damage_blocked")
    public String rankDamageBlocked;

    public void setRankDamageBlocked(String rankDamageBlocked) {
        this.rankDamageBlocked = rankDamageBlocked;
    }

    public String getRankDamageBlocked() {
        return rankDamageBlocked;
    }

    @SerializedName("rank_best_damage_blocked_in_game")
    public String rankBestDamageBlockedInGame;

    public void setRankBestDamageBlockedInGame(String rankBestDamageBlockedInGame) {
        this.rankBestDamageBlockedInGame = rankBestDamageBlockedInGame;
    }

    public String getRankBestDamageBlockedInGame() {
        return rankBestDamageBlockedInGame;
    }

    @SerializedName("rank_best_knocked_back_in_game")
    public String rankBestKnockedBackInGame;

    public void setRankBestKnockedBackInGame(String rankBestKnockedBackInGame) {
        this.rankBestKnockedBackInGame = rankBestKnockedBackInGame;
    }

    public String getRankBestKnockedBackInGame() {
        return rankBestKnockedBackInGame;
    }

    @SerializedName("rank_melee_kill")
    public String rankMeleeKill;

    public void setRankMeleeKill(String rankMeleeKill) {
        this.rankMeleeKill = rankMeleeKill;
    }

    public String getRankMeleeKill() {
        return rankMeleeKill;
    }

    @SerializedName("rank_best_melee_kill_in_game")
    public String rankBestMeleeKillInGame;

    public void setRankBestMeleeKillInGame(String rankBestMeleeKillInGame) {
        this.rankBestMeleeKillInGame = rankBestMeleeKillInGame;
    }

    public String getRankBestMeleeKillInGame() {
        return rankBestMeleeKillInGame;
    }

    @SerializedName("rank_jump_pack_kill")
    public String rankJumpPackKill;

    public void setRankJumpPackKill(String rankJumpPackKill) {
        this.rankJumpPackKill = rankJumpPackKill;
    }

    public String getRankJumpPackKill() {
        return rankJumpPackKill;
    }

    @SerializedName("rank_best_jump_pack_kill_in_game")
    public String rankBestJumpPackKillInGame;

    public void setRankBestJumpPackKillInGame(String rankBestJumpPackKillInGame) {
        this.rankBestJumpPackKillInGame = rankBestJumpPackKillInGame;
    }

    public String getRankBestJumpPackKillInGame() {
        return rankBestJumpPackKillInGame;
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

    @SerializedName("rank_primal_rage_kill")
    public String rankPrimalRageKill;

    public void setRankPrimalRageKill(String rankPrimalRageKill) {
        this.rankPrimalRageKill = rankPrimalRageKill;
    }

    public String getRankPrimalRageKill() {
        return rankPrimalRageKill;
    }

    @SerializedName("rank_best_primal_rage_kill_in_game")
    public String rankBestPrimalRageKillInGame;

    public void setRankBestPrimalRageKillInGame(String rankBestPrimalRageKillInGame) {
        this.rankBestPrimalRageKillInGame = rankBestPrimalRageKillInGame;
    }

    public String getRankBestPrimalRageKillInGame() {
        return rankBestPrimalRageKillInGame;
    }
}