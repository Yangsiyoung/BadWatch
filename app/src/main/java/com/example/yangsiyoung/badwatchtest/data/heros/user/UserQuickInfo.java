package com.example.yangsiyoung.badwatchtest.data.heros.user;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class UserQuickInfo implements Serializable{

    @SerializedName("user_id")
    public String userId;

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserId(){
        return userId;
    }

    @SerializedName("name")
    public String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @SerializedName("battletag")
    public String battleTag;

    public void setBattleTag(String battleTag){
        this.battleTag = battleTag;
    }

    public String getBattleTag(){
        return battleTag;
    }

    @SerializedName("level")
    public String level;

    public void setLevel(String level){
        this.level = level;
    }

    public String getLevel(){
        return level;
    }

    @SerializedName("avatar")
    public String avatarUrl;

    public void setAvatarUrl(String avatarUrl){
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl(){
        return avatarUrl;
    }

    @SerializedName("point")
    public String point;

    public void setPoint(String point){
        this.point = point;
    }

    public String getPoint(){
        return point;
    }

    @SerializedName("overwatch_id")
    public String overWatchId;

    public void setOverWatchId(String overWatchId){
        this.overWatchId = overWatchId;
    }

    public String getOverWatchId(){
        return overWatchId;
    }

    @SerializedName("quick_melee_lastshot")
    public String quickMeleeLastShot;

    public void setQuickMeleeLastShot(String quickMeleeLastShot){
        this.quickMeleeLastShot = quickMeleeLastShot;
    }

    public String getQuickMeleeLastShot(){
        return quickMeleeLastShot;
    }

    @SerializedName("quick_solo_kill")
    public String quickSoloKill;

    public void setQuickSoloKill(String quickSoloKill){
        this.quickSoloKill = quickSoloKill;
    }

    public String getQuickSoloKill(){
        return quickSoloKill;
    }

    @SerializedName("quick_mission_kill")
    public String quickMissionKill;

    public void setQuickMissionKill(String quickMissionKill){
        this.quickMissionKill = quickMissionKill;
    }

    public String getQuickMissionKill(){
        return quickMissionKill;
    }

    @SerializedName("quick_lastshot")
    public String quickLastShot;

    public void setQuickLastShot(String quickLastShot){
        this.quickLastShot = quickLastShot;
    }

    public String getQuickLastShot(){
        return quickLastShot;
    }

    @SerializedName("quick_deal")
    public String quickDeal;

    public void setQuickDeal(String quickDeal){
        this.quickDeal = quickDeal;
    }

    public String getQuickDeal(){
        return quickDeal;
    }

    @SerializedName("quick_kill")
    public String quickKill;

    public void setQuickKill(String quickKill){
        this.quickKill = quickKill;
    }

    public String getQuickKill(){
        return quickKill;
    }

    @SerializedName("quick_environment_kill")
    public String quickEnvironmentKill;

    public void setQuickEnvironmentKill(String quickEnvironmentKill){
        this.quickEnvironmentKill = quickEnvironmentKill;
    }

    public String getQuickEnvironmentKill(){
        return quickEnvironmentKill;
    }

    @SerializedName("quick_onecombo")
    public String quickOneCombo;

    public void setQuickOneCombo(String quickOneCombo){
        this.quickOneCombo = quickOneCombo;
    }

    public String getQuickOneCombo(){
        return quickOneCombo;
    }

    @SerializedName("quick_heal")
    public String quickHeal;

    public void setQuickHeal(String quickHeal){
        this.quickHeal = quickHeal;
    }

    public String getQuickHeal(){
        return quickHeal;
    }

    @SerializedName("quick_view_support")
    public String quickViewSupport;

    public void setQuickViewSupport(String quickViewSupport){
        this.quickViewSupport = quickViewSupport;
    }

    public String getQuickViewSupport(){
        return quickViewSupport;
    }

    @SerializedName("quick_destroy_teleport")
    public String quickDestroyTeleport;

    public void setQuickDestroyTeleport(String quickDestroyTeleport){
        this.quickDestroyTeleport = quickDestroyTeleport;
    }

    public String getQuickDestroyTeleport(){
        return quickDestroyTeleport;
    }

    @SerializedName("quick_most_kill")
    public String quickMostKill;

    public void setQuickMostKill(String quickMostKill){
        this.quickMostKill = quickMostKill;
    }

    public String getQuickMostKill(){
        return quickMostKill;
    }

    @SerializedName("quick_most_lastshot")
    public String quickMostLastShot;

    public void setQuickMostLastShot(String quickMostLastShot){
        this.quickMostLastShot = quickMostLastShot;
    }

    public String getQuickMostLastShot(){
        return quickMostLastShot;
    }

    @SerializedName("quick_most_deal")
    public String quickMostDeal;

    public void setQuickMostDeal(String quickMostDeal){
        this.quickMostDeal = quickMostDeal;
    }

    public String getQuickMostDeal(){
        return quickMostDeal;
    }

    @SerializedName("quick_most_heal")
    public String quickMostHeal;

    public void setQuickMostHeal(String quickMostHeal){
        this.quickMostHeal = quickMostHeal;
    }

    public String getQuickMostHeal(){
        return quickMostHeal;
    }

    @SerializedName("quick_best_defence_support")
    public String quickBestDefenceSupport;

    public void setQuickBestDefenceSupport(String quickBestDefenceSupport){
        this.quickBestDefenceSupport = quickBestDefenceSupport;
    }

    public String getQuickBestDefenceSupport(){
        return quickBestDefenceSupport;
    }

    @SerializedName("quick_best_attack_support")
    public String quickBestAttackSupport;

    public void setQuickBestAttackSupport(String quickBestAttackSupport){
        this.quickBestAttackSupport = quickBestAttackSupport;
    }

    public String getQuickBestAttackSupport(){
        return quickBestAttackSupport;
    }

    @SerializedName("quick_most_mission_kill")
    public String quickMostMissionKill;

    public void setQuickMostMissionKill(String quickMostMissionKill){
        this.quickMostMissionKill = quickMostMissionKill;
    }

    public String getQuickMostMissionKill(){
        return quickMostMissionKill;
    }

    @SerializedName("quick_most_mission_time")
    public String quickMostMissionTime;

    public void setQuickMostMissionTime(String quickMostMissionTime){
        this.quickMostMissionTime = quickMostMissionTime;
    }

    public String getQuickMostMissionTime(){
        return quickMostMissionTime;
    }

    @SerializedName("quick_most_onecombo")
    public String quickMostOneCombo;

    public void setQuickMostOneCombo(String quickMostOneCombo){
        this.quickMostOneCombo = quickMostOneCombo;
    }

    public String getQuickMostOneCombo(){
        return quickMostOneCombo;
    }

    @SerializedName("quick_most_solo_kill")
    public String quickMostSoloKill;

    public void setQuickMostSoloKill(String quickMostSoloKill){
        this.quickMostSoloKill = quickMostSoloKill;
    }

    public String getQuickMostSoloKill(){
        return quickMostSoloKill;
    }

    @SerializedName("quick_most_flood_time")
    public String quickMostFloodTime;

    public void setQuickMostFloodTime(String quickMostFloodTime){
        this.quickMostFloodTime = quickMostFloodTime;
    }

    public String getQuickMostFloodTime(){
        return quickMostFloodTime;
    }

    @SerializedName("quick_death")
    public String quickDeath;

    public void setQuickDeath(String quickDeath){
        this.quickDeath = quickDeath;
    }

    public String getQuickDeath(){
        return quickDeath;
    }

    @SerializedName("quick_environment_death")
    public String quickEnvironmentDeath;

    public void setQuickEnvironmentDeath(String quickEnvironmentDeath){
        this.quickEnvironmentDeath = quickEnvironmentDeath;
    }

    public String getQuickEnvironmentDeath(){
        return quickEnvironmentDeath;
    }

    @SerializedName("quick_card")
    public String quickCard;

    public void setQuickCard(String quickCard){
        this.quickCard = quickCard;
    }

    public String getQuickCard(){
        return quickCard;
    }

    @SerializedName("quick_gold_medal")
    public String quickGoldMedal;

    public void setQuickGoldMedal(String quickGoldMedal){
        this.quickGoldMedal = quickGoldMedal;
    }

    public String getQuickGoldMedal(){
        return quickGoldMedal;
    }

    @SerializedName("quick_silver_medal")
    public String quickSilverMedal;

    public void setQuickSilverMedal(String quickSilverMedal){
        this.quickSilverMedal = quickSilverMedal;
    }

    public String getQuickSilverMedal(){
        return quickSilverMedal;
    }

    @SerializedName("quick_bronze_medal")
    public String quickBronzeMedal;

    public void setQuickBronzeMedal(String quickBronzeMedal){
        this.quickBronzeMedal = quickBronzeMedal;
    }

    public String getQuickBronzeMedal(){
        return quickBronzeMedal;
    }

    @SerializedName("quick_win")
    public String quickWin;

    public void setQuickWin(String quickWin){
        this.quickWin = quickWin;
    }

    public String getQuickWin(){
        return quickWin;
    }

    @SerializedName("quick_game_count")
    public String quickGameCount;

    public void setQuickGameCount(String quickGameCount){
        this.quickGameCount = quickGameCount;
    }

    public String getQuickGameCount(){
        return quickGameCount;
    }

    @SerializedName("quick_flood_time")
    public String quickFloodTime;

    public void setQuickFloodTime(String quickFloodTime){
        this.quickFloodTime = quickFloodTime;
    }

    public String getQuickFloodTime(){
        return quickFloodTime;
    }

    @SerializedName("quick_mission_time")
    public String quickMissionTime;

    public void setQuickMissionTime(String quickMissionTime){
        this.quickMissionTime = quickMissionTime;
    }

    public String getQuickMissionTime(){
        return quickMissionTime;
    }

    @SerializedName("quick_playtime")
    public String quickPlayTime;

    public void setQuickPlayTime(String quickPlayTime){
        this.quickPlayTime = quickPlayTime;
    }

    public String getQuickPlayTime(){
        return quickPlayTime;
    }

    @SerializedName("quick_most_melee_lastshot")
    public String quickMostMeleeLastShot;

    public void setQuickMostMeleeLastShot(String quickMostMeleeLastShot){
        this.quickMostMeleeLastShot = quickMostMeleeLastShot;
    }

    public String getQuickMostMeleeLastShot(){
        return quickMostMeleeLastShot;
    }

    @SerializedName("quick_defence_support")
    public String quickDefenceSupport;

    public void setQuickDefenceSupport(String quickDefenceSupport){
        this.quickDefenceSupport = quickDefenceSupport;
    }

    public String getQuickDefenceSupport(){
        return quickDefenceSupport;
    }

    @SerializedName("quick_attack_support")
    public String quickAttackSupport;

    public void setQuickAttackSupport(String quickAttackSupport){
        this.quickAttackSupport = quickAttackSupport;
    }

    public String getQuickAttackSupport(){
        return quickAttackSupport;
    }

    @SerializedName("reputation")
    public String quickReputation;

    public void setQuickReputation(String quickReputation){
        this.quickReputation = quickReputation;
    }

    public String getQuickReputation(){
        return quickReputation;
    }


    @SerializedName("quick_reaper_kill")
    public String quickReaperkill;

    public void setQuickReaperkill(String quickReaperkill){
        this.quickReaperkill = quickReaperkill;
    }

    public String getQuickReaperkill(){
        return quickReaperkill;
    }

    @SerializedName("quick_reaper_death")
    public String quickReaperDeath;

    public void setQuickReaperDeath(String quickReaperDeath){
        this.quickReaperDeath = quickReaperDeath;
    }

    public String getQuickReaperDeath(){
        return quickReaperDeath;
    }

    @SerializedName("quick_reaper_win")
    public String quickReaperWin;

    public void setQuickReaperWin(String quickReaperWin){
        this.quickReaperWin = quickReaperWin;
    }

    public String getQuickReaperWin(){
        return quickReaperWin;
    }

    @SerializedName("quick_reaper_game_count")
    public String quickReaperGameCount;

    public void setQuickReaperGameCount(String quickReaperGameCount){
        this.quickReaperGameCount = quickReaperGameCount;
    }

    public String getQuickReaperGameCount(){
        return quickReaperGameCount;
    }

    @SerializedName("quick_reaper_playtime")
    public String quickReaperPlayTime;

    public void setQuickReaperPlayTime(String quickReaperPlayTime){
        this.quickReaperPlayTime = quickReaperPlayTime;
    }

    public String getQuickReaperPlayTime(){
        return quickReaperPlayTime;
    }

    @SerializedName("quick_tracer_kill")
    public String quickTracerKill;

    public void setQuickTracerKill(String quickTracerKill){
        this.quickTracerKill = quickTracerKill;
    }

    public String getQuickTracerKill(){
        return quickTracerKill;
    }

    @SerializedName("quick_tracer_death")
    public String quickTracerDeath;

    public void setQuickTracerDeath(String quickTracerDeath){
        this.quickTracerDeath = quickTracerDeath;
    }

    public String getQuickTracerDeath(){
        return quickTracerDeath;
    }

    @SerializedName("quick_tracer_win")
    public String quickTracerWin;

    public void setQuickTracerWin(String quickTracerWin){
        this.quickTracerWin = quickTracerWin;
    }

    public String getQuickTracerWin(){
        return quickTracerWin;
    }

    @SerializedName("quick_tracer_game_count")
    public String quickTracerGameCount;

    public void setQuickTracerGameCount(String quickTracerGameCount){
        this.quickTracerGameCount = quickTracerGameCount;
    }

    public String getQuickTracerGameCount(){
        return quickTracerGameCount;
    }

    @SerializedName("quick_tracer_playtime")
    public String quickTracerPlayTime;

    public void setQuickTracerPlayTime(String quickTracerPlayTime){
        this.quickTracerPlayTime = quickTracerPlayTime;
    }

    public String getQuickTracerPlayTime(){
        return quickTracerPlayTime;
    }

    @SerializedName("quick_mercy_kill")
    public String quickMercyKill;

    public void setQuickMercyKill(String quickMercyKill){
        this.quickMercyKill = quickMercyKill;
    }

    public String getQuickMercyKill(){
        return quickMercyKill;
    }

    @SerializedName("quick_mercy_death")
    public String quickMercyDeath;

    public void setQuickMercyDeath(String quickMercyDeath){
        this.quickMercyDeath = quickMercyDeath;
    }

    public String getQuickMercyDeath(){
        return quickMercyDeath;
    }

    @SerializedName("quick_mercy_win")
    public String quickMercyWin;

    public void setQuickMercyWin(String quickMercyWin){
        this.quickMercyWin = quickMercyWin;
    }

    public String getQuickMercyWin(){
        return quickMercyWin;
    }

    @SerializedName("quick_mercy_game_count")
    public String quickMercyGameCount;

    public void setQuickMercyGameCount(String quickMercyGameCount){
        this.quickMercyGameCount = quickMercyGameCount;
    }

    public String getQuickMercyGameCount(){
        return quickMercyGameCount;
    }
    @SerializedName("quick_mercy_playtime")
    public String quickMercyPlayTime;

    public void setQuickMercyPlayTime(String quickMercyPlayTime){
        this.quickMercyPlayTime = quickMercyPlayTime;
    }

    public String getQuickMercyPlayTime(){
        return quickMercyPlayTime;
    }

    @SerializedName("quick_hanzo_kill")
    public String quickHanzoKill;

    public void setQuickHanzoKill(String quickHanzoKill){
        this.quickHanzoKill = quickHanzoKill;
    }

    public String getQuickHanzoKill(){
        return quickHanzoKill;
    }

    @SerializedName("quick_hanzo_death")
    public String quickHanzoDeath;

    public void setQuickHanzoDeath(String quickHanzoDeath){
        this.quickHanzoDeath = quickHanzoDeath;
    }

    public String getQuickHanzoDeath(){
        return quickHanzoDeath;
    }

    @SerializedName("quick_hanzo_win")
    public String quickHanzoWin;

    public void setQuickHanzoWin(String quickHanzoWin){
        this.quickHanzoWin = quickHanzoWin;
    }

    public String getQuickHanzoWin(){
        return quickHanzoWin;
    }

    @SerializedName("quick_hanzo_game_count")
    public String quickHanzoGameCount;

    public void setQuickHanzoGameCount(String quickHanzoGameCount){
        this.quickHanzoGameCount = quickHanzoGameCount;
    }

    public String getQuickHanzoGameCount(){
        return quickHanzoGameCount;
    }

    @SerializedName("quick_hanzo_playtime")
    public String quickHanzoPlayTime;

    public void setQuickHanzoPlayTime(String quickHanzoPlayTime){
        this.quickHanzoPlayTime = quickHanzoPlayTime;
    }

    public String getQuickHanzoPlayTime(){
        return quickHanzoPlayTime;
    }

    @SerializedName("quick_torbjon_kill")
    public String quickTorbjonKill;

    public void setQuickTorbjonKill(String quickTorbjonKill){
        this.quickTorbjonKill = quickTorbjonKill;
    }

    public String getQuickTorbjonKill(){
        return quickTorbjonKill;
    }

    @SerializedName("quick_torbjon_death")
    public String quickTorbjonDeath;

    public void setQuickTorbjonDeath(String quickTorbjonDeath){
        this.quickTorbjonDeath = quickTorbjonDeath;
    }

    public String getQuickTorbjonDeath(){
        return quickTorbjonDeath;
    }

    @SerializedName("quick_torbjon_win")
    public String quickTorbjonWin;

    public void setQuickTorbjonWin(String quickTorbjonWin){
        this.quickTorbjonWin = quickTorbjonWin;
    }

    public String getQuickTorbjonWin(){
        return quickTorbjonWin;
    }

    @SerializedName("quick_torbjon_game_count")
    public String quickTorbjonGameCount;

    public void setQuickTorbjonGameCount(String quickTorbjonGameCount){
        this.quickTorbjonGameCount = quickTorbjonGameCount;
    }

    public String getQuickTorbjonGameCount(){
        return quickTorbjonGameCount;
    }

    @SerializedName("quick_torbjon_playtime")
    public String quickTorbjonPlayTime;

    public void setQuickTorbjonPlayTime(String quickTorbjonPlayTime){
        this.quickTorbjonPlayTime = quickTorbjonPlayTime;
    }

    public String getQuickTorbjonPlayTime(){
        return quickTorbjonPlayTime;
    }

    @SerializedName("quick_reinhardt_kill")
    public String quickReinhardtKill;

    public void setQuickReinhardtKill(String quickReinhardtKill){
        this.quickReinhardtKill = quickReinhardtKill;
    }

    public String getQuickReinhardtKill(){
        return quickReinhardtKill;
    }

    @SerializedName("quick_reinhardt_death")
    public String quickReinhardtDeath;

    public void setQuickReinhardtDeath(String quickReinhardtDeath){
        this.quickReinhardtDeath = quickReinhardtDeath;
    }

    public String getQuickReinhardtDeath(){
        return quickReinhardtDeath;
    }

    @SerializedName("quick_reinhardt_win")
    public String quickReinhardtWin;

    public void setQuickReinhardtWin(String quickReinhardtWin){
        this.quickReinhardtWin = quickReinhardtWin;
    }

    public String getQuickReinhardtWin(){
        return quickReinhardtWin;
    }

    @SerializedName("quick_reinhardt_game_count")
    public String quickReinhardtGameCount;

    public void setQuickReinhardtGameCount(String quickReinhardtGameCount){
        this.quickReinhardtGameCount = quickReinhardtGameCount;
    }

    public String getQuickReinhardtGameCount(){
        return quickReinhardtGameCount;
    }

    @SerializedName("quick_reinhardt_playtime")
    public String quickReinhardtPlayTime;

    public void setQuickReinhardtPlayTime(String quickReinhardtPlayTime){
        this.quickReinhardtPlayTime = quickReinhardtPlayTime;
    }

    public String getQuickReinhardtPlayTime(){
        return quickReinhardtPlayTime;
    }

    @SerializedName("quick_pharah_kill")
    public String quickPharahKill;

    public void setQuickPharahKill(String quickPharahKill){
        this.quickPharahKill = quickPharahKill;
    }

    public String getQuickPharahKill(){
        return quickPharahKill;
    }

    @SerializedName("quick_pharah_death")
    public String quickPharahDeath;

    public void setQuickPharahDeath(String quickPharahDeath){
        this.quickPharahDeath = quickPharahDeath;
    }

    public String getQuickPharahDeath(){
        return quickPharahDeath;
    }

    @SerializedName("quick_pharah_win")
    public String quickPharahWin;

    public void setQuickPharahWin(String quickPharahWin){
        this.quickPharahWin = quickPharahWin;
    }

    public String getQuickPharahWin(){
        return quickPharahWin;
    }

    @SerializedName("quick_pharah_game_count")
    public String quickPharahGameCount;

    public void setQuickPharahGameCount(String quickPharahGameCount){
        this.quickPharahGameCount = quickPharahGameCount;
    }

    public String getQuickPharahGameCount(){
        return quickPharahGameCount;
    }

    @SerializedName("quick_pharah_playtime")
    public String quickPharahPlayTime;

    public void setQuickPharahPlayTime(String quickPharahPlayTime){
        this.quickPharahPlayTime = quickPharahPlayTime;
    }

    public String getQuickPharahPlayTimeo(){
        return quickPharahPlayTime;
    }

    @SerializedName("quick_winston_kill")
    public String quickWinstonKill;

    public void setQuickWinstonKill(String quickWinstonKill){
        this.quickWinstonKill = quickWinstonKill;
    }

    public String getQuickWinstonKill(){
        return quickWinstonKill;
    }

    @SerializedName("quick_winston_death")
    public String quickWinstonDeath;

    public void setQuickWinstonDeath(String quickWinstonDeath){
        this.quickWinstonDeath = quickWinstonDeath;
    }

    public String getQuickWinstonDeath(){
        return quickWinstonDeath;
    }

    @SerializedName("quick_winston_win")
    public String quickWinstonWin;

    public void setQuickWinstonWin(String quickWinstonWin){
        this.quickWinstonWin = quickWinstonWin;
    }

    public String getQuickWinstonWin(){
        return quickWinstonWin;
    }

    @SerializedName("quick_winston_game_count")
    public String quickWinstonGameCount;

    public void setQuickWinstonGameCount(String quickWinstonGameCount){
        this.quickWinstonGameCount = quickWinstonGameCount;
    }

    public String getQuickWinstonGameCount(){
        return quickWinstonGameCount;
    }

    @SerializedName("quick_winston_playtime")
    public String quickWinstonPlayTime;

    public void setQuickWinstonPlayTime(String quickWinstonPlayTime){
        this.quickWinstonPlayTime = quickWinstonPlayTime;
    }

    public String getQuickWinstonPlayTime(){
        return quickWinstonPlayTime;
    }

    @SerializedName("quick_widowmaker_kill")
    public String quickWidowmakerKill;

    public void setQuickWidowmakerKill(String quickWidowmakerKill){
        this.quickWidowmakerKill = quickWidowmakerKill;
    }

    public String getQuickWidowmakerKill(){
        return quickWidowmakerKill;
    }

    @SerializedName("quick_widowmaker_death")
    public String quickWidowmakerDeath;

    public void setQuickWidowmakerDeath(String quickWidowmakerDeath){
        this.quickWidowmakerDeath = quickWidowmakerDeath;
    }

    public String getQuickWidowmakerDeath(){
        return quickWidowmakerDeath;
    }

    @SerializedName("quick_widowmaker_win")
    public String quickWidowmakerWin;

    public void setQuickWidowmakerWin(String quickWidowmakerWin){
        this.quickWidowmakerWin = quickWidowmakerWin;
    }

    public String getQuickWidowmakerWin(){
        return quickWidowmakerWin;
    }

    @SerializedName("quick_widowmaker_game_count")
    public String quickWidowmakerGameCount;

    public void setQuickWidowmakerGameCount(String quickWidowmakerGameCount){
        this.quickWidowmakerGameCount = quickWidowmakerGameCount;
    }

    public String getQuickWidowmakerGameCount(){
        return quickWidowmakerGameCount;
    }

    @SerializedName("quick_widowmaker_playtime")
    public String quickWidowmakerPlayTime;

    public void setQuickWidowmakerPlayTime(String quickWidowmakerPlayTime){
        this.quickWidowmakerPlayTime = quickWidowmakerPlayTime;
    }

    public String getQuickWidowmakerPlayTime(){
        return quickWidowmakerPlayTime;
    }

    @SerializedName("quick_bastion_kill")
    public String quickBastionKill;

    public void setQuickBastionKill(String quickBastionKill){
        this.quickBastionKill = quickBastionKill;
    }

    public String getQuickBastionKill(){
        return quickBastionKill;
    }

    @SerializedName("quick_bastion_death")
    public String quickBastionDeath;

    public void setQuickBastionDeath(String quickBastionDeath){
        this.quickBastionDeath = quickBastionDeath;
    }

    public String getQuickBastionDeath(){
        return quickBastionDeath;
    }

    @SerializedName("quick_bastion_win")
    public String quickBastionWin;

    public void setQuickBastionWin(String quickBastionWin){
        this.quickBastionWin = quickBastionWin;
    }

    public String getQuickBastionWin(){
        return quickBastionWin;
    }

    @SerializedName("quick_bastion_game_count")
    public String quickBastionGameCount;

    public void setQuickBastionGameCount(String quickBastionGameCount){
        this.quickBastionGameCount = quickBastionGameCount;
    }

    public String getQuickBastionGameCount(){
        return quickBastionGameCount;
    }

    @SerializedName("quick_bastion_playtime")
    public String quickBastionPlayTime;

    public void setQuickBastionPlayTime(String quickBastionPlayTime){
        this.quickBastionPlayTime = quickBastionPlayTime;
    }

    public String getQuickBastionPlayTime(){
        return quickBastionPlayTime;
    }

    @SerializedName("quick_symmetra_kill")
    public String quickSymmetraKill;

    public void setQuickSymmetraKill(String quickSymmetraKill){
        this.quickSymmetraKill = quickSymmetraKill;
    }

    public String getQuickSymmetraKill(){
        return quickSymmetraKill;
    }

    @SerializedName("quick_symmetra_death")
    public String quickSymmetraDeath;

    public void setQuickSymmetraDeath(String quickSymmetraDeath){
        this.quickSymmetraDeath = quickSymmetraDeath;
    }

    public String getQuickSymmetraDeath(){
        return quickSymmetraDeath;
    }

    @SerializedName("quick_symmetra_win")
    public String quickSymmetraWin;

    public void setQuickSymmetraWin(String quickSymmetraWin){
        this.quickSymmetraWin = quickSymmetraWin;
    }

    public String getQuickSymmetraWin(){
        return quickSymmetraWin;
    }

    @SerializedName("quick_symmetra_game_count")
    public String quickSymmetraGameCount;

    public void setQuickSymmetraGameCount(String quickSymmetraGameCount){
        this.quickSymmetraGameCount = quickSymmetraGameCount;
    }

    public String getQuickSymmetraGameCount(){
        return quickSymmetraGameCount;
    }

    @SerializedName("quick_symmetra_playtime")
    public String quickSymmetraPlayTime;

    public void setQuickSymmetraPlayTime(String quickSymmetraPlayTime){
        this.quickSymmetraPlayTime = quickSymmetraPlayTime;
    }

    public String getQuickSymmetraPlayTime(){
        return quickSymmetraPlayTime;
    }

    @SerializedName("quick_zenyatta_kill")
    public String quickZenyattaKill;

    public void setQuickZenyattaKill(String quickZenyattaKill){
        this.quickZenyattaKill = quickZenyattaKill;
    }

    public String getQuickZenyattaKill(){
        return quickZenyattaKill;
    }

    @SerializedName("quick_zenyatta_death")
    public String quickZenyattaDeath;

    public void setQuickZenyattaDeath(String quickZenyattaDeath){
        this.quickZenyattaDeath = quickZenyattaDeath;
    }

    public String getQuickZenyattaDeath(){
        return quickZenyattaDeath;
    }

    @SerializedName("quick_zenyatta_win")
    public String quickZenyattaWin;

    public void setQuickZenyattaWin(String quickZenyattaWin){
        this.quickZenyattaWin = quickZenyattaWin;
    }

    public String getQuickZenyattaWin(){
        return quickZenyattaWin;
    }

    @SerializedName("quick_zenyatta_game_count")
    public String quickZenyattaGameCount;

    public void setQuickZenyattaGameCount(String quickZenyattaGameCount){
        this.quickZenyattaGameCount = quickZenyattaGameCount;
    }

    public String getQuickZenyattaGameCount(){
        return quickZenyattaGameCount;
    }

    @SerializedName("quick_zenyatta_playtime")
    public String quickZenyattaPlayTime;

    public void setQuickZenyattaPlayTime(String quickZenyattaPlayTime){
        this.quickZenyattaPlayTime = quickZenyattaPlayTime;
    }

    public String getQuickZenyattaPlayTime(){
        return quickZenyattaPlayTime;
    }

    @SerializedName("quick_genji_kill")
    public String quickGenjiKill;

    public void setQuickGenjiKill(String quickGenjiKill){
        this.quickGenjiKill = quickGenjiKill;
    }

    public String getQuickGenjiKill(){
        return quickGenjiKill;
    }

    @SerializedName("quick_genji_death")
    public String quickGenjiDeath;

    public void setQuickGenjiDeath(String quickGenjiDeath){
        this.quickGenjiDeath = quickGenjiDeath;
    }

    public String getQuickGenjiDeath(){
        return quickGenjiDeath;
    }

    @SerializedName("quick_genji_win")
    public String quickGenjiWin;

    public void setQuickGenjiWin(String quickGenjiWin){
        this.quickGenjiWin = quickGenjiWin;
    }

    public String getQuickGenjiWin(){
        return quickGenjiWin;
    }

    @SerializedName("quick_genji_game_count")
    public String quickGenjiGameCount;

    public void setQuickGenjiGameCount(String quickGenjiGameCount){
        this.quickGenjiGameCount = quickGenjiGameCount;
    }

    public String getQuickGenjiGameCount(){
        return quickGenjiGameCount;
    }

    @SerializedName("quick_genji_playtime")
    public String quickGenjiPlayTime;

    public void setQuickGenjiPlayTime(String quickGenjiPlayTime){
        this.quickGenjiPlayTime = quickGenjiPlayTime;
    }

    public String getQuickGenjiPlayTime(){
        return quickGenjiPlayTime;
    }

    @SerializedName("quick_roadhog_kill")
    public String quickRoadhogKill;

    public void setQuickRoadhogKill(String quickRoadhogKill){
        this.quickRoadhogKill = quickRoadhogKill;
    }

    public String getQuickRoadhogKill(){
        return quickRoadhogKill;
    }

    @SerializedName("quick_roadhog_death")
    public String quickRoadhogDeath;

    public void setQuickRoadhogDeath(String quickRoadhogDeath){
        this.quickRoadhogDeath = quickRoadhogDeath;
    }

    public String getQuickRoadhogDeath(){
        return quickRoadhogDeath;
    }

    @SerializedName("quick_roadhog_win")
    public String quickRoadhogWin;

    public void setQuickRoadhogWin(String quickRoadhogWin){
        this.quickRoadhogWin = quickRoadhogWin;
    }

    public String getQuickRoadhogWin(){
        return quickRoadhogWin;
    }

    @SerializedName("quick_roadhog_game_count")
    public String quickRoadhogGameCount;

    public void setQuickRoadhogGameCount(String quickRoadhogGameCount){
        this.quickRoadhogGameCount = quickRoadhogGameCount;
    }

    public String getQuickRoadhogGameCount(){
        return quickRoadhogGameCount;
    }

    @SerializedName("quick_roadhog_playtime")
    public String quickRoadhogPlayTime;

    public void setQuickRoadhogPlayTime(String quickRoadhogPlayTime){
        this.quickRoadhogPlayTime = quickRoadhogPlayTime;
    }

    public String getQuickRoadhogPlayTime(){
        return quickRoadhogPlayTime;
    }

    @SerializedName("quick_mccree_kill")
    public String quickMccreeKill;

    public void setQuickMccreeKill(String quickMccreeKill){
        this.quickMccreeKill = quickMccreeKill;
    }

    public String getQuickMccreeKill(){
        return quickMccreeKill;
    }

    @SerializedName("quick_mccree_death")
    public String quickMccreeDeath;

    public void setQuickMccreeDeath(String quickMccreeDeath){
        this.quickMccreeDeath = quickMccreeDeath;
    }

    public String getQuickMccreeDeath(){
        return quickMccreeDeath;
    }

    @SerializedName("quick_mccree_win")
    public String quickMccreeWin;

    public void setQuickMccreeWin(String quickMccreeWin){
        this.quickMccreeWin = quickMccreeWin;
    }

    public String getQuickMccreeWin(){
        return quickMccreeWin;
    }

    @SerializedName("quick_mccree_game_count")
    public String quickMccreeGameCount;

    public void setQuickMccreeGameCount(String quickMccreeGameCount){
        this.quickMccreeGameCount = quickMccreeGameCount;
    }

    public String getQuickMccreeGameCount(){
        return quickMccreeGameCount;
    }

    @SerializedName("quick_mccree_playtime")
    public String quickMccreePlayTime;

    public void setQuickMccreePlayTime(String quickMccreePlayTime){
        this.quickMccreePlayTime = quickMccreePlayTime;
    }

    public String getQuickMccreePlayTime(){
        return quickMccreePlayTime;
    }

    @SerializedName("quick_junkrat_kill")
    public String quickJunkratKill;

    public void setQuickJunkratKill(String quickJunkratKill){
        this.quickJunkratKill = quickJunkratKill;
    }

    public String getQuickJunkratKill(){
        return quickJunkratKill;
    }

    @SerializedName("quick_junkrat_death")
    public String quickJunkratDeath;

    public void setQuickJunkratDeath(String quickJunkratDeath){
        this.quickJunkratDeath = quickJunkratDeath;
    }

    public String getQuickJunkratDeath(){
        return quickJunkratDeath;
    }

    @SerializedName("quick_junkrat_win")
    public String quickJunkratWin;

    public void setQuickJunkratWin(String quickJunkratWin){
        this.quickJunkratWin = quickJunkratWin;
    }

    public String getQuickJunkratWin(){
        return quickJunkratWin;
    }

    @SerializedName("quick_junkrat_game_count")
    public String quickJunkratGameCount;

    public void setQuickJunkratGameCount(String quickJunkratGameCount){
        this.quickJunkratGameCount = quickJunkratGameCount;
    }

    public String getQuickJunkratGameCount(){
        return quickJunkratGameCount;
    }

    @SerializedName("quick_junkrat_playtime")
    public String quickJunkratPlayTime;

    public void setQuickJunkratPlayTime(String quickJunkratPlayTime){
        this.quickJunkratPlayTime = quickJunkratPlayTime;
    }

    public String getQuickJunkratPlayTime(){
        return quickJunkratPlayTime;
    }

    @SerializedName("quick_zarya_kill")
    public String quickZaryaKill;

    public void setQuickZaryaKill(String quickZaryaKill){
        this.quickZaryaKill = quickZaryaKill;
    }

    public String getQuickZaryaKill(){
        return quickZaryaKill;
    }

    @SerializedName("quick_zarya_death")
    public String quickZaryaDeath;

    public void setQuickZaryaDeath(String quickZaryaDeath){
        this.quickZaryaDeath = quickZaryaDeath;
    }

    public String getQuickZaryaDeath(){
        return quickZaryaDeath;
    }

    @SerializedName("quick_zarya_win")
    public String quickZaryaWin;

    public void setQuickZaryaWin(String quickZaryaWin){
        this.quickZaryaWin = quickZaryaWin;
    }

    public String getQuickZaryaWin(){
        return quickZaryaWin;
    }

    @SerializedName("quick_zarya_game_count")
    public String quickZaryaGameCount;

    public void setQuickZaryaGameCount(String quickZaryaGameCount){
        this.quickZaryaGameCount = quickZaryaGameCount;
    }

    public String getQuickZaryaGameCount(){
        return quickZaryaGameCount;
    }

    @SerializedName("quick_zarya_playtime")
    public String quickZaryaPlayTime;

    public void setQuickZaryaPlayTime(String quickZaryaPlayTime){
        this.quickZaryaPlayTime = quickZaryaPlayTime;
    }

    public String getQuickZaryaPlayTime(){
        return quickZaryaPlayTime;
    }

    @SerializedName("quick_soldier_kill")
    public String quickSoldierKill;

    public void setQuickSoldierKill(String quickSoldierKill){
        this.quickSoldierKill = quickSoldierKill;
    }

    public String getQuickSoldierKill(){
        return quickSoldierKill;
    }

    @SerializedName("quick_soldier_death")
    public String quickSoldierDeath;

    public void setQuickSoldierDeath(String quickSoldierDeath){
        this.quickSoldierDeath = quickSoldierDeath;
    }

    public String getQuickSoldierDeath(){
        return quickSoldierDeath;
    }

    @SerializedName("quick_soldier_win")
    public String quickSoldierWin;

    public void setQuickSoldierWin(String quickSoldierWin){
        this.quickSoldierWin = quickSoldierWin;
    }

    public String getQuickSoldierWin(){
        return quickSoldierWin;
    }

    @SerializedName("quick_soldier_game_count")
    public String quickSoldierGameCount;

    public void setQuickSoldierGameCount(String quickSoldierGameCount){
        this.quickSoldierGameCount = quickSoldierGameCount;
    }

    public String getQuickSoldierGameCount(){
        return quickSoldierGameCount;
    }

    @SerializedName("quick_soldier_playtime")
    public String quickSoldierPlayTime;

    public void setQuickSoldierPlayTime(String quickSoldierPlayTime){
        this.quickSoldierPlayTime = quickSoldierPlayTime;
    }

    public String getQuickSoldierPlayTime(){
        return quickSoldierPlayTime;
    }

    @SerializedName("quick_lucio_kill")
    public String quickLucioKill;

    public void setQuickLucioKill(String quickLucioKill){
        this.quickLucioKill = quickLucioKill;
    }

    public String getQuickLucioKill(){
        return quickLucioKill;
    }

    @SerializedName("quick_lucio_death")
    public String quickLucioDeath;

    public void setQuickLucioDeath(String quickLucioDeath){
        this.quickLucioDeath = quickLucioDeath;
    }

    public String getQuickLucioDeath(){
        return quickLucioDeath;
    }

    @SerializedName("quick_lucio_win")
    public String quickLucioWin;

    public void setQuickLucioWin(String quickLucioWin){
        this.quickLucioWin = quickLucioWin;
    }

    public String getQuickLucioWin(){
        return quickLucioWin;
    }

    @SerializedName("quick_lucio_game_count")
    public String quickLucioGameCount;

    public void setQuickLucioGameCount(String quickLucioGameCount){
        this.quickLucioGameCount = quickLucioGameCount;
    }

    public String getQuickLucioGameCount(){
        return quickLucioGameCount;
    }

    @SerializedName("quick_lucio_playtime")
    public String quickLucioPlayTime;

    public void setQuickLucioPlayTime(String quickLucioPlayTime){
        this.quickLucioPlayTime = quickLucioPlayTime;
    }

    public String getQuickLucioPlayTime(){
        return quickLucioPlayTime;
    }

    @SerializedName("quick_dva_kill")
    public String quickDvaKill;

    public void setQuickDvaKill(String quickDvaKill){
        this.quickDvaKill = quickDvaKill;
    }

    public String getQuickDvaKill(){
        return quickDvaKill;
    }

    @SerializedName("quick_dva_death")
    public String quickDvaDeath;

    public void setQuickDvaDeath(String quickDvaDeath){
        this.quickDvaDeath = quickDvaDeath;
    }

    public String getQuickDvaDeath(){
        return quickDvaDeath;
    }

    @SerializedName("quick_dva_win")
    public String quickDvaWin;

    public void setQuickDvaWin(String quickDvaWin){
        this.quickDvaWin = quickDvaWin;
    }

    public String getQuickDvaWin(){
        return quickDvaWin;
    }

    @SerializedName("quick_dva_game_count")
    public String quickDvaGameCount;

    public void setQuickDvaGameCount(String quickDvaGameCount){
        this.quickDvaGameCount = quickDvaGameCount;
    }

    public String getQuickDvaGameCount(){
        return quickDvaGameCount;
    }

    @SerializedName("quick_dva_playtime")
    public String quickDvaPlayTime;

    public void setQuickDvaPlayTime(String quickDvaPlayTime){
        this.quickDvaPlayTime = quickDvaPlayTime;
    }

    public String getQuickDvaPlayTime(){
        return quickDvaPlayTime;
    }

    @SerializedName("quick_mei_kill")
    public String quickMeiKill;

    public void setQuickMeiKill(String quickMeiKill){
        this.quickMeiKill = quickMeiKill;
    }

    public String getQuickMeiKill(){
        return quickMeiKill;
    }

    @SerializedName("quick_mei_death")
    public String quickMeiDeath;

    public void setQuickMeiDeath(String quickMeiDeath){
        this.quickMeiDeath = quickMeiDeath;
    }

    public String getQuickMeiDeath(){
        return quickMeiDeath;
    }

    @SerializedName("quick_mei_win")
    public String quickMeiWin;

    public void setQuickMeiWin(String quickMeiWin){
        this.quickMeiWin = quickMeiWin;
    }

    public String getQuickMeiWin(){
        return quickMeiWin;
    }

    @SerializedName("quick_mei_game_count")
    public String quickMeiGameCount;

    public void setQuickMeiGameCount(String quickMeiGameCount){
        this.quickMeiGameCount = quickMeiGameCount;
    }

    public String getQuickMeiGameCount(){
        return quickMeiGameCount;
    }

    @SerializedName("quick_mei_playtime")
    public String quickMeiPlayTime;

    public void setQuickMeiPlayTime(String quickMeiPlayTime){
        this.quickMeiPlayTime = quickMeiPlayTime;
    }

    public String getQuickMeiPlayTime(){
        return quickMeiPlayTime;
    }

    @SerializedName("quick_ana_kill")
    public String quickAnaKill;

    public void setQuickAnaKill(String quickAnaKill){
        this.quickAnaKill = quickAnaKill;
    }

    public String getQuickAnaKill(){
        return quickAnaKill;
    }

    @SerializedName("quick_ana_death")
    public String quickAnaDeath;

    public void setQuickAnaDeath(String quickAnaDeath){
        this.quickAnaDeath = quickAnaDeath;
    }

    public String getQuickAnaDeath(){
        return quickAnaDeath;
    }

    @SerializedName("quick_ana_win")
    public String quickAnaWin;

    public void setQuickAnaWin(String quickAnaWin){
        this.quickAnaWin = quickAnaWin;
    }

    public String getQuickAnaWin(){
        return quickAnaWin;
    }

    @SerializedName("quick_ana_game_count")
    public String quickAnaGameCount;

    public void setQuickAnaGameCount(String quickAnaGameCount){
        this.quickAnaGameCount = quickAnaGameCount;
    }

    public String getQuickAnaGameCount(){
        return quickAnaGameCount;
    }

    @SerializedName("quick_ana_playtime")
    public String quickAnaPlayTime;

    public void setQuickAnaPlayTime(String quickAnaPlayTime){
        this.quickAnaPlayTime = quickAnaPlayTime;
    }

    public String getQuickAnaPlayTime(){
        return quickAnaPlayTime;
    }
}
