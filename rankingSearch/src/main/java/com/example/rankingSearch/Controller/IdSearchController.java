package com.example.rankingSearch.Controller;


import com.example.rankingSearch.Entity.UserEntity;
import com.example.rankingSearch.Service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class IdSearchController {
    private UserService userService;
    @PersistenceContext
    private EntityManager entityManager;


    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("msg", "input your id.");
        return "index";
    }

    @RequestMapping(value="/", method= RequestMethod.POST)
    public String send(@RequestParam("id1")String id, Model model){

        String queryString = "SELECT ranking FROM ranking WHERE id = :userId";
        Query query = entityManager.createNativeQuery(queryString);
        query.setParameter("userId", id);
        Object ranking = query.getSingleResult();

        model.addAttribute("msg", "Hi " + id + "!" + " User Ranking is " + ranking + ".");
        model.addAttribute("id2", id);
        System.out.print(id);
        return "index";
    }
}
