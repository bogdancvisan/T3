package com.vcb.web;

import com.vcb.service.GridService;
import org.springframework.stereotype.Controller;

@Controller
public class GridController
{

    GridService gridService = new GridService('X', '0');

    public GridController() {
        gridService.winConD();
        gridService.winConH();
        gridService.winConV();
    }

}
