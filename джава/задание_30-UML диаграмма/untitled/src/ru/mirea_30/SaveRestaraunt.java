package ru.mirea_30;

import java.io.Serializable;
import java.util.Arrays;

public class SaveRestaraunt implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] territoriesInfo;
    private String[] resourcesInfo;
    private String[] diplomacyInfo;
    private String[] diplomacyInfos;
    private String[] diplomacyInfoss;
    private String[] diplomacyInfosss;
    public SaveRestaraunt(String[] territoriesInfo, String[] resourcesInfo, String[] diplomacyInfo,String[] diplomacyInfos,String[] diplomacyInfoss,String[] diplomacyInfosss){
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
        this.diplomacyInfos = diplomacyInfos;
        this.diplomacyInfoss = diplomacyInfoss;
        this.diplomacyInfosss = diplomacyInfosss;
    }

    public String[] getTerritoriesInfo() {
        return territoriesInfo;
    }

    public void setTerritoriesInfo(String[] territoriesInfo) {
        this.territoriesInfo = territoriesInfo;
    }

    public String[] getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(String[] resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public String[] getDiplomacyInfo() {
        return diplomacyInfo;
    }
    public String[] getDiplomacyInfos() {
        return diplomacyInfos;
    }
    public String[] getDiplomacyInfoss() {
        return diplomacyInfoss;
    }
    public String[] getDiplomacyInfosss() {
        return diplomacyInfosss;
    }

    public void setDiplomacyInfos(String[] diplomacyInfos) {
        this.diplomacyInfos = diplomacyInfos;
    }
    public void setDiplomacyInfoss(String[] diplomacyInfoss) {
        this.diplomacyInfoss = diplomacyInfoss;
    }

    public void setDiplomacyInfosss(String[] diplomacyInfosss) {
        this.diplomacyInfosss = diplomacyInfosss;
    }


    @Override
    public String toString() {
        return "SavedGame{" +
                "territoriesInfo=" + Arrays.toString(territoriesInfo) +
                ", resourcesInfo=" + Arrays.toString(resourcesInfo) +
                ", diplomacyInfo=" + Arrays.toString(diplomacyInfo) +
                ", diplomacyInfo=" + Arrays.toString(diplomacyInfos) +
                ", diplomacyInfo=" + Arrays.toString(diplomacyInfoss) +
                ", diplomacyInfo=" + Arrays.toString(diplomacyInfosss) +
                '}';
    }
}