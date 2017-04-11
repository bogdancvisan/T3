package com.vcb.service;

import com.vcb.entity.GridEntity;
import com.vcb.entity.PlayerOEntity;
import com.vcb.entity.PlayerXEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GridService
{
    private GridEntity gridEntity;
    private PlayerXEntity playerXEntity;
    private PlayerOEntity playerOEntity;

    @Autowired
    public GridService(char playerXEntity, char playerOEntity) {
        this.gridEntity.setGrid();
        this.playerXEntity.setX(playerXEntity); // X
        this.playerOEntity.setO(playerOEntity); // O
    }

    private final String getX = "" + playerXEntity + playerXEntity + playerXEntity;
    private final String getO = "" + playerOEntity + playerOEntity + playerOEntity;

    public boolean winConV() {
        String get0 = "";
        String get1 = "";
        String get2 = "";
        char[] getGrid = gridEntity.getGrid();
        for (int i = 0; i < getGrid.length; i++) {
            switch (i % 3) {
                case 0:
                    get0 += getGrid[i];
                    if (get0.equalsIgnoreCase(getX) || get0.equalsIgnoreCase(getO)) {
                        return true;
                    }
                    break;
                case 1:
                    get1 += getGrid[i];
                    if (get1.equalsIgnoreCase(getX) || get1.equalsIgnoreCase(getO)) {
                        return true;
                    }
                    break;
                case 2:
                    get2 += getGrid[i];
                    if (get2.equalsIgnoreCase(getX) || get2.equalsIgnoreCase(getO)) {
                        return true;
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    public boolean winConH() {
        String get0 = "";
        String get1 = "";
        String get2 = "";
        char[] getGrid = gridEntity.getGrid();
        for (int i = 0; i < getGrid.length; i++) {
            switch (i / 3) {
                case 0:
                    get0 += getGrid[i];
                    if (get0.equalsIgnoreCase(getX) || get0.equalsIgnoreCase(getO)) {
                        return true;
                    }
                    break;
                case 1:
                    get1 += getGrid[i];
                    if (get1.equalsIgnoreCase(getX) || get1.equalsIgnoreCase(getO)) {
                        return true;
                    }
                    break;
                case 2:
                    get2 += getGrid[i];
                    if (get2.equalsIgnoreCase(getX) || get2.equalsIgnoreCase(getO)) {
                        return true;
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    public boolean winConD() {
        String get0 = "";
        String get1 = "";
        char[] getGrid = gridEntity.getGrid();
        for (int i = 0; i < getGrid.length; i += 2) {
            if (i % 4 == 0) {
                get0 += getGrid[i];
                if (get0.equalsIgnoreCase(getX) || get0.equalsIgnoreCase(getO)) {
                    return true;
                }
            }
            switch (i / 2) {
                case 1:
                    get1 += getGrid[i];
                    if (get1.equalsIgnoreCase(getX) || get1.equalsIgnoreCase(getO)) {
                        return true;
                    }
                    break;
                case 2:
                    get1 += getGrid[i];
                    if (get1.equalsIgnoreCase(getX) || get1.equalsIgnoreCase(getO)) {
                        return true;
                    }
                    break;
                case 3:
                    get1 += getGrid[i];
                    if (get1.equalsIgnoreCase(getX) || get1.equalsIgnoreCase(getO)) {
                        return true;
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }

}
