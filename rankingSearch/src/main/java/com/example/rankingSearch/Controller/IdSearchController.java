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

        return "main_page";
    }

    @RequestMapping(value="/", method= RequestMethod.POST)
    public String send(@RequestParam("input_id")String id, Model model){

        String queryString = "SELECT ranking FROM userid WHERE user_id = :userId";
        Query query = entityManager.createNativeQuery(queryString);
        query.setParameter("userId", id);
        Object ranking = query.getSingleResult();

        //model.addAttribute("msg", "Hi " + id + "!" + " User Ranking is " + ranking + ".");
        model.addAttribute("msg",id + "님의 현재 순위는 " + ranking + "위 입니다.");
        System.out.print(id);
        return "main_page";
    }
}
