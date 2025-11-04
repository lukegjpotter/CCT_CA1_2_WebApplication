package com.lukegjpotter.cct.CCT_CA1_2_WebApplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebsiteController {

    private final Logger logger = LoggerFactory.getLogger(WebsiteController.class);

    @GetMapping("/")
    public String index(@RequestParam(name = "searchterm", required = false, defaultValue = "") final String searchTerm, Model model) {
        logger.debug("Home page request received");
        model.addAttribute("searchTerm", searchTerm);
        return "index";
    }
}
