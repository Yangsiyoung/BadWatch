package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Junkrat extends QuickCharacter{

    @SerializedName("quick_best_trapped_enemy_in_game")
    public String quickBestTrappedEnemyInGame;

    public void setQuickBestTrappedEnemyInGame(String quickBestTrappedEnemyInGame) {
        this.quickBestTrappedEnemyInGame = quickBestTrappedEnemyInGame;
    }

    public String getQuickBestTrappedEnemyInGame() {
        return quickBestTrappedEnemyInGame;
    }

    @SerializedName("quick_trapped_enemy")
    public String quickTrappedEnemy;

    public void setQuickTrappedEnemy(String quickTrappedEnemy) {
        this.quickTrappedEnemy = quickTrappedEnemy;
    }

    public String getQuickTrappedEnemy() {
        return quickTrappedEnemy;
    }

    @SerializedName("quick_best_riptire_kill_in_game")
    public String quickBestRiptireKillInGame;

    public void setQuickBestRiptireKillInGame(String quickBestRiptireKillInGame) {
        this.quickBestRiptireKillInGame = quickBestRiptireKillInGame;
    }

    public String getQuickBestRiptireKillInGame() {
        return quickBestRiptireKillInGame;
    }

    @SerializedName("quick_riptire_kill")
    public String quickRiptireKill;

    public void setQuickRiptireKill(String quickRiptireKill) {
        this.quickRiptireKill = quickRiptireKill;
    }

    public String getQuickRiptireKill() {
        return quickRiptireKill;
    }

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame) {
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame() {
        return quickBestMeleeLastShotInGame;
    }

    @SerializedName("quick_trapped_enemy_per_minute")
    public String quickTrappedEnemyPerMinute;

    public void setQuickTrappedEnemyPerMinute(String quickTrappedEnemyPerMinute) {
        this.quickTrappedEnemyPerMinute = quickTrappedEnemyPerMinute;
    }

    public String getQuickTrappedEnemyPerMinute() {
        return quickTrappedEnemyPerMinute;
    }

    @SerializedName("quick_environment_death")
    public String quickEnvironmentDeath;

    public void setQuickEnvironmentDeath(String quickEnvironmentDeath) {
        this.quickEnvironmentDeath = quickEnvironmentDeath;
    }

    public String getQuickEnvironmentDeath() {
        return quickEnvironmentDeath;
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