package ch.bbw.yb.cluedo.controller;

import ch.bbw.yb.cluedo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Autowired
    private DataService service;

    @GetMapping("/")
    public String showLists(Model model) {
        System.out.println("ViewController.showPersons");
        model.addAttribute("personlist", service.getPersons());
        model.addAttribute("weaponlist", service.getWeapons());
        model.addAttribute("roomlist", service.getRooms());
        return "GameView";
    }
}
